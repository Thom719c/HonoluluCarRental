import com.sun.org.apache.xpath.internal.operations.Bool;

public class Luxury extends Car{
    int ccm; // > 3000
    String automaticGear;
    String airCondition;
    String cruiseControl;
    String leatherSeat;

    public Luxury(String t, String b, String m, String fT, String r, int o,
                  int ccm, String aG, String aC, String cC, String lS) {
        super(t, b, m, fT, r, o);
        this.ccm = ccm;
        automaticGear = aG;
        airCondition = aC;
        cruiseControl = cC;
        leatherSeat = lS;
    }

    @Override
    public String toString() {
        return (super.toString() +
                "\nccm: " + ccm + "\nautomaticGear: " + automaticGear + "\nairCondition: " + airCondition +
                "\ncruiseControl: " + cruiseControl + "\nleatherSeat: " + leatherSeat);
    }
}
