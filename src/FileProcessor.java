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
}
