def display():
    # range(start, stop, step)
    for i_cnt in range(5, 0, -1):
        print(f"{i_cnt}\t", end="")
    print()

if __name__ == "__main__":
    display()