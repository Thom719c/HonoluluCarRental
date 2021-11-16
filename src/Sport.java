public class Sport extends Car{
    String manualGear;
    int hp;

    public Sport(String t, String b, String m, String fT, String r, int o,
                 String mG, int hp) {
        super(t, b, m, fT, r, o);
        manualGear = mG;
        this.hp = hp;
    }

    @Override
    public String toString() {
        return (super.toString() + "\nmanualGear: " + manualGear + "\nHP: " + hp);
    }
}