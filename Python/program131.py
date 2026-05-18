def average(arr):
    total = sum(arr)
    size = len(arr)
    
    # In Python 3, this automatically returns a float! No typecasting needed.
    return total / size  

    # Note: If you WANTED C-style integer truncation in Python, you would use floor division: '//'
    # return total // size 

if __name__ == "__main__":
    ptr = [10, 20, 30] # Example data
    ans = average(ptr)
    print(f"Average is : {ans}")