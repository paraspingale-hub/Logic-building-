class Demo 
{
    public int i , j ;
    public Demo fun()
    {
        this.i = 11;
        return this;
    }

    public int gun()
    {
        return 11;
    }



}

public class progeam989 {

    Demo dobj1 = new Demo();
    int iRet = dobj1.fun().gun();
    

    
}
