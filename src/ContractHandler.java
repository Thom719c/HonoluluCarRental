import java.util.*;

public class ContractHandler {
    private CarHandler carHandler = new CarHandler();
    private RentalsHandler rentalsHandler = new RentalsHandler();

    public void contractHandler(Scanner input){
        createContract(input);
    }
    public void createContract(Scanner input){
        System.out.println("Enter Renter ID: ");
        int renterId = input.nextInt();
        System.out.println("Enter Company ID: ");
        int companyId = input.nextInt();
        System.out.println("Enter contract length: ");
        String contractLength = input.nextLine();
        System.out.println("Enter start km: ");
        int startKm = input.nextInt();
        System.out.println("Enter max km: ");
        int maxKm = input.nextInt();
        System.out.println("Enter registration number: ");
        int registrationNumber = input.nextInt();

        Rental_Contract rental_contract = new Rental_Contract(renterId, companyId, contractLength, startKm, maxKm, registrationNumber);
    }
}
