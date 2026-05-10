import numpy as np
import sys 

Arr = np.array([1,2,3,4,5,6,7])
print(Arr)

print(sys.getsizeof(Arr))#byte size of Arr
print(f"Base Address :{id(Arr)}")

ElementAdd = (id(Arr) + 5 * 4)

print(f"Element Address of 5 : {ElementAdd}")