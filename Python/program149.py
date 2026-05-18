if __name__ == "__main__":
    value1 = 11
    value2 = 21

    print(f"Before swap : {value1} {value2}")

    # The Pythonic Way to Swap
    # Python evaluates the right side as a tuple (21, 11), 
    # then unpacks it into the left side seamlessly.
    value1, value2 = value2, value1

    print(f"After swap : {value1} {value2}")