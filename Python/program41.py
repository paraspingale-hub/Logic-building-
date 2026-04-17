def Display(iCnt):
     
    for i in range (2,iCnt+1,2):
        print(i)
    print()
def main():
    a = int(input("Enter the limit "))
    Display(a)
    
main()