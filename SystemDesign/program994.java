// observer system design 
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
    public ParkingFloor(int avaliablespots)
    {
        this.avaliablespots = avaliablespots;
    }
}


public class program994 {

        public static void main(String[] args) {
            ParkingObserver displayBoard = new DisplayBoard();
            displayBoard.Update(10);
    }

}
