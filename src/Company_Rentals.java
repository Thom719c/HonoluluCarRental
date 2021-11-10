public class Company_Rentals extends Honolulu_Car_Rental{
    String companyName;
    String companyAddress;
    int companyPhoneNumber;
    int crn; // Company registration number. (6 digits)


    public Company_Rentals(String dN, String a, int zC, String c, int mP, int p, String e,
                           String cN, String cA, int cPN, int crn) {
        super(dN, a, zC, c, mP, p, e);
        companyName = cN;
        companyAddress = cA;
        companyPhoneNumber = cPN;
        this.crn = crn;

    }
}
