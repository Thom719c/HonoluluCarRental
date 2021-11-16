public class Rental_Contract {
    int renterId;
    int companyId;
    String contractLength; //  from-date&time, to-date&time
    int startKm;
    int maxKm;
    int registrationNumber;

    public Rental_Contract(int rI, int cI, String cL, int sK, int mK, int rN) {
        renterId = rI;
        companyId = cI;
        contractLength = cL;
        startKm = sK;
        maxKm = mK;
        registrationNumber = rN;
    }


    @Override
    public String toString() {
        return ("renterId " + renterId + "\ncompanyId " + companyId + "\ncontractLength " + contractLength +
                "\nstartKm " + startKm + "\nmaxKm " + maxKm + "\nregistrationNumber " + registrationNumber);
    }
}