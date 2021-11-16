import java.io.IOException;
import java.util.*;

public class ContractHandler {

    public void contractHandler(Scanner input, CarHandler carHandler, RentalsHandler rentalsHandler) throws IOException {
        for (int i = 0; i < rentalsHandler.getRentals().size(); i++) {
            System.out.printf("Nr. %-2d: %s %s \n", (i + 1), rentalsHandler.getRentals().get(i).driverName, rentalsHandler.getRentals().get(i).email);
        }
        System.out.println("Choose which customer you want to make a contract with: ");
        int customerChoice = input.nextInt();
        for (int i = 0; i < carHandler.getCars().size(); i++) {
            System.out.printf("Nr. %-2d: %s, %s %s \n", (i + 1), carHandler.getCars().get(i).type, carHandler.getCars().get(i).brand, carHandler.getCars().get(i).model);
        }
        System.out.println("Choose which car you want: ");
        int carChoice = input.nextInt();
        createContract(input, carHandler, carChoice, rentalsHandler, customerChoice);
    }

    public void createContract(Scanner input, CarHandler carHandler, int carChoice, RentalsHandler rentalsHandler, int customerChoice) throws IOException {
        System.out.println("Enter Renter ID: ");
        int renterId = input.nextInt();
        System.out.println("Enter Company ID: ");
        int companyId = input.nextInt();
        System.out.println("Enter contract length: ");
        String contractLength = input.nextLine();
        input.nextLine();
        System.out.println("Enter max km: ");
        int maxKm = input.nextInt();
        System.out.println("Enter registration number: ");
        String registrationNumber = input.nextLine();

        Rental_Contract rental_contract = new Rental_Contract(renterId, companyId, contractLength, carHandler.getCars().get(carChoice - 1).getOdometer(), maxKm + carHandler.getCars().get(carChoice - 1).getOdometer(), registrationNumber);

        System.out.println("Contract\n" + rental_contract + "\n\nCustomer\n" + rentalsHandler.getRentals().get(customerChoice - 1) + "\n\nCar\n" + carHandler.getCars().get(carChoice - 1));

        FileProcessor.writeContractFile(rental_contract, rentalsHandler.getRentals().get(customerChoice - 1), carHandler.getCars().get(carChoice - 1));
    }
}
