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
        Honolulu_Car_Rental customerP1 = new Private_Rentals("Josh","Nybobvej",2500, "Valby", 45678798, 13234567, "Joshie@gmail.com",
                106783593, "6/3/2018");
        Honolulu_Car_Rental customerP2 = new Private_Rentals("Ethan","Frederiksberg allé",2000, "Frederiksberg", 98460575, 68840780, "Ethanol@Outlook.com",
                493666905, "16/8/2009");
        Honolulu_Car_Rental customerP3 = new Private_Rentals("Simon","Jyllingevej",2720, "Vanløse", 68477612, 24288629, "Seiso@Hotmail.com",
                678330410, "29/4/2012");
        Honolulu_Car_Rental customerP4 = new Private_Rentals("Eric","Egevej",2600, "Glostrup", 58133023, 35840200, "BigEric@gmail.com",
                812412487, "4/11/1999");

        Honolulu_Car_Rental customerC1 = new Company_Rentals("Steve","Strandvejen",2900, "Hellerup", 61131153, 17793808, "SteveMcQueen@gmail.com",
                "Apple", "Apple street", 76118481, 777114);
        Honolulu_Car_Rental customerC2 = new Company_Rentals("Mark","Vinkelvej",3520, "Farum", 99965854, 41427592, "Zucker@Outlook.com",
                "Facebook", "Facebook street", 96088113, 307441);
        Honolulu_Car_Rental customerC3 = new Company_Rentals("Elon","Nordrupvej",4100, "Ringsted", 62771106, 64037345, "MuskyMule@Hotmail.com",
                "Tesla", "Tesla street", 62862344, 719221);
        Honolulu_Car_Rental customerC4 = new Company_Rentals("Jeff","Hjallesevej",5000, "Odense C", 71857745, 29712586, "Besos@gmail.com",
                "Amazon", "Amazon street", 80633018, 420205);
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
        Car porsche1 = new Luxury("Luxury", "Porsche", "Panamera Turbo S Executive", "Benzin", "09/2018", 34200, 3996, "Yes", "Yes", "Yes", "Black Leather");
        cars.add(porsche1);
        //Sport
        Car ford1 = new Sport("Sport", "Ford Mustang", "Shelby GT500R Eleanor", "Benzin", "12/1967", 13000, "Yes", 550);
        cars.add(ford1);
        Car porsche2 = new Sport("Sport", "Porsche", "911 Turbo S", "Benzin", "06/2014", 35000, "Yes", 560);
        cars.add(porsche2);
        Car nissan3 = new Sport("Sport", "Nissan", "GT-R R35", "Benzin", "12/2021", 12000, "No", 565);
        cars.add(nissan3);
        Car mcLaren = new Sport("Sport", "McLaren", "700S", "Benzin", "05/2018", 1000, "No", 720);
        cars.add(mcLaren);
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
