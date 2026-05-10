def main():
    # Our "array"
    data = ["Alpha", "Beta", "Gamma", "Delta"]
    
    # Initialize our manual pointer (index)
    pointer = 0
    
    print("Beginning traversal (Press Ctrl+C to stop if it hangs)...")
    
    # LOGICAL ERROR: We check the length, but we never change the pointer
    # This loop will run forever because pointer is always 0
    while pointer < len(data):
        # Always accesses data[0]
        current_element = data[pointer]
        print(f"Pointer at index {pointer}: {current_element}")
        
        # ERROR: Missing 'pointer += 1' here!
        # Because the pointer never moves, it stays at 0, 
        # and 0 is always less than the length of the list.

if __name__ == "__main__":
    main()