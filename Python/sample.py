import tensorflow as tf
from tensorflow.keras import layers, models
import matplotlib.pyplot as plt
import numpy as np

# Add these lines to bypass SSL verification
import ssl
ssl._create_default_https_context = ssl._create_unverified_context

# ==========================================
# 1. DATA COLLECTION & PREPARATION
# ... (rest of the code remains the same)

# ==========================================
# 1. DATA COLLECTION & PREPARATION
# ==========================================
print("Downloading and loading the dataset...")
# Keras has built-in datasets. This fetches the data directly.
fashion_mnist = tf.keras.datasets.fashion_mnist
(train_images, train_labels), (test_images, test_labels) = fashion_mnist.load_data()

# Define the human-readable class names for the labels (0-9)
class_names = ['T-shirt/top', 'Trouser', 'Pullover', 'Dress', 'Coat',
               'Sandal', 'Shirt', 'Sneaker', 'Bag', 'Ankle boot']

# ==========================================
# 2. DATA PREPROCESSING
# ==========================================
print("Preprocessing the data...")
# The images are 28x28 NumPy arrays, with pixel values ranging from 0 to 255.
# We normalize them to a range of 0 to 1 to help the neural network learn faster.
train_images = train_images / 255.0
test_images = test_images / 255.0

# CNNs expect input data in the shape of (batch, height, width, channels).
# Since these are grayscale, the channel is 1. We reshape the arrays to reflect this.
train_images = train_images.reshape((train_images.shape[0], 28, 28, 1))
test_images = test_images.reshape((test_images.shape[0], 28, 28, 1))

# ==========================================
# 3. CHOOSING THE ARCHITECTURE
# ==========================================
print("Building the model architecture...")
# We build a Sequential model, stacking layers one after the other.
model = models.Sequential([
    # Convolutional Base: Extracts features (edges, textures) from the images.
    layers.Conv2D(32, (3, 3), activation='relu', input_shape=(28, 28, 1)),
    layers.MaxPooling2D((2, 2)), # Shrinks the spatial dimensions
    
    layers.Conv2D(64, (3, 3), activation='relu'),
    layers.MaxPooling2D((2, 2)),
    
    layers.Conv2D(64, (3, 3), activation='relu'),
    
    # Classification Head: Flattens the 2D features into 1D array and classifies them.
    layers.Flatten(),
    layers.Dense(64, activation='relu'), # Hidden dense layer
    layers.Dense(10, activation='softmax') # Output layer (10 classes), outputs probabilities
])

# ==========================================
# 4. COMPILING THE MODEL
# ==========================================
print("Compiling the model...")
model.compile(optimizer='adam',
              loss='sparse_categorical_crossentropy', # Used when labels are integers
              metrics=['accuracy'])

# Optional: Print a summary of the model architecture
model.summary()

# ==========================================
# 5. TRAINING THE MODEL
# ==========================================
print("Starting training...")
# We train for 10 epochs and use 20% of the training data for validation.
history = model.fit(train_images, train_labels, 
                    epochs=10, 
                    validation_split=0.2, 
                    batch_size=64)

# ==========================================
# 6. EVALUATION 
# ==========================================
print("\nEvaluating the model on unseen test data...")
test_loss, test_acc = model.evaluate(test_images,  test_labels, verbose=2)
print(f"Test Accuracy: {test_acc*100:.2f}%\n")

# ==========================================
# 7. MAKING PREDICTIONS & VISUALIZING
# ==========================================
# Let's use the trained model to predict the first test image
predictions = model.predict(test_images)

# The model outputs 10 probabilities. np.argmax gets the index of the highest probability.
predicted_label = np.argmax(predictions[0])
actual_label = test_labels[0]

print(f"The model predicted: {class_names[predicted_label]}")
print(f"The actual label is: {class_names[actual_label]}")

# Plotting the training progress (Accuracy over Epochs)
plt.plot(history.history['accuracy'], label='Training Accuracy')
plt.plot(history.history['val_accuracy'], label = 'Validation Accuracy')
plt.xlabel('Epoch')
plt.ylabel('Accuracy')
plt.ylim([0.5, 1])
plt.legend(loc='lower right')
plt.title("Model Training History")
plt.show()