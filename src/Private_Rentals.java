public class Private_Rentals extends Honolulu_Car_Rental{
    int driverLicenseNumber;
    String issuedLicenseDate; //date for license registration

    public Private_Rentals(String customer, String dN, String a, int zC, String c, int mP, int p, String e,
                           int dLN, String iss) {
        super(customer, dN, a, zC, c, mP, p, e);
        driverLicenseNumber = dLN;
        issuedLicenseDate = iss;
    }
    @Override
    public String toString() {
        return (super.toString() + "\ndriver license number: " + driverLicenseNumber + "\nissued license date: " + issuedLicenseDate);
    }
}
