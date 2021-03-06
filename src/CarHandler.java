import java.io.*;
import java.util.*;

public class CarHandler {
    private ArrayList<Car> cars = new ArrayList<>();

    public ArrayList<Car> createCars() {
        //Family
        Car toyota1 = new Family("Family", "Toyota", "Proace Cyty Verso Shuttle", "Benzin", "06-2021", 5000,
                "5. gear manual", "Yes", "Yes", 7);
        cars.add(toyota1);
        Car toyota2 = new Family("Family", "Toyota", "Verso", "Diesel", "02/2012", 171000,
                "Yes", "Yes", "Yes", 7);
        cars.add(toyota2);
        Car nissan1 = new Family("Family", "Nissan", "Qashqai", "Diesel", "02/2012", 152000,
                "Yes", "Yes", "Yes", 7);
        cars.add(nissan1);
        Car nissan2 = new Family("Family", "Nissan", "e-NV200 Evalia Premium", "Diesel", "05/2019", 46000,
                "Yes", "Yes", "Yes", 7);
        cars.add(nissan2);
        //Luxury
        Car bentley = new Luxury("Luxury", "Bentley", "Continental GT", "Benzin", "02/2013", 40000,
                5998, "Yes", "Yes", "Yes", "Black Leather");
        cars.add(bentley);
        Car rollsRoyce1 = new Luxury("Luxury", "Rolls-Royce", "Phantom", "Benzin", "06/2013", 20000,
                6749, "Yes", "Yes", "Yes", "White Leather");
        cars.add(rollsRoyce1);
        Car rollsRoyce2 = new Luxury("Luxury", "Rolls-Royce", "Ghost", "Benzin", "05/2017", 22500,
                6592, "Yes", "Yes", "Yes", "Brown Leather");
        cars.add(rollsRoyce2);
        Car porsche1 = new Luxury("Luxury", "Porsche", "Panamera Turbo S Executive", "Benzin", "09/2018", 34200,
                3996, "Yes", "Yes", "Yes", "Black Leather");
        cars.add(porsche1);
        //Sport
        Car ford1 = new Sport("Sport", "Ford Mustang", "Shelby GT500R Eleanor",
                "Benzin", "12/1967", 13000, "Yes", 550);
        cars.add(ford1);
        Car porsche2 = new Sport("Sport", "Porsche", "911 Turbo S",
                "Benzin", "06/2014", 35000, "Yes", 560);
        cars.add(porsche2);
        Car nissan3 = new Sport("Sport", "Nissan", "GT-R R35",
                "Benzin", "12/2021", 12000, "No", 565);
        cars.add(nissan3);
        Car mcLaren = new Sport("Sport", "McLaren", "700S",
                "Benzin", "05/2018", 1000, "No", 720);
        cars.add(mcLaren);

        return cars;
    }

    public void showCars(Scanner input) {
        System.out.println("1. Show all \n2. Show family car \n3. Show luxury car \n4. Show sport car \n5. Exit");
        int showType = input.nextInt();
        switch (showType) {
            case 1: //Show all
                for (Car s : cars) {
                    System.out.println(s + "\n**************************************************");
                }
                break;
            case 2: //Family
                showCarType("Family");
                break;
            case 3: //Luxury
                showCarType("Luxury");
                break;
            case 4: //Sport
                showCarType("Sport");
                break;
            default:
        }
    }

    public void showCarType(String carType) {
        int tempI = 1;
        for (Car s : cars) {
            if (s.type.equals(carType)) {
                System.out.printf("Nr. %-2d: %s %s \n", tempI, s.brand, s.model);
                tempI++;
            }
        }
    }

    public void addCarMenu(Scanner input) throws IOException {
        System.out.println("1. Family car");
        System.out.println("2. Luxury car");
        System.out.println("3. Sport car");
        System.out.println("4. Update");
        int addType = input.nextInt();
        switch (addType) {
            case 1: //10 inputs
                addFamily(input);
                break;
            case 2: //11 inputs
                addLuxury(input);
                break;
            case 3: //8 inputs
                addSport(input);
                break;
            case 4:
                FileProcessor.updateCarArrayList(cars);
                break;
            default:
                System.out.println("Not valid number");
        }
        FileProcessor.writeToCarFile(cars);
    }

    public ArrayList<Car> addFamily(Scanner input) {
        System.out.println("Enter brand: ");
        String brand = input.next();
        System.out.println("Enter model: ");
        String model = input.next();
        System.out.println("Enter fuel type: ");
        String fuelType = input.next();
        System.out.println("Enter registration: ");
        String registration = input.next();
        System.out.println("Enter odometer: ");
        int odometer = input.nextInt();
        System.out.println("Enter manual gear (Yes/No): ");
        String manualGear = input.next();
        System.out.println("Enter air condition (Yes/No): ");
        String airCondition = input.next();
        System.out.println("Enter cruise control (Yes/No): ");
        String cruiseControl = input.next();
        System.out.println("Enter how many seats (Min. 7): ");
        int seat = input.nextInt();
        while (seat < 7) {
            System.out.println("Invalid number of seats" + "\nEnter how many seats (Min. 7): ");
            seat = input.nextInt();
        }
        Car familyCar = new Family("Family", brand, model, fuelType, registration, odometer, manualGear, airCondition, cruiseControl, seat);
        cars.add(familyCar);
        return cars;
    }

    public ArrayList<Car> addLuxury(Scanner input) {
        System.out.println("Enter brand: ");
        String brand = input.nextLine();
        System.out.println("Enter model: ");
        String model = input.nextLine();
        System.out.println("Enter fuel type: ");
        String fuelType = input.next();
        System.out.println("Enter registration: ");
        String registration = input.next();
        System.out.println("Enter odometer: ");
        int odometer = input.nextInt();
        System.out.println("Enter ccm: ");
        int ccm = input.nextInt();
        System.out.println("Enter automatic gear (Yes/No): ");
        String automaticGear = input.next();
        System.out.println("Enter air condition (Yes/No): ");
        String airCondition = input.next();
        System.out.println("Enter cruise control (Yes/No): ");
        String cruiseControl = input.next();
        System.out.println("Enter leather seat type: ");
        String leatherSeat = input.nextLine();
        Car luxuryCar = new Luxury("Luxury", brand, model, fuelType, registration, odometer, ccm, automaticGear, airCondition, cruiseControl, leatherSeat);
        cars.add(luxuryCar);
        return cars;
    }

    public ArrayList<Car> addSport(Scanner input) {
        System.out.println("Enter brand: ");
        String brand = input.next();
        System.out.println("Enter model: ");
        String model = input.next();
        System.out.println("Enter fuel type: ");
        String fuelType = input.next();
        System.out.println("Enter registration: ");
        String registration = input.next();
        System.out.println("Enter odometer: ");
        int odometer = input.nextInt();
        System.out.println("Enter manual gear (Yes/No): ");
        String manualGear = input.next();
        System.out.println("Enter hp (horse power): ");
        int hp = input.nextInt();
        Car sportCar = new Sport("Sport", brand, model, fuelType, registration, odometer, manualGear, hp);
        cars.add(sportCar);
        return cars;
    }

    public void removeCar(Scanner input) throws IOException {
        for (int i = 0; i < cars.size(); i++) {
            System.out.printf("Nr. %-2d: %s %s \n", (i + 1), cars.get(i).brand, cars.get(i).model);
        }
        System.out.println("Enter corresponding number for removing: ");
        int removeChoice = input.nextInt();
        cars.remove(removeChoice - 1);
        FileProcessor.writeToCarFile(cars);
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void editCar(Scanner input) throws IOException {
        //int index = 0;
        //Car familyCar = new Family("Family", input.next(), input.next(), input.next(), input.next(), input.nextInt(), input.next(), input.next(), input.next(), input.nextInt());
        //cars.set(index, familyCar);
        System.out.println("1. Family \n2. Luxury \n3. Sport \nEnter number for which you want to change info about: ");
        int editChoice = input.nextInt();
        if (editChoice == 1) {
            //showCarType("Family");
            showEditCarType("Family");
        } else if (editChoice == 2) {
            //showCarType("Luxury");
            showEditCarType("Luxury");
        } else {
            //showCarType("Sport");
            showEditCarType("Sport");
        }
        System.out.println("Enter number for which car you want to change info about: ");
        int picked = input.nextInt();

        String[] strArrayFamily = new String[9];
        String[] strArrayLuxury = new String[10];
        String[] strArraySport = new String[7];
        String[] sArr = new String[cars.size()];
        Arrays.fill(sArr, "");

        String s = String.valueOf(cars.get(picked - 1));
        String[] strArr = s.split("\n");
        switch (cars.get(picked - 1).type) {
            case "Family":
                for (int j = 0; j < 9; j++) {
                    sArr[picked - 1] += strArr[j] + "\n";
                    strArrayFamily = sArr[picked - 1].split("\n");
                }
                for (int i = 0; i < strArrayFamily.length; i++) {
                    System.out.println("Nr. " + (i + 1) + ": " + strArrayFamily[i]);
                    String newLastFamily = strArrayFamily[i].substring(strArrayFamily[i].indexOf(": ") + 2);
                    strArrayFamily[i] = newLastFamily;
                }
                System.out.println("Enter number for which info you want to change: ");
                int pickInfoF = input.nextInt();
                input.nextLine();
                switch (pickInfoF) {
                    case 1:
                        System.out.println("Enter new first brand: ");
                        strArrayFamily[0] = input.nextLine();
                        break;
                    case 2:
                        System.out.println("Enter new model: ");
                        strArrayFamily[1] = input.nextLine();
                        break;
                    case 3:
                        System.out.println("Enter new fuel type: ");
                        strArrayFamily[2] = input.nextLine();
                        break;
                    case 4:
                        System.out.println("Enter new registration: ");
                        strArrayFamily[3] = input.nextLine();
                        break;
                    case 5:
                        System.out.println("Enter new odometer: ");
                        strArrayFamily[4] = String.valueOf(input.nextInt());
                        break;
                    case 6:
                        System.out.println("Enter new manual gear: ");
                        strArrayFamily[5] = input.nextLine();
                        break;
                    case 7:
                        System.out.println("Enter new air condition: ");
                        strArrayFamily[6] = input.nextLine();
                        break;
                    case 8:
                        System.out.println("Enter new cruise control: ");
                        strArrayFamily[7] = input.nextLine();
                        break;
                    case 9:
                        System.out.println("Enter new seats (Min. 7): ");
                        int seat = input.nextInt();
                        strArrayFamily[8] = String.valueOf(seat);
                        while (seat < 7) {
                            System.out.println("Invalid number of seats" + "\nEnter how many seats (Min. 7): ");
                            seat = input.nextInt();
                            strArrayFamily[8] = String.valueOf(seat);
                        }
                        break;
                }
                Car familyCar = new Family("Family", strArrayFamily[0], strArrayFamily[1], strArrayFamily[2], strArrayFamily[3], Integer.parseInt(strArrayFamily[4]),
                        strArrayFamily[5], strArrayFamily[6], strArrayFamily[7], Integer.parseInt(strArrayFamily[8]));
                cars.set(picked - 1, familyCar);
                break;
            case "Luxury":
                for (int j = 0; j < 10; j++) {
                    sArr[picked - 1] += strArr[j] + "\n";
                    strArrayLuxury = sArr[picked - 1].split("\n");
                }
                for (int i = 0; i < strArrayLuxury.length; i++) {
                    System.out.println("Nr. " + (i + 1) + ": " + strArrayLuxury[i]);
                    String newLastLuxury = strArrayLuxury[i].substring(strArrayLuxury[i].indexOf(": ") + 2);
                    strArrayLuxury[i] = newLastLuxury;
                }
                System.out.println("Enter number for which info you want to change: ");
                int pickInfoL = input.nextInt();
                input.nextLine();
                switch (pickInfoL) {
                    case 1:
                        System.out.println("Enter new first brand: ");
                        strArrayLuxury[0] = input.nextLine();
                        break;
                    case 2:
                        System.out.println("Enter new model: ");
                        strArrayLuxury[1] = input.nextLine();
                        break;
                    case 3:
                        System.out.println("Enter new fuel type: ");
                        strArrayLuxury[2] = input.nextLine();
                        break;
                    case 4:
                        System.out.println("Enter new registration: ");
                        strArrayLuxury[3] = input.nextLine();
                        break;
                    case 5:
                        System.out.println("Enter new odometer: ");
                        strArrayLuxury[4] = String.valueOf(input.nextInt());
                        break;
                    case 6:
                        System.out.println("Enter new ccm: ");
                        strArrayLuxury[5] = String.valueOf(input.nextInt());
                        break;
                    case 7:
                        System.out.println("Enter new automatic gear: ");
                        strArrayLuxury[6] = input.nextLine();
                        break;
                    case 8:
                        System.out.println("Enter new air condition: ");
                        strArrayLuxury[7] = input.nextLine();
                        break;
                    case 9:
                        System.out.println("Enter new cruise control: ");
                        strArrayLuxury[8] = String.valueOf(input.nextInt());
                        break;
                    case 10:
                        System.out.println("Enter new leather seat: ");
                        strArrayLuxury[9] = input.nextLine();
                        break;

                }
                Car luxuryCar = new Luxury("Luxury", strArrayLuxury[0], strArrayLuxury[1], strArrayLuxury[2], strArrayLuxury[3], Integer.parseInt(strArrayLuxury[4]),
                        Integer.parseInt(strArrayLuxury[5]), strArrayLuxury[6], strArrayLuxury[7], strArrayLuxury[8], strArrayLuxury[9]);
                cars.set(picked - 1, luxuryCar);
                break;
            case "Sport":
                for (int j = 0; j < 7; j++) {
                    sArr[picked - 1] += strArr[j] + "\n";
                    strArraySport = sArr[picked - 1].split("\n");
                }
                for (int i = 0; i < strArraySport.length; i++) {
                    System.out.println("Nr. " + (i + 1) + ": " + strArraySport[i]);
                    String newLastSport = strArraySport[i].substring(strArraySport[i].indexOf(": ") + 2);
                    strArraySport[i] = newLastSport;
                }
                System.out.println("Enter number for which info you want to change: ");
                int pickInfoS = input.nextInt();
                input.nextLine();
                switch (pickInfoS) {
                    case 1:
                        System.out.println("Enter new first brand: ");
                        strArraySport[0] = input.nextLine();
                        break;
                    case 2:
                        System.out.println("Enter new model: ");
                        strArraySport[1] = input.nextLine();
                        break;
                    case 3:
                        System.out.println("Enter new fuel type: ");
                        strArraySport[2] = input.nextLine();
                        break;
                    case 4:
                        System.out.println("Enter new registration: ");
                        strArraySport[3] = input.nextLine();
                        break;
                    case 5:
                        System.out.println("Enter new odometer: ");
                        strArraySport[4] = String.valueOf(input.nextInt());
                        break;
                    case 6:
                        System.out.println("Enter new manual gear: ");
                        strArraySport[5] = input.nextLine();
                        break;
                    case 7:
                        System.out.println("Enter new hp: ");
                        strArraySport[6] = String.valueOf(input.nextInt());
                        break;
                }
                Car sportCar = new Sport("Sport", strArraySport[0], strArraySport[1], strArraySport[2], strArraySport[3],
                        Integer.parseInt(strArraySport[4]), strArraySport[5], Integer.parseInt(strArraySport[6]));
                cars.set(picked - 1, sportCar);
                break;
        }
        FileProcessor.writeToCarFile(cars);
    }

    public void showEditCarType(String carType) {
        for (Car s : cars) {
            if (s.type.equals(carType)) {
                System.out.printf("Nr. %-2d: %s %s \n", cars.indexOf(s) + 1, s.brand, s.model);
            }
        }
    }
}
