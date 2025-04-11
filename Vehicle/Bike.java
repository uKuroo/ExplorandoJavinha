public class Bike extends Vehicle
{
    private boolean rearViewState;

    public Bike(String brand, int year, int fuel){
        this.brand = brand;
        this.year = year;
        this.fuel = fuel;
        this.broken = false;
    }
}
