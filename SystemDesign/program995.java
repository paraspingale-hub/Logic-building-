// observer system design 
import java.util.*;
interface ParkingObserver //everything in the interface is by default public and abstract
{
    void Update (int avaliablespots);

}

class DisplayBoard implements ParkingObserver
{

    public void Update (int avaliablespots)
    {
        System.out.println("Display Board : Avaliable Slots : " + avaliablespots);
    }
}

class MobileApplication implements ParkingObserver
{

    public void Update (int avaliablespots)
    {
        System.out.println("Mobile Application : Avaliable Slots : " + avaliablespots);
    }
}

class ParkingFloor
{
    private int avaliablespots;
    private List<ParkingObserver> observers = new ArrayList<ParkingObserver>();
    public ParkingFloor(int avaliablespots)
    {
        this.avaliablespots = avaliablespots;
    }

    public void addobserver(ParkingObserver pobj)
    {
        observers.add(pobj);
    }
    public void removeobserver (ParkingObserver pobj)
    {
        observers.remove(pobj);
    }   
    public void vehicaleparked()
    {
        this.avaliablespots--;
        notifyobservers();
    }   
    public void vehicaleexited()
    {
        this.avaliablespots++;
        notifyobservers();
    }  
    private void notifyobservers()
    {
        for(ParkingObserver pobj : observers)
        {
            pobj.Update(this.avaliablespots);
        }
    }
}


public class program995 {

        public static void main(String[] args) {
            ParkingObserver displayBoard = new DisplayBoard();
            displayBoard.Update(10);

            ParkingObserver mobileApp = new MobileApplication();    
            displayBoard.Update(10);
            displayBoard.Update(20);
            mobileApp.Update(10);
            mobileApp.Update(20);
            System.out.println("---------------------------------------------------");

            displayBoard.vehicaleexited(10);

        
            
    }   

}
