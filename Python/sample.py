import tensorflow as tf
from tensorflow.keras import layers, models
import matplotlib.pyplot as plt
import numpy as np


import ssl
ssl._create_default_https_context = ssl._create_unverified_context

print("Downloading and loading the dataset...")

fashion_mnist = tf.keras.datasets.fashion_mnist
(train_images, train_labels), (test_images, test_labels) = fashion_mnist.load_data()

# Define the human-readable class names for the labels (0-9)
class_names = ['T-shirt/top', 'Trouser', 'Pullover', 'Dress', 'Coat',
               'Sandal', 'Shirt', 'Sneaker', 'Bag', 'Ankle boot']

print("Preprocessing the data...")


train_images = train_images / 255.0
test_images = test_images / 255.0



train_images = train_images.reshape((train_images.shape[0], 28, 28, 1))
test_images = test_images.reshape((test_images.shape[0], 28, 28, 1))

print("Building the model architecture...")

model = models.Sequential([

    layers.Conv2D(32, (3, 3), activation='relu', input_shape=(28, 28, 1)),
    layers.MaxPooling2D((2, 2)), # Shrinks the spatial dimensions
    
    layers.Conv2D(64, (3, 3), activation='relu'),
    layers.MaxPooling2D((2, 2)),
    
    layers.Conv2D(64, (3, 3), activation='relu'),

    layers.Flatten(),
    layers.Dense(64, activation='relu'), # Hidden dense layer
    layers.Dense(10, activation='softmax') # Output layer (10 classes), outputs probabilities
])

print("Compiling the model...")
model.compile(optimizer='adam',
              loss='sparse_categorical_crossentropy', # Used when labels are integers
              metrics=['accuracy'])


model.summary()
history = model.fit(train_images, train_labels, 
                    epochs=10, 
                    validation_split=0.2, 
                    batch_size=64)



test_loss, test_acc = model.evaluate(test_images,  test_labels, verbose=2)
print(f"Test Accuracy: {test_acc*100:.2f}%\n")


predictions = model.predict(test_images)


predicted_label = np.argmax(predictions[0])
actual_label = test_labels[0]

print(f"The model predicted: {class_names[predicted_label]}")
print(f"The actual label is: {class_names[actual_label]}")

