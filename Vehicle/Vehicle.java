public class Vehicle
{
    protected String brand;
    protected int year;
    protected int fuel;
    protected boolean broken;

    public int drive(){ // returns the current fuel state
        if(fuel > 1){
            fuel-=2;
            return fuel;
        }
        else{
            System.out.println("Tá sem gazunila pae");
            return fuel;
        }
    }

    public int fillFuel(int fuel){ // returns the current fuel state
        this.fuel += fuel;
        return this.fuel;
    }

    public void crash(){
        System.out.println("Bateu ;-; \n");
        this.broken = true;
    }

    public boolean showState(){
        if(this.broken){
            System.out.println("Tá quebrado pae \n");
            return broken;
        }
        else{
            System.out.println("Tá Funfando \n");
            return broken;
        }
    }
}
