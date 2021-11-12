import java.util.ArrayList;

public class RentalsHandler {
    private static void createRentals(ArrayList<Honolulu_Car_Rental> rentals) {
        Honolulu_Car_Rental customerP1 = new Private_Rentals("Josh","Nybobvej",2500, "Valby", 45678798, 13234567, "Joshie@gmail.com",
                106783593, "6/3/2018");
        Honolulu_Car_Rental customerP2 = new Private_Rentals("Ethan","Frederiksberg allé",2000, "Frederiksberg", 98460575, 68840780, "Ethanol@Outlook.com",
                493666905, "16/8/2009");
        Honolulu_Car_Rental customerP3 = new Private_Rentals("Simon","Jyllingevej",2720, "Vanløse", 68477612, 24288629, "Seiso@Hotmail.com",
                678330410, "29/4/2012");
        Honolulu_Car_Rental customerP4 = new Private_Rentals("Eric","Egevej",2600, "Glostrup", 58133023, 35840200, "BigEric@gmail.com",
                812412487, "4/11/1999");

        Honolulu_Car_Rental customerC1 = new Company_Rentals("Steve","Strandvejen",2900, "Hellerup", 61131153, 17793808, "SteveMcQueen@gmail.com",
                "Apple", "Apple street", 76118481, 777114);
        Honolulu_Car_Rental customerC2 = new Company_Rentals("Mark","Vinkelvej",3520, "Farum", 99965854, 41427592, "Zucker@Outlook.com",
                "Facebook", "Facebook street", 96088113, 307441);
        Honolulu_Car_Rental customerC3 = new Company_Rentals("Elon","Nordrupvej",4100, "Ringsted", 62771106, 64037345, "MuskyMule@Hotmail.com",
                "Tesla", "Tesla street", 62862344, 719221);
        Honolulu_Car_Rental customerC4 = new Company_Rentals("Jeff","Hjallesevej",5000, "Odense C", 71857745, 29712586, "Besos@gmail.com",
                "Amazon", "Amazon street", 80633018, 420205);
    }
}
