def display(i_frequency: int):
    for i_cnt in range(1, i_frequency + 1):
        print("Jay Ganesh...")

def main():
    try:
        i_count = int(input("Enter the frequency : "))
        display(i_count)
    except ValueError:
        print("Please enter a valid integer.")

if __name__ == "__main__":
    main()
    