class Demo 
{
    public int i , j ;
    public Demo setI(int no)
    {       
        this.i = no;
        return this;
    }

    public Demo setJ(int no)
    {   
        this.j = no;
        return this;
    }
    
    public void display()
    {
        System.out.println("Value of i : " + this.i);
        System.out.println("Value of j : " + this.j);
    }


}

public class program992 {

    public static void main(String[] args) {
        Demo dobj1 = new Demo();
        dobj1.setI(11).setJ(21).display();
    }

}
