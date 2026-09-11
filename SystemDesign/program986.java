// builder system pattern 
class ParkingTicket
{
    private int ticketnumber;
    private String vehicleNumber;
    private int floorNumber;
    private int SpotNnumber;
    private String entryTime;

    /*public ParkingTicket(int ticketnumber, String vehicleNumber, int floorNumber, int SpotNnumber, String entryTime)
    {
        this.ticketnumber = ticketnumber;
        this.vehicleNumber = vehicleNumber;
        this.floorNumber = floorNumber;
        this.SpotNnumber = SpotNnumber;
        this.entryTime = entryTime;
    }*/

    private ParkingTicket(Builder builder)
        {
            this.ticketnumber = builder.ticketnumber;
            this.vehicleNumber = builder.vehicleNumber;
            this.entryTime = builder.entryTime;
            this.floorNumber = builder.floorNumber;
            this.SpotNnumber = builder.SpotNnumber;
        }

    public void displayTicketDetails()
    {
        System.out.println("Ticket Number: " + this.ticketnumber);
        System.out.println("Vehicle Number: " + this.vehicleNumber);
        System.out.println("Floor Number: " + this.floorNumber);
        System.out.println("Spot Number: " + this.SpotNnumber);
        System.out.println("Entry Time: " + this.entryTime);
    }
public static class Builder
{
    private int ticketnumber;
    private String vehicleNumber;
    private int floorNumber;
    private int SpotNnumber;
    private String entryTime;   

    public Builder setticketnumber(int ticketnumber)
    {
        this.ticketnumber = ticketnumber;
        return this;
    }

    public Builder setvehicleNumber(String vehicleNumber)
    {
        this.vehicleNumber = vehicleNumber;
        return this;
    }

    public Builder setfloorNumber(int floorNumber)
    {
        this.floorNumber = floorNumber;
        return this;
    }

    public Builder setSpotNnumber (int SpotNnumber)

    {
        this.SpotNnumber = SpotNnumber;
        return this;
    }

    public Builder setentryTime(String entryTime)
    {
        this.entryTime = entryTime;
        return this;
    }
    
    public ParkingTicket build()
    {
        return new ParkingTicket (this);
    }
}
}
class program986

{ 
    public static void main(String A[])
    {
        
    }
}