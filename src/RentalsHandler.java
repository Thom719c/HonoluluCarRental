import java.io.*;
import java.util.*;
import java.util.regex.*;

public class RentalsHandler {
    private ArrayList<Honolulu_Car_Rental> rentals = new ArrayList<>();

    public ArrayList<Honolulu_Car_Rental> createRentals() {
        Honolulu_Car_Rental customerP1 = new Private_Rentals("Private", "Josh", "Nybobvej", 2500, "Valby",
                45678798, 13234567, "Joshie@gmail.com", 106783593, "6/3/2018");
        rentals.add(customerP1);
        Honolulu_Car_Rental customerP2 = new Private_Rentals("Private", "Ethan", "Frederiksberg allé", 2000, "Frederiksberg",
                98460575, 68840780, "Ethanol@Outlook.com", 493666905, "16/8/2009");
        rentals.add(customerP2);
        Honolulu_Car_Rental customerP3 = new Private_Rentals("Private", "Simon", "Jyllingevej", 2720, "Vanløse",
                68477612, 24288629, "Seiso@Hotmail.com", 678330410, "29/4/2012");
        rentals.add(customerP3);
        Honolulu_Car_Rental customerP4 = new Private_Rentals("Private", "Eric", "Egevej", 2600, "Glostrup",
                58133023, 35840200, "BigEric@gmail.com", 812412487, "4/11/1999");
        rentals.add(customerP4);

        Honolulu_Car_Rental customerC1 = new Company_Rentals("Company", "Steve", "Strandvejen", 2900, "Hellerup",
                61131153, 17793808, "SteveMcQueen@gmail.com", "Apple", "Apple street", 76118481, 777114);
        rentals.add(customerC1);
        Honolulu_Car_Rental customerC2 = new Company_Rentals("Company", "Mark", "Vinkelvej", 3520, "Farum",
                99965854, 41427592, "Zucker@Outlook.com", "Facebook", "Facebook street", 96088113, 307441);
        rentals.add(customerC2);
        Honolulu_Car_Rental customerC3 = new Company_Rentals("Company", "Elon", "Nordrupvej", 4100, "Ringsted",
                62771106, 64037345, "MuskyMule@Hotmail.com", "Tesla", "Tesla street", 62862344, 719221);
        rentals.add(customerC3);
        Honolulu_Car_Rental customerC4 = new Company_Rentals("Company", "Jeff", "Hjallesevej", 5000, "Odense C",
                71857745, 29712586, "Besos@gmail.com", "Amazon", "Amazon street", 80633018, 420205);
        rentals.add(customerC4);

        return rentals;
    }

    public void showRentals(Scanner input) {
        System.out.println("1. Show all \n2. Private customer \n3. Company customer \n4. Exit");
        int showType = input.nextInt();
        switch (showType) {
            case 1:
                for (Honolulu_Car_Rental s : rentals) {
                    System.out.println(s + "\n**************************************************");
                }
                break;
            case 2:
                showRentalType("Private");
                break;
            case 3:
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

    public void addRentalMenu(Scanner input) throws IOException {
        System.out.println("1. Private customer");
        System.out.println("2. Company customer");
        System.out.println("3. Update");
        int addType = input.nextInt();
        switch (addType) {
            case 1: //10 inputs
                addPrivate(input);
                break;
            case 2: //11 inputs
                addCompany(input);
                break;
            case 3:
                FileProcessor.updateRentalArrayList(rentals);
                break;
            default:
                System.out.println("Not valid number");
        }
        FileProcessor.writeToRentalFile(rentals);
    }

    public ArrayList<Honolulu_Car_Rental> addPrivate(Scanner input) {
        System.out.println("Enter driver name: ");
        String driverName = input.next();
        System.out.println("Enter address: ");
        String address = input.next();
        System.out.println("Enter zipcode: ");
        int zipCode = input.nextInt();
        System.out.println("Enter city: ");
        String city = input.next();
        System.out.println("Enter mobile phone: ");
        int mobilePhone = input.nextInt();
        System.out.println("Enter phone: ");
        int phone = input.nextInt();
        System.out.println("Enter email: ");
        String email = input.next();
        System.out.println("Enter driver license number: ");
        int driverLicenseNumber = input.nextInt();
        System.out.println("Enter issued license date: ");
        String issuedLicenseDate = input.next();
        Honolulu_Car_Rental privateCustomer = new Private_Rentals("Private", driverName, address, zipCode, city,
                mobilePhone, phone, email, driverLicenseNumber, issuedLicenseDate);
        rentals.add(privateCustomer);
        return rentals;
    }

    public ArrayList<Honolulu_Car_Rental> addCompany(Scanner input) {
        System.out.println("Enter driver name: ");
        String driverName = input.next();
        System.out.println("Enter address: ");
        String address = input.next();
        System.out.println("Enter zipcode: ");
        int zipCode = input.nextInt();
        System.out.println("Enter city: ");
        String city = input.next();
        System.out.println("Enter mobile phone: ");
        int mobilePhone = input.nextInt();
        System.out.println("Enter phone: ");
        int phone = input.nextInt();
        System.out.println("Enter email: ");
        String email = input.next();
        System.out.println("Enter company name: ");
        String companyName = input.next();
        System.out.println("Enter company address: ");
        String companyAddress = input.next();
        System.out.println("Enter company phone number: ");
        int companyPhoneNumber = input.nextInt();
        System.out.println("Enter company registration number (6 digits): ");
        int crn = input.nextInt();
        boolean tester = true;
        while (tester){
            Matcher m = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(String.valueOf(crn)); //Matcher Class - Used to search for the pattern and Pattern Class - Defines a pattern (to be used in a search)
            if (m.find()) {
                break;
            } else {
                System.out.println("Not valid! try again (6 digits number)! ");
                crn = input.nextInt();
            }
        }
        Honolulu_Car_Rental companyCustomer = new Company_Rentals("Private", driverName, address, zipCode, city,
                mobilePhone, phone, email,companyName, companyAddress, companyPhoneNumber, crn);
        rentals.add(companyCustomer);
        return rentals;
    }

    public void removeRental(Scanner input) throws IOException {
        for (int i = 0; i < rentals.size(); i++) {
            System.out.printf("Nr. %-2d: %s %s \n", (i + 1), rentals.get(i).driverName, rentals.get(i).email);
        }
        System.out.println("Enter corresponding number for removing: ");
        int removeChoice = input.nextInt();
        rentals.remove(removeChoice - 1);
        FileProcessor.writeToRentalFile(rentals);
    }

    public ArrayList<Honolulu_Car_Rental> getRentals() {
        return rentals;
    }
    public void setRentals(ArrayList<Honolulu_Car_Rental> rentals) {
        this.rentals = rentals;
    }

    public void editCustomer(Scanner input) throws IOException {
        System.out.println("1. Private customer \n2. Company customer \nEnter number for which you want to change info about: ");
        int editChoice = input.nextInt();
        if (editChoice == 1) {
            showEditCustomerType("Private");
        } else {
            showEditCustomerType("Company");
        }
        System.out.println("Enter number for which customer you want to change info about: ");
        int picked = input.nextInt();

        String[] strArrayPrivate = new String[9];
        String[] strArrayCompany = new String[11];
        String[] sArr = new String[rentals.size()];
        Arrays.fill(sArr, "");

        String s = String.valueOf(rentals.get(picked - 1));
        String[] strArr = s.split("\n");
        switch (rentals.get(picked - 1).customer) {
            case "Private":
                for (int j = 0; j < 9; j++) {
                    sArr[picked - 1] += strArr[j] + "\n";
                    strArrayPrivate = sArr[picked - 1].split("\n");
                }
                for (int i = 0; i < strArrayPrivate.length; i++) {
                    System.out.println("Nr. " + (i + 1) + ": " + strArrayPrivate[i]);
                    String newLastPrivate = strArrayPrivate[i].substring(strArrayPrivate[i].indexOf(": ") + 2);
                    strArrayPrivate[i] = newLastPrivate;
                }
                System.out.println("Enter number for which info you want to change: ");
                int pickInfoP = input.nextInt();
                input.nextLine();
                switch (pickInfoP) {
                    case 1:
                        System.out.println("Enter new driver name: ");
                        strArrayPrivate[0] = input.nextLine();
                        break;
                    case 2:
                        System.out.println("Enter new address: ");
                        strArrayPrivate[1] = input.nextLine();
                        break;
                    case 3:
                        System.out.println("Enter zip code: ");
                        strArrayPrivate[2] = String.valueOf(input.nextInt());
                        break;
                    case 4:
                        System.out.println("Enter new city: ");
                        strArrayPrivate[3] = input.nextLine();
                        break;
                    case 5:
                        System.out.println("Enter new mobile phone: ");
                        strArrayPrivate[4] = String.valueOf(input.nextInt());
                        break;
                    case 6:
                        System.out.println("Enter new phone: ");
                        strArrayPrivate[5] = String.valueOf(input.nextInt());
                        break;
                    case 7:
                        System.out.println("Enter new email: ");
                        strArrayPrivate[6] = input.nextLine();
                        break;
                    case 8:
                        System.out.println("Enter new driver license number: ");
                        strArrayPrivate[7] = String.valueOf(input.nextInt());
                        break;
                    case 9:
                        System.out.println("Enter new issued license date: ");
                        strArrayPrivate[8] = input.next();
                        break;
                }
                Honolulu_Car_Rental privateRental = new Private_Rentals("Private", strArrayPrivate[0], strArrayPrivate[1], Integer.parseInt(strArrayPrivate[2]), strArrayPrivate[3],
                        Integer.parseInt(strArrayPrivate[4]), Integer.parseInt(strArrayPrivate[5]), strArrayPrivate[6], Integer.parseInt(strArrayPrivate[7]), strArrayPrivate[8]);
                rentals.set(picked - 1, privateRental);
                break;
            case "Company":
                for (int j = 0; j < 11; j++) {
                    sArr[picked - 1] += strArr[j] + "\n";
                    strArrayCompany = sArr[picked - 1].split("\n");
                }
                for (int i = 0; i < strArrayCompany.length; i++) {
                    System.out.println("Nr. " + (i + 1) + ": " + strArrayCompany[i]);
                    String newLastCompany = strArrayCompany[i].substring(strArrayCompany[i].indexOf(": ") + 2);
                    strArrayCompany[i] = newLastCompany;
                }
                System.out.println("Enter number for which info you want to change: ");
                int pickInfoC = input.nextInt();
                input.nextLine();
                switch (pickInfoC) {
                    case 1:
                        System.out.println("Enter new driver name: ");
                        strArrayCompany[0] = input.nextLine();
                        break;
                    case 2:
                        System.out.println("Enter new address: ");
                        strArrayCompany[1] = input.nextLine();
                        break;
                    case 3:
                        System.out.println("Enter zip code: ");
                        strArrayCompany[2] = String.valueOf(input.nextInt());
                        break;
                    case 4:
                        System.out.println("Enter new city: ");
                        strArrayCompany[3] = input.nextLine();
                        break;
                    case 5:
                        System.out.println("Enter new mobile phone: ");
                        strArrayCompany[4] = String.valueOf(input.nextInt());
                        break;
                    case 6:
                        System.out.println("Enter new phone: ");
                        strArrayCompany[5] = String.valueOf(input.nextInt());
                        break;
                    case 7:
                        System.out.println("Enter new email: ");
                        strArrayCompany[6] = input.nextLine();
                        break;
                    case 8:
                        System.out.println("Enter new company name: ");
                        strArrayCompany[7] = input.nextLine();
                        break;
                    case 9:
                        System.out.println("Enter new company address: ");
                        strArrayCompany[8] = input.nextLine();
                        break;
                    case 10:
                        System.out.println("Enter new company phone number: ");
                        strArrayCompany[9] = String.valueOf(input.nextInt());
                        break;
                    case 11:
                        System.out.println("Enter new Company registration number (6 digits): ");
                        //strArrayCompany[10] = String.valueOf(input.nextInt());
                        int crn = input.nextInt();
                        boolean tester = true;
                        while (tester){
                            Matcher m = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(String.valueOf(crn)); //Matcher Class - Used to search for the pattern and Pattern Class - Defines a pattern (to be used in a search)
                            if (m.find()) {
                                break;
                            } else {
                                System.out.println("Not valid! try again (6 digits number)! ");
                                crn = input.nextInt();
                            }
                        }
                        strArrayCompany[10] = String.valueOf(crn);
                        break;
                }
                Honolulu_Car_Rental companyRental = new Company_Rentals("Company", strArrayCompany[0], strArrayCompany[1], Integer.parseInt(strArrayCompany[2]), strArrayCompany[3],
                        Integer.parseInt(strArrayCompany[4]), Integer.parseInt(strArrayCompany[5]), strArrayCompany[6], strArrayCompany[7], strArrayCompany[8], Integer.parseInt(strArrayCompany[9]), Integer.parseInt(strArrayCompany[10]));
                rentals.set(picked - 1, companyRental);
                break;
        }
        FileProcessor.writeToRentalFile(rentals);
    }

    public void showEditCustomerType(String rentalType) {
        for (Honolulu_Car_Rental r : rentals) {
            if (r.customer.equals(rentalType)) {
                System.out.printf("Nr. %-2d: %s %s \n", rentals.indexOf(r) + 1, r.driverName, r.email);
            }
        }
    }
}