import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        VehicleRentalSystem();
    }

    public static void VehicleRentalSystem () {

        ArrayList<Vehicle> rentedVehicles = new ArrayList<>();

        try {
            int choice = 0;
            Scanner input = new Scanner(System.in);

            do {


                System.out.println("Vehicle Rental System\n" +
                        "1. Rent a Car\n" +
                        "2. Rent a Bike\n" +
                        "3. Rent a Truck\n" +
                        "4. View Rented Vehicles\n" +
                        "5. Exit ");


                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter Car Model:");
                        String model = input.nextLine();
                        model = input.nextLine();
                        System.out.println("Enter Rental Days:");
                        int days = input.nextInt();
                        Vehicle c1 = new Car(model, days);
                        rentedVehicles.add(c1);
                        c1.displayDetails();
                        c1.calculateRentalCost();
                        break;
                    case 2:
                        System.out.println("Enter Bike brand:");
                        String brand = input.nextLine();
                        brand = input.nextLine();
                        System.out.println("Enter Rental hours :");
                        int hour = input.nextInt();
                        Vehicle b1 = new Bike(brand, hour);
                        rentedVehicles.add(b1);
                        b1.displayDetails();
                        b1.calculateRentalCost();
                        break;
                    case 3:
                        System.out.println("Enter Truck type:");
                        String type = input.nextLine();
                        type = input.nextLine();
                        System.out.println("Enter Rental weeks :");
                        int week = input.nextInt();
                        Vehicle t1 = new Truck(type, week);
                        rentedVehicles.add(t1);
                        t1.displayDetails();
                        t1.calculateRentalCost();
                        break;
                    case 4:
                        if (rentedVehicles.size() == 0) {
                            System.out.println("Vehicle Rental System is empty");
                        } else {
                            System.out.println(rentedVehicles.size() + " Rented Vehicles:");
                            for (Vehicle v : rentedVehicles) {
                                v.displayDetails();
                            }
                        }
                        break;

                    case 5:
                        System.out.println("Thank you for using the Vehicle Rental System! ");
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;


                }

            } while (choice != 5);

        }catch (InputMismatchException e) {
            System.out.println("please enter number !!");
        }



    }
}