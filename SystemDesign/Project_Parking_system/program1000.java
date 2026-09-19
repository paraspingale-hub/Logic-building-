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

import java.util.ArrayList;
import java.util.List;

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
        if (this.occupied)
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
    // this method decide wheter we can park it in the desired apot or not like car 
    // should be parked in car spot only not in bike or truck
    public abstract boolean canFitVehicle(vehical vehicle);

    public void display()
        {
            System.out.println("Spot :" + spotNumber + "[" + spotType + "]");

            if(this.occupied)
            {
                System.out.println("Occupied by : " + vehicle.getVehicleNumber());
            }
            else 
            {
                System.out.println("Spot is avaible ");
            }
        }
}//end of parkingspot class

class BikeSpot extends ParkingSpot
{
    public BikeSpot(int spotnumber)
    {
        super(spotnumber, SpotType.BIKE);
    }
@Override
    public boolean canFitVehicle(vehical vehicle)
    {
        return vehicle.getVehicalType() == VehicalType.BIKE;
    }
}



class CarSpot extends ParkingSpot
{
    public CarSpot(int spotnumber)
    {
        super(spotnumber , SpotType.CAR);
    }
@Override
    public boolean canFitVehicle(vehical vehicle)
    {
        return vehicle.getVehicalType() == VehicalType.CAR;
    }
}



class TruckSpot extends ParkingSpot
{
    public TruckSpot(int spotnumber)
    {
        super(spotnumber , SpotType.TRUCK);
    }
@Override
    public boolean canFitVehicle(vehical vehicle)
    {
        return vehicle.getVehicalType() == VehicalType.TRUCK;
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Step 5 :: Parking observer creation (Observer pattern) 
// used to observe the changes (update display class) made in the parking slot changes  
// (Concetps : Observer dsystem design pattern)
//
/////////////////////////////////////////////////////////////////////////////////////////////////



interface parkingObserver
{
    void update();
}


//////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Step 6 :: ParkingFloor Class
// used to manage the parking floor 
// (Concetps : Obj management , Composition (inherithence ) , arraylist )
//
/////////////////////////////////////////////////////////////////////////////////////////////////

class ParkingFloor
{
    //Unique Floor number (floor1 , floor 2 , floor 3 etc )
    private int floorNumber;

    //collection of all parking spots 
    private List<ParkingSpot> parkingSpots;

    //collection of observers registerd for the floor 
    private List<parkingObserver> observer;
    public ParkingFloor(int floorNumber)
    {
        this.floorNumber = floorNumber;
        this.parkingSpots = new ArrayList<>();
        this.observer = new ArrayList<>();
    }

    public int getFloorNumber()
    {
        return this.floorNumber;
    }
    public void addParkingSpot(ParkingSpot spot)
    {
        this.parkingSpots.add(spot);
    }
    public void addobserver(parkingObserver observer)
    {
        this.observer.add(observer);
    }

    private void notifyObservers()
    {
        for (parkingObserver observer : this.observer)
        {
            observer.update();
        }
    }

    public ParkingSpot findAlavalblespot()
    {
        
    }
}



public class program1000 {
    public static void main (String a[])
    {


    }
}
