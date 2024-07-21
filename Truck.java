public class Truck implements Vehicle {

    private String type ;
    private int week ;

    public Truck(String type, int week ) {
        this.type = type;
        this.week = week;
    }



    @Override
    public double calculateRentalCost() {
        return 500*week  ;
    }

    @Override
    public void displayDetails() {
        System.out.println("Rental Details: \n" +
                "Truck Type: "+ type + "\n" +
                "Weekly Rental Rate: $" + 500 + "\n" +
                "Rental Cost: $" + this.calculateRentalCost() );
    }
}
