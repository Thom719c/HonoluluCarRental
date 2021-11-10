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
        return (super.toString() + "\nmanual gear " + manualGear +
                "\nair condition " + airCondition + "\ncruise control " + cruiseControl + "\nseats " + seat);
    }
}
