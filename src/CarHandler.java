import java.lang.reflect.Array;
import java.util.*;

public class CarHandler {
    private ArrayList<Car> cars = new ArrayList<>();

    //private ArrayList<Car> familyCars = new ArrayList<Car>();
    //private ArrayList<Luxury> luxuryCars;
    //private ArrayList<Sport> sportCars;

    public ArrayList<Car> createCars() {
        //Family
        Car toyota1 = new Family("Family", "Toyota", "Proace Cyty Verso Shuttle", "Benzin", "06-2021", 5000,
                "5. gear manual", "Yes", "Yes", 7);
        cars.add(toyota1);
        Car toyota2 = new Family("Family", "Toyota", "Verso", "Diesel", "02-2012", 171000,
                "Yes", "Yes", "Yes", 7);
        cars.add(toyota2);
        Car nissan1 = new Family("Family", "Nissan", "Qashqai", "Diesel", "02-2012", 152000,
                "Yes", "Yes", "Yes", 7);
        cars.add(nissan1);
        Car nissan2 = new Family("Family", "Nissan", "e-NV200 Evalia Premium", "Diesel", "05-2019", 46000,
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

    public void showCars() {
        //createCars();
        for (Car s : cars) {
            System.out.println(s + "\n********************************************************************************");
        }
    }

    public void addCarMenu(Scanner input) {
        System.out.println("1. Family car");
        System.out.println("2. Luxury car");
        System.out.println("3. Sport car");
        int addType = input.nextInt();
        switch (addType) {
            case 1: //10 inputs
                addFamily(input);
                break;
            case 2: //11 inputs
                addLuxury(input);
                break;
            case 3: //8 inputs
                break;
            default:
                System.out.println("Not valid number");
        }
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
        String brand = input.next();
        System.out.println("Enter model: ");
        String model = input.next();
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
        String leatherSeat = input.next();
        Car luxuryCar = new Luxury("Luxury", brand, model, fuelType, registration, odometer, ccm, automaticGear, airCondition, cruiseControl, leatherSeat);
        cars.add(luxuryCar);
        return cars;
    }

    public void removeCar(Scanner input) {
        for (int i = 0; i < cars.size(); i++) {
            System.out.printf("Nr. %-2d: %s %s \n", (i + 1), cars.get(i).brand, cars.get(i).model);
        }
        System.out.println("Enter corresponding number for removing: ");
        int removeChoice = input.nextInt();
        cars.remove(removeChoice - 1);
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }
}
