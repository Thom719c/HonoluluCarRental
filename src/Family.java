public class Family extends Car {
    String manualGear;
    String airCondition;
    String cruiseControl;
    int seat;

    public Family(String t, String b, String m, String fT, String r, int o,
                  String mG, String aC, String cC, int s) {
        super(t, b, m, fT, r, o);
        manualGear = mG;
        airCondition = aC;
        cruiseControl = cC;
        seat = s;
    }

    @Override
    public String toString() {
        return (super.toString() + "\nmanual gear: " + manualGear +
                "\nair condition: " + airCondition + "\ncruise control: " + cruiseControl + "\nseats: " + seat);
    }

    public String getManualGear() {
        return manualGear;
    }
    public void setManualGear(String manualGear) {
        this.manualGear = manualGear;
    }

    public String getAirCondition() {
        return airCondition;
    }
    public void setAirCondition(String airCondition) {
        this.airCondition = airCondition;
    }

    public String getCruiseControl() {
        return cruiseControl;
    }
    public void setCruiseControl(String cruiseControl) {
        this.cruiseControl = cruiseControl;
    }

    public int getSeat() {
        return seat;
    }
    public void setSeat(int seat) {
        this.seat = seat;
    }
}