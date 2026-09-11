class Demo 
{
    public int i , j ;
    public Demo fun()
    {
        return this;
    }

    public int gun()
    {
        return 11;
    }



}

public class progeam988 {

    public static void main(String[] args) {
        Demo dobj1 = new Demo();
        int iRet = dobj1.fun().gun();
        System.out.println("Value of iRet : " + iRet);
    }

    
}
