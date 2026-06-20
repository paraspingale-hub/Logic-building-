import java.util.Scanner;

public class program2 {
    
    public float  addition(float Nos1 , float Nos2 )
    {   
        float add = 0.0f;

        if(Nos1 <0.0 )
        {
            Nos1 = -Nos1;
        }

        if(Nos2 <0.0 )
        {
            Nos2 = -Nos2;
        }

        add = Nos1 + Nos2;

        return add ;
    } 

    public static void main(String[] args)
    {
        Scanner sobj = new Scanner (System.in);
        System.out.println("Enter your first nos");
        float Fnos1 = sobj.nextFloat();
        System.out.println("Enter your sec nos");
        float Fnos2 = sobj.nextFloat();

        program2 pobj = new program2();
        float Result = 0.0f;
        Result = pobj.addition(Fnos1 , Fnos2);

        System.out.println(Result);
        

    }
}
