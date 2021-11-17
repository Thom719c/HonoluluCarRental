public abstract class Car {
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

    @Override
    public String toString(){
        return("brand: " + brand + "\nmodel: " + model + "\nfuel type: " + fuelType
                + "\nregistration: " + registration + "\nodometer: " + odometer);
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getRegistration() {
        return registration;
    }
    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public int getOdometer() {
        return odometer;
    }
    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
}
