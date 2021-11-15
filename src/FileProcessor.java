import java.io.*;
import java.util.*;

public class FileProcessor {
    public static void updateArrayList(ArrayList<Car> cars) throws FileNotFoundException {

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

    public static void writeToCarFile(ArrayList<Car> cars) throws IOException {
        FileWriter writeFile = new FileWriter(new File("Files/Cars"), false);
        BufferedWriter bWrite = new BufferedWriter(writeFile);

        String carsOut = "";

        for (int i = 0; i < cars.size(); ++i) {
            if (cars.get(i).type.equals("Family")) {
                System.out.println(cars.get(i));
                //carsOut += cars.get(i);
            }
            if (cars.get(i).type.equals("Family")) {
                carsOut += cars.get(i).type + ", " + cars.get(i).brand + cars.get(i).model + cars.get(i).fuelType + cars.get(i).registration + cars.get(i).odometer /*+ familyCars.get(i).manualGear + familyCars.get(i).airCondition + familyCars.get(i).cruiseControl + familyCars.get(i).seat*/ + "\n";
                System.out.println("FamilyJoin");
            }
        }
        bWrite.write(carsOut);
        bWrite.close();
    }

    public static void writeToFileTest(ArrayList<Car> cars) throws IOException {
        FileWriter writeFile = new FileWriter(new File("Files/Cars"), false);
        BufferedWriter bWrite = new BufferedWriter(writeFile);

        String carsOut = "";

        Scanner readCars = new Scanner(new File("Files/Cars"));

//        for (int i = 0; i < cars.size(); i++){
//
//            String[] carInfo;
//            cars.get(i);
//            if (carInfo[0].equals("Family")) {
//
//            } else if (carInfo[0].equals("Luxury")) {
//
//            } else if (carInfo[0].equals("Sport")) {
//
//            }
//        }

        bWrite.write(carsOut);
        bWrite.close();
    }

    public static void writeToRentalFile(ArrayList<Honolulu_Car_Rental> rentals) {
    }
}
