import java.util.Scanner;

public class Main{

    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Inicio do programa pae, decida\nbrand, year, fuel, doors for a car");

        String brand = reader.nextLine();
        int year = reader.nextInt();
        int fuel = reader.nextInt();
        int doors = reader.nextInt();

        Car car1 = new Car(brand, year, fuel, doors);

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("==============================");

        boolean parar = false;
        int currentFuel;

        do{
            System.out.println("Se vira:\n1 - Drive\n2 - fillFuel\n3 - repair\n4 - show Status");
            switch (reader.nextInt()) {
                case 0:
                    parar = true;
                    break;
                case 1:
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    currentFuel = car1.drive();
                    if(currentFuel == -3) { System.out.println("O Carro quebrou...\n"); break;}
                    if(currentFuel <= 0) { System.out.println("O carro está sem gasolina...\n"); break; }
                    
                    System.out.println("Dirigiu, agora está com essa gasolina: " + currentFuel + "\n");                        
                    break;
                case 2:
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("Insira a quantidade de gasolina a ser abastecida\n");
                    currentFuel = car1.fillFuel(reader.nextInt());
                    System.out.println("Reabastecido, agora está com essa gasolina: " + currentFuel);
                    break;
                case 3:
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    car1.repair();
                    System.out.println("Carro Reparado, ufa\n");
                    break;
                case 4:
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    car1.showStatus();
                    break;
                
                }
                System.out.println("==============================");

        }while(!parar);

        System.out.println("Programa finalizado");

    }
}
