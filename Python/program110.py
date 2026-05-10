def main():
    # Initialize a list (array) of elements
    tech_stack = ["Python", "JavaScript", "C++", "Rust", "Go"]

    print("Starting array traversal...")
    print("-" * 30)

    # Use range() and len() to iterate using indices
    # range(len(tech_stack)) produces: 0, 1, 2, 3, 4
    for i in range(len(tech_stack)):
        # Access the element using the index 'i'
        element = tech_stack[i]
        
        print(f"Index: {i} | Value: {element}")

    print("-" * 30)
    print("Traversal complete.")

# Standard boilerplate to ensure main() runs only when the script is executed
if __name__ == "__main__":
    main()