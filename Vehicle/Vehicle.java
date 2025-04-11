import java.time.LocalDateTime;

public class Vehicle
{
    protected String brand;
    protected int year;
    protected int fuel;
    protected boolean broken;
    protected int health;

    public int drive(){ // returns the current fuel state
        if(this.fuel <= 0){
            return fuel;
        }
        if(this.health <= 0){
            return -3;
        }
            this.health -= getLastDigitOfTime();

            fuel-=2;
            return fuel;
    }

    public int fillFuel(int fuel){ // returns the current fuel state
        this.fuel += fuel;
        return this.fuel;
    }

    public void repair(){
        this.health = 50;
    }

    public void 
    showStatus(){
        System.out.println("Brand: "+this.brand);
        System.out.println("\nYear: "+this.year);
        System.out.println("\nCurrent Fuel: "+this.fuel);
        if(this.health <= 0) this.health = 0;
        System.out.println("\nDurability: "+this.health);
    }

    public boolean showState(){
        return this.broken;
    }

    private int getLastDigitOfTime(){
        LocalDateTime now = LocalDateTime.now();
        
        String dateTimeString = now.toString();
        
        char lastChar = dateTimeString.charAt(dateTimeString.length() - 1);
        
        int lastDigit = Character.getNumericValue(lastChar);

        return lastDigit;
    }
}
