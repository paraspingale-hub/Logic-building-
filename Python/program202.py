try:
    fd1 = open("PPA.txt", "r")
    print("fd1 :", fd1.fileno())

    fd2 = open("LB.txt", "r")
    print("fd2 :", fd2.fileno())

    fd3 = open("Demo.txt", "r")
    print("fd3 :", fd3.fileno())

    fd1.close()
    fd2.close()
    fd3.close()

except FileNotFoundError as e:
    print("Error:", e)