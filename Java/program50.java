
import java.util.Scanner;

class Dispaly 
{
    public void Display(int iNo)
    {   
     int iCnt = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
    {
        if((iNo % iCnt) == 0)
        {
            System.out.println(iCnt);
        }   
    }   

    }
}

public class program50 { 
    public static void main(String[] args) { 
        Scanner sobj = new Scanner(System.in);  
        int iValue = 0;  
        System.out.println("Enter the nos "); 
        
        
        iValue = sobj.nextInt();
        
        sobj.close(); 
    } 
} 