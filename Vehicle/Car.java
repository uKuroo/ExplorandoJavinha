public class Car extends Vehicle
{
    private int doors;

    public Car(String brand, int year, int fuel, int doors){
        this.brand = brand;
        this.year = year;
        this.fuel = fuel;
        this.doors = doors;
        this.health = 50;
        this.broken = false;
    }
}
