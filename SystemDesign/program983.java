class ParkingTicket
{
    public int ticketnumber;
    public String vehicleNumber;
    public int floorNumber;
    public int SpotNnumber;
    public String entryTime;

    public ParkingTicket(int ticketnumber, String vehicleNumber, int floorNumber, int SpotNnumber, String entryTime)
    {
        this.ticketnumber = ticketnumber;
        this.vehicleNumber = vehicleNumber;
        this.floorNumber = floorNumber;
        this.SpotNnumber = SpotNnumber;
        this.entryTime = entryTime;
    }

}
class program983
{ 
    public static void main(String A[])
    {
        ParkingTicket pobj1 = new ParkingTicket (11, "MH12AB1234", 3, 5, "09:30 AM");
        ParkingTicket pobj2 = new ParkingTicket (12, "MH12AB0987", 4, 5, "09:50 AM");
   
    }
}