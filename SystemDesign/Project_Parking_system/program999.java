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





//////////////////////////////////////////////////////////////////////////////////////////////////
// Step 3 :: VehicalFactory creation 
// used to create VehicalFactory class
// (Concetps : Factory Design Pattern, Polymorphism ,Encapsulation)
// it is used to centralised the creation of the vehicle objects 
/////////////////////////////////////////////////////////////////////////////////////////////////


// vehicalFactory -> vehicaltype & vehicalNumber -> vehical object created -> observer degin pattern  -> continues
// Creates and return the desired class object (car bike truck) based on the input parameters
class vehicalFactory
{
    public static vehical createVehical(VehicalType type , String number)
    {
     switch(type)
     {
        case BIKE:
            return new Bike(number);
        case CAR:
            return new Car(number);
        case TRUCK:
            return new Truck(number);
        default:
            throw new IllegalArgumentException("Invalid vehical type");
     }
    }
}



//////////////////////////////////////////////////////////////////////////////////////////////////
// Step 4 :: Parking Spot creation 
// used to create Parking spo hairarchy 
// (Concetps : Encapsulation, Polymorphism ,Abstrction, inheritance)
// it is used to create an hairarchy for the different types of 
// parking spots which will be used to park the vehical
/////////////////////////////////////////////////////////////////////////////////////////////////


// entry gate -> info gather -> car objet -> parkingspot invoke and check for the spot -> observer degin pattern  -> continues
abstract class ParkingSpot
{
    //PRIMARY KEY
    //unique number for parking spot 
    private int spotNumber;
    private SpotType spotType;
    private boolean occupied; 
    // inheritance concept in composition form 
    private vehical vehicle; //stores info about the vehicle parked in the spot
    

    // Parametersied Constructor
    public ParkingSpot(int spotNumber , SpotType spotType)
    {
        //initialised with default valuse (charateristics)
        this.spotNumber = spotNumber;
        this.spotType = spotType;
        this.occupied = false; // initially the spot is not occupied
        this.vehicle = null; // initially no vehicle is parked (it will be new car , new bike , new truck but we dont know right now what will be there ) 
    }

    //getter methods
    public int getspotNumber()
    {
        return this.spotNumber;
    }
    public SpotType getspotType()
    {
        return this.spotType;
    }
    public boolean getisoccupied()
    {
        return this.occupied;
    }
    public vehical getvehicle()
    {
        return this.vehicle;
    }

//it is used to park the vehicle 
//parkVehicle(vehical vehicle) first vehicle is vlass and next vehicle is obj name 

//factoryclass -> find the parking spot -> class the obj of parking spot 
    public void parkVehicle(vehical vehicle)
    {

        //handling the spot occupied or not occupied part
        if(this.occupied == true)
        {
            throw new RuntimeException("Parking spot is already occupied ");
        }
        else
        {
            this.vehicle = vehicle;
            this.occupied = true; // the spot is occupied by the vehicle r
        }
    }
    public vehical removeVehicle()
    {
        if (!this.occupied)
        {
            vehical removedVehicle = this.vehicle; // 
            this.vehicle = null;   // vehicle left the spot 
            this.occupied = false; // parking spot got empty (vehicle removed)
            return removedVehicle;
        }
        else
        {
            throw new RuntimeException("Parking spot is already empty");
        }
        
        
    }

}













public class program999 {
    public static void main (String a[])
    {


    }
}
