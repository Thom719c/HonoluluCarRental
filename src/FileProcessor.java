import java.io.*;
import java.util.*;

public class FileProcessor {
    public static void updateCarArrayList(ArrayList<Car> cars) throws FileNotFoundException {
        Scanner readCars = new Scanner(new File("Files/Cars"));
        while (readCars.hasNextLine()) {
            String[] carInfo = readCars.nextLine().split(", ");
            if (carInfo[0].equals("Family")) {
                //Car familyCar = new Family("Family", brand, model, fuelType, registration, odometer, manualGear, airCondition, cruiseControl, seat);
                Car familyCar = new Family("Family", carInfo[1], carInfo[2], carInfo[3], carInfo[4], Integer.parseInt(carInfo[5]), carInfo[6], carInfo[7], carInfo[8], Integer.parseInt(carInfo[9]));
                cars.add(familyCar);
            } else if (carInfo[0].equals("Luxury")) {
                //Car luxuryCar = new Luxury("Luxury", brand, model, fuelType, registration, odometer, ccm, automaticGear, airCondition, cruiseControl, leatherSeat);
                Car luxuryCar = new Luxury("Luxury", carInfo[1], carInfo[2], carInfo[3], carInfo[4], Integer.parseInt(carInfo[5]), Integer.parseInt(carInfo[6]), carInfo[7], carInfo[8], carInfo[9], carInfo[10]);
                cars.add(luxuryCar);
            } else if (carInfo[0].equals("Sport")) {
                //Car sportCar = new Sport("Luxury", brand, model, fuelType, registration, odometer, manualGear, hp);
                Car sportCar = new Sport("Sport", carInfo[1], carInfo[2], carInfo[3], carInfo[4], Integer.parseInt(carInfo[5]), carInfo[6], Integer.parseInt(carInfo[7]));
                cars.add(sportCar);
            }
        }
        readCars.close();
    }

    /*public static void writeToFileT(ArrayList<Car> cars) throws IOException {
        FileWriter writeFile = new FileWriter(new File("Files/Cars"), false);
        BufferedWriter bWrite = new BufferedWriter(writeFile);
        int tempI = 0;
        String carsOut = "";
        for (String s : cars.toString().split("\n")) {
            s = s.substring(s.indexOf(": ") + 2);
            s = s.replace(", brand: ", "\n");   //s = s.replace("brand: ", "\n");
            carsOut += s + ", ";
            tempI++;
        }

        bWrite.write(carsOut);

        bWrite.close();
    }*/
    public static void writeToCarFile(ArrayList<Car> cars) throws IOException {
        FileWriter writeFile = new FileWriter(new File("Files/Cars"), false);
        BufferedWriter bWrite = new BufferedWriter(writeFile);

        String carsOut = "";
        String[] sArr = new String[cars.size()];
        Arrays.fill(sArr, "");

        for (int i = 0; i < cars.size(); i++) {
            String s = String.valueOf(cars.get(i));
            String[] strArr = s.split("\n");
            switch (cars.get(i).type) {
                case "Family":
                    for (int j = 0; j < 9; j++) {
                        String newLastFamily = strArr[j].substring(strArr[j].indexOf(": ") + 2);
                        sArr[i] += newLastFamily + ", ";
                    }
                    carsOut += "Family, " + sArr[i] + "\n";
                    break;
                case "Luxury":
                    for (int j = 0; j < 10; j++) {
                        String newLastLuxury = strArr[j].substring(strArr[j].indexOf(": ") + 2);
                        sArr[i] += newLastLuxury + ", ";
                    }
                    carsOut += "Luxury, " + sArr[i] + "\n";
                    break;
                case "Sport":
                    for (int j = 0; j < 7; j++) {
                        String newLastSport = strArr[j].substring(strArr[j].indexOf(": ") + 2);
                        sArr[i] += newLastSport + ", ";
                    }
                    carsOut += "Sport, " + sArr[i] + "\n";
                    break;
            }
        }
        bWrite.write(carsOut);
        bWrite.close();
    }

    public static void updateRentalArrayList(ArrayList<Honolulu_Car_Rental> rentals) throws FileNotFoundException {
        Scanner readRentals = new Scanner(new File("Files/Rentals"));
        while (readRentals.hasNextLine()) {
            String[] rentalInfo = readRentals.nextLine().split(", ");
            if (rentalInfo[0].equals("Private")) {
                Honolulu_Car_Rental privateRental = new Private_Rentals("Private", rentalInfo[1], rentalInfo[2], Integer.parseInt(rentalInfo[3]), rentalInfo[4], Integer.parseInt(rentalInfo[5]), Integer.parseInt(rentalInfo[6]), rentalInfo[7], Integer.parseInt(rentalInfo[8]), rentalInfo[9]);
                rentals.add(privateRental);
            } else if (rentalInfo[0].equals("Company")) {
                Honolulu_Car_Rental companyRental = new Company_Rentals("Company", rentalInfo[1], rentalInfo[2], Integer.parseInt(rentalInfo[3]), rentalInfo[4], Integer.parseInt(rentalInfo[5]), Integer.parseInt(rentalInfo[6]), rentalInfo[7], rentalInfo[8], rentalInfo[9], Integer.parseInt(rentalInfo[10]), Integer.parseInt(rentalInfo[11]));
                rentals.add(companyRental);
            }
        }
        readRentals.close();
    }

    public static void writeToRentalFile(ArrayList<Honolulu_Car_Rental> rentals) throws IOException {
        FileWriter writeFile = new FileWriter(new File("Files/Rentals"), false);
        BufferedWriter bWrite = new BufferedWriter(writeFile);

        String rentalsOut = "";
        String[] sArr = new String[rentals.size()];
        Arrays.fill(sArr, "");

        for (int i = 0; i < rentals.size(); i++) {
            String s = String.valueOf(rentals.get(i));
            String[] strArr = s.split("\n");
            switch (rentals.get(i).customer) {
                case "Private":
                    for (int j = 0; j < 9; j++) {
                        String newLastPrivate = strArr[j].substring(strArr[j].indexOf(": ") + 2);
                        sArr[i] += newLastPrivate + ", ";
                    }
                    rentalsOut += "Private, " + sArr[i] + "\n";
                    break;
                case "Company":
                    for (int j = 0; j < 11; j++) {
                        String newLastCompany = strArr[j].substring(strArr[j].indexOf(": ") + 2);
                        sArr[i] += newLastCompany + ", ";
                    }
                    rentalsOut += "Company, " + sArr[i] + "\n";
                    break;
            }
        }
        bWrite.write(rentalsOut);
        bWrite.close();
    }

    public static void writeContractFile(Rental_Contract rental_contract, Honolulu_Car_Rental honolulu_car_rental, Car car) throws IOException {
        int fnameCount = 1;
        /*
        try {
            File file = new File("Files/Contracts/Contract.txt" + fnameCount);
            file.createNewFile();
            FileWriter fw = new FileWriter(file, false);
            String s = rental_contract + "\n" + honolulu_car_rental + "\n" + car;
            fw.write(s);
            fw.close();
        } catch (Exception e){
            e.printStackTrace();
        }*/
        /*File file = new File("Files/Conctracts" + fnameCount);
        FileWriter fw;
        file.createNewFile();
        fw = new FileWriter(file);
        BufferedWriter bWrite = new BufferedWriter(fw);

        String rentalsOut = "";

        String s = rental_contract + "\n" + honolulu_car_rental + "\n" + car;
        System.out.println(s);
        bWrite.write(rentalsOut);
        file.write(s);
        fw.close();*/
        PrintStream ps = new PrintStream(new File("Files/Contracts/Contract.txt"));
        ps.println("Contract " + fnameCount + "\n******************************\n" + rental_contract + "\n******************************\n\n" + "Rental information" + "\n******************************\n" + honolulu_car_rental + "\n******************************\n\n" + "Car information" + "\n******************************\n" + car + "\n******************************\n");
        ps.close();
        fnameCount++;
    }
}
