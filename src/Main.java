import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Honolulu_Car_Rental> rentals = new ArrayList<>();
        createCars(cars);
        createRentals(rentals);
        //FileProcessor.updateArrayList(cars);

        runHonoluluCarRentalProgram();

    }

    private static void createRentals(ArrayList<Honolulu_Car_Rental> rentals) {
      Honolulu_Car_Rental customer1 = new Private_Rentals("Steve","Nybobvej",2500, "Valby", 45678798, 13234567, "SteveMcQueen@gmail.com",
              106783593, "6/3/2018");
    }

    public static void createCars(ArrayList<Car> cars) {
        //Family
        Car toyota1 = new Family("Family", "Toyota", "Proace Cyty Verso Shuttle", "Benzin", "06-2021", 5000,
                "5. gear manual", "Yes", "Yes", 7);
        cars.add(toyota1);
        Car toyota2 = new Family("Family", "Toyota", "Verso", "Diesel", "02-2012", 171000,
                "6. gear manual", "Yes", "Yes", 7);
        cars.add(toyota2);
        Car nissan1 = new Family("Family", "Nissan", "Qashqai", "Diesel", "02-2012", 152000,
                "6. gear manual", "Yes", "Yes", 7);
        cars.add(nissan1);
        Car nissan2 = new Family("Family", "Nissan", "e-NV200 Evalia Premium", "Diesel", "05-2019", 46000,
                "6. gear manual", "Yes", "Yes", 7);
        cars.add(nissan2);
        //Luxury
        Car bentley = new Luxury("Luxury", "Bentley", "Continental GT", "Benzin", "02/2013", 40000, 5998, "Yes", "Yes", "Yes", "Black Leather");
        cars.add(bentley);
        Car rollsRoyce1 = new Luxury("Luxury", "Rolls-Royce", "Phantom", "Benzin", "06/2013", 20000, 6749, "Yes", "Yes", "Yes", "White Leather");
        cars.add(rollsRoyce1);
        Car rollsRoyce2 = new Luxury("Luxury", "Rolls-Royce", "Ghost", "Benzin", "05/2017", 22500, 6592, "Yes", "Yes", "Yes", "Brown Leather");
        cars.add(rollsRoyce2);
        Car porsche = new Luxury("Luxury", "Porsche", "Panamera Turbo S Executive", "Benzin", "09/2018", 34200, 3996, "Yes", "Yes", "Yes", "Black Leather");
        cars.add(porsche);
        //Sport
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
        int carMenuChoice = 0;
        while (carMenuChoice != 6) {
            System.out.println("Car menu" +
                    "\n1. Show Catalog \n2. Add car \n3. Remove car \n4. Search for car " +
                    "\n5. Change info \n6. For exit" + "\nIndtast nummer: ");
            carMenuChoice = input.nextInt();
            input.nextLine();
            switch (carMenuChoice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
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
