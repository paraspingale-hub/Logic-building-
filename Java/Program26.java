class program23
{
    public static void main (String A[])
    {
        int iNo = 0;
        program23 idobj = new program23();
        idobj.display(iNo);
        
    }

    public void display (int iNo)
    {
        if (iNo <= 0)
        {
            System.out.println("Please enter positive number");
        }
        else
        {
        for (int i = 1; i<iNo ;i++)
            {
                System.out.println("Jay Ganesh....");
            }
        }

    }
}