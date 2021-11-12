import java.util.ArrayList;

public class CarHandler {
    private ArrayList<Car> cars;

    //private ArrayList<Family> familyCars;
    //private ArrayList<Luxury> luxuryCars;
    //private ArrayList<Sport> sportCars;

    public ArrayList<Car> createCars() {
        cars = new ArrayList<>();
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

    public void ShowCars(){
        createCars();
        for (Car s: cars){
            System.out.println(s + "\n********************************************************************************");
        }
    }

//    public void setCars(ArrayList<Car> cars) {
//        this.cars = cars;
//    }
//
//    public ArrayList<Car> getCars() {
//        return cars;
//    }
}
