public class Car {
    //Fields
    String type;
    String brand;
    String model;
    String fuelType;
    String registration;
    int odometer;

    //Constructors
    public Car(String t, String b, String m, String fT, String r, int o) {
        type = t;
        brand = b;
        model = m;
        fuelType = fT;
        registration = r;
        odometer = o;

    }
    public String toString(){
        return("brand: " + brand + "\nmodel " + model + "\nfuel type " + fuelType
                + "\nregistration " + registration + "\nodometer " + odometer);
    }
}
