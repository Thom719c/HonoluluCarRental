public abstract class Honolulu_Car_Rental {
    String customer;
    String driverName;
    String address;
    int zipCode;
    String city;
    int mobilePhone;
    int phone;
    String email;

    public Honolulu_Car_Rental(String customer, String dN, String a, int zC, String c, int mP, int p, String e) {
        this.customer = customer;
        driverName = dN;
        address = a;
        zipCode = zC;
        city = c;
        mobilePhone= mP;
        phone = p;
        email = e;
    }
    @Override
    public String toString(){
        return("driver name: " + driverName + "\naddress: " + address + "\nzipcode: " + zipCode + "\ncity: " + city +
                "\nmobile phone: " + mobilePhone + "\nphone: " + phone + "\nemail: " + email);
    }
}
