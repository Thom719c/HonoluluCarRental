import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        CarHandler carHandler = new CarHandler();
        RentalsHandler rentalsHandler = new RentalsHandler();
        carHandler.createCars();
        rentalsHandler.createRentals();
        FileProcessor.updateArrayList(carHandler.getCars());

        runHonoluluCarRentalProgram(carHandler, rentalsHandler);
    }

    public static void runHonoluluCarRentalProgram(CarHandler carHandler, RentalsHandler rentalsHandler) throws IOException {
        Scanner input = new Scanner(System.in);
        int honoluluCarRentalChoice = 0;
        while (honoluluCarRentalChoice != 3) {
            System.out.println("Honolulu Car Rental menu" +
                    "\n1. Cars \n2. Rentals \n3. For exit" + "\nIndtast nummer: ");
            honoluluCarRentalChoice = input.nextInt();
            input.nextLine();
            switch (honoluluCarRentalChoice) {
                case 1:
                    cars(carHandler);
                    break;
                case 2:
                    rentals(rentalsHandler);
                    break;
                default:
                    System.out.println();
            }
        }
    }

    public static void cars(CarHandler carHandler) throws IOException {
        Scanner input = new Scanner(System.in);


        //Switch menu
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

    public static void rentals(RentalsHandler rentalsHandler) throws IOException {
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
                    rentalsHandler.showRentals(input);
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
