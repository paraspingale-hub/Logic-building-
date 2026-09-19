/*
Parking Lot Automation System 
________________________________________________________________________
Step1  :: Create required enums/ imports
Step2  :: Vehical heirarchy creation 
Step3  :: VehicalFactory creation 
step4  :: Parking Spot creation
step5  :: Parking observer creation (Observer pattern)
step6  :: ParkingFloor Class
step7  :: ParkingDisplay Board (Observer pattern)
step8  :: ParkingStratergy Class (Stratergy pattern)
step9  :: PricingStratergy Class (Stratergy pattern) 
step10 :: PaymentStratergy Class (Stratergy pattern) 
step11 :: Parking ticket Class 
step12 :: EntryGate Class
step13 :: ExitGate Class
step14 :: ParkingLot Class (singleton pattern) 
step15 :: MAIN CLASS (controller) <model veiw controller pattern>
________________________________________________________________________

*/

//////////////////////////////////////////////////////////////////////////////////////////////////
// Step 1 :: it is used to create fixed constants which are required
// through out the projects
/////////////////////////////////////////////////////////////////////////////////////////////////

// Represents the different types of vehicals supported by the projects
enum VehicalType
{
    BIKE , 
    CAR ,
    TRUCK
}

// Represents the different types of parking spots supported by the projects
enum SpotType
{
    BIKE , 
    CAR ,
    TRUCK
}
// Represents the current state of the parking Ticket
enum TicketStatus
{
    ACTIVE ,
    CLOSED
}



//////////////////////////////////////////////////////////////////////////////////////////////////
// Step 2 :: Vehical heirarchy creation 
// used to create multiple types of class which represents 
// the different types of the vehicles 
// (Concetps : Abstract class, heirarchichal Inheritance, Polymorphism ,Encapsulation)
/////////////////////////////////////////////////////////////////////////////////////////////////


// Class which represnt a generic vehical type
abstract class vehical 
{
     // Abstracted Hidden data of class 

    private String vehicleNumber;
    private VehicalType vehicalType;  // same name veriable 


    // entrygate class  -> vehicaltype -> vehicalNumber -> Factory class -> car object created which inherite vehical class -> observer degin pattern  -> continues 
    public vehical (String vehicleNumber, VehicalType vehicalType)
    {
        this.vehicleNumber = vehicleNumber; 
        this.vehicalType = vehicalType; 
    }


    // every cocnrete class will provide its own defination 
    // getter method is compulsory to access the private veriable of the class
    // concrete Getter method 
    
    public String getVehicleNumber()
    {
        return this.vehicleNumber;
    }
    public VehicalType getVehicalType()
    {
        return this.vehicalType;
    }
    
    // pure virtual method which will be overrided by the concrete class
    public abstract void display();


}


// Creating 3 class which are the types of the vehical whcih will inherit the vehical class and give the number and types of the vehical 

class Bike extends vehical
{
    public Bike(String vehicleNumber)
    {
        // vehicle constructor 
        super(vehicleNumber, VehicalType.BIKE);
    }
    //Method overridding 
    @Override
    public void display()
    {
        System.out.println("Bike : " + getVehicleNumber());
    }
}

class Car extends vehical
{
    public Car(String vehicleNumber)
    {
        // vehicle constructor 
        super(vehicleNumber, VehicalType.CAR);
    }
    //Method overridding 
    @Override
    public void display()
    {
        System.out.println("Car : " + getVehicleNumber());
    }
}

class Truck extends vehical
{
    public Truck(String vehicleNumber)
    {
        // vehicle constructor 
        super(vehicleNumber, VehicalType.TRUCK);
    }
    //Method overridding 
    @Override
    public void display()
    {
        System.out.println("Truck : " + getVehicleNumber());
    }
}
//can add more types by adjusting the enum and and adding the vehicaltypes (extencilble)

public class program997 {
    public static void main (String a[])
    {


    }
}
