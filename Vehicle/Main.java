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

        System.out.println("==============================");

        boolean parar = false;
        int currentFuel;

        do{
            System.out.println("Se vira:\n1 - Drive\n2 - fillFuel\n3 - Crash\n4 - show Status\n5 - show Status");
            switch (reader.nextInt()) {
                case 0:
                    parar = true;
                    break;
                case 1:
                    if(car1.showState()){
                        System.out.println("\n\n\n\n\n\n\n\n\nInfelizmente o Carro está quebrado, incapaz de ser conduzido\n");
                    }else{
                        currentFuel = car1.drive();
                        System.out.println("\n\n\n\n\n\n\n\n\nDirigiu, agora está com essa gasolina: " + currentFuel + "\n");                        
                    }
                    break;
                case 2:
                    System.out.println("Insira a quantidade de gasolina a ser abastecida\n");
                    currentFuel = car1.fillFuel(reader.nextInt());
                    System.out.println("\n\n\n\n\n\n\n\n\nReabastecido, agora está com essa gasolina: " + currentFuel);
                    break;
                case 3:
                    if(car1.showState){
                        System.out.println("\n\n\n\n\n\n\n\n\nQuebrar duas vezes guerreiro? num compensa\n");
                    }else{
                        car1.Crash();
                        System.out.println("\n\n\n\n\n\n\n\n\nAh não... O carro bateu.\n");
                    }
                    break;
            }
            System.out.println("==============================");

        }while(!parar);

        System.out.println("Programa finalizado");

    }
}
