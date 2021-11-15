import java.io.*;
import java.util.*;

public class RentalsHandler {
    private ArrayList<Honolulu_Car_Rental> rentals = new ArrayList<>();


    public ArrayList<Honolulu_Car_Rental> createRentals() {
        Honolulu_Car_Rental customerP1 = new Private_Rentals("Private","Josh","Nybobvej",2500, "Valby",
                45678798, 13234567, "Joshie@gmail.com", 106783593, "6/3/2018");
        rentals.add(customerP1);
        Honolulu_Car_Rental customerP2 = new Private_Rentals("Private","Ethan","Frederiksberg allé",2000, "Frederiksberg",
                98460575, 68840780, "Ethanol@Outlook.com", 493666905, "16/8/2009");
        rentals.add(customerP2);
        Honolulu_Car_Rental customerP3 = new Private_Rentals("Private","Simon","Jyllingevej",2720, "Vanløse",
                68477612, 24288629, "Seiso@Hotmail.com", 678330410, "29/4/2012");
        rentals.add(customerP3);
        Honolulu_Car_Rental customerP4 = new Private_Rentals("Private","Eric","Egevej",2600, "Glostrup",
                58133023, 35840200, "BigEric@gmail.com", 812412487, "4/11/1999");
        rentals.add(customerP4);

        Honolulu_Car_Rental customerC1 = new Company_Rentals("Company","Steve","Strandvejen",2900, "Hellerup",
                61131153, 17793808, "SteveMcQueen@gmail.com", "Apple", "Apple street", 76118481, 777114);
        rentals.add(customerC1);
        Honolulu_Car_Rental customerC2 = new Company_Rentals("Company","Mark","Vinkelvej",3520, "Farum",
                99965854, 41427592, "Zucker@Outlook.com", "Facebook", "Facebook street", 96088113, 307441);
        rentals.add(customerC2);
        Honolulu_Car_Rental customerC3 = new Company_Rentals("Company","Elon","Nordrupvej",4100, "Ringsted",
                62771106, 64037345, "MuskyMule@Hotmail.com", "Tesla", "Tesla street", 62862344, 719221);
        rentals.add(customerC3);
        Honolulu_Car_Rental customerC4 = new Company_Rentals("Company","Jeff","Hjallesevej",5000, "Odense C",
                71857745, 29712586, "Besos@gmail.com", "Amazon", "Amazon street", 80633018, 420205);
        rentals.add(customerC4);

        return rentals;
    }
    public void showRentals(Scanner input) throws IOException {
        System.out.println("1. Show all \n2. Private customer \n3. Company customer \n4. Exit");
        int showType = input.nextInt();
        switch (showType) {
            case 1: //10 inputs
                for (Honolulu_Car_Rental s : rentals) {
                    System.out.println(s + "\n**************************************************");
                }
                //FileProcessor.writeToRentalFile(rentals);
                break;
            case 2: //11 inputs
                showRentalType("Private");

                break;
            case 3: //8 inputs
                showRentalType("Company");
                break;
            default:
        }
    }
    public void showRentalType(String rentalType) {
        int tempI = 1;
        for (Honolulu_Car_Rental s : rentals) {
            if (s.customer.equals(rentalType)) {
                System.out.printf("Nr. %-2d: %s %s \n", tempI, s.driverName, s.email);
                tempI++;
            }
        }
    }
}
