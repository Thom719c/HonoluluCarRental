import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Honolulu_Car_Rental> rentals = new ArrayList<>();
        //createCars(cars);
        //createRentals(rentals);
        //FileProcessor.updateArrayList(cars);

        runHonoluluCarRentalProgram();

    }

    public static void runHonoluluCarRentalProgram() {
        Scanner input = new Scanner(System.in);
        int honoluluCarRentalChoice = 0;
        while (honoluluCarRentalChoice != 3) {
            System.out.println("Honolulu Car Rental menu" +
                    "\n1. Cars \n2. Rentals \n3. For exit" + "\nIndtast nummer: ");
            honoluluCarRentalChoice = input.nextInt();
            input.nextLine();
            switch (honoluluCarRentalChoice) {
                case 1:
                    cars();
                    break;
                case 2:
                    rentals();
                    break;
                default:
                    System.out.println();
            }
        }
    }

    public static void cars() {
        Scanner input = new Scanner(System.in);
        CarHandler carHandler = new CarHandler();
        carHandler.createCars();
        int carMenuChoice = 0;
        while (carMenuChoice != 6) {
            System.out.println("Car menu" +
                    "\n1. Show Catalog \n2. Add car \n3. Remove car \n4. Search for car " +
                    "\n5. Change info \n6. For exit" + "\nIndtast nummer: ");
            carMenuChoice = input.nextInt();
            input.nextLine();
            switch (carMenuChoice) {
                case 1:
                    carHandler.showCars(input);
                    break;
                case 2:
                    carHandler.addCarMenu(input);
                    break;
                case 3:
                    carHandler.removeCar(input);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println();
            }
        }
    }

    public static void rentals() {
        Scanner input = new Scanner(System.in);
        int rentalChoice = 0;
        while (rentalChoice != 6) {
            System.out.println("Rental menu" +
                    "\n1. Add private customer \n2. Add Company customer \n3. Create contract " +
                    "\n4. Change info \n5. Search after contract \n6. For exit" + "\nIndtast nummer: ");
            rentalChoice = input.nextInt();
            input.nextLine();
            switch (rentalChoice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 4:
                    //Todo Should we overwrite and create new contract if there is wrong info (case 4 change info)
                    break;
                case 5:
                    break;
                default:
                    System.out.println();
            }
        }
    }
}
