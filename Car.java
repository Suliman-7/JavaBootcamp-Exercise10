public class Car implements Vehicle {

    private String model ;
    private int days ;

    public Car(String model, int days ) {
        this.model = model;
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public double calculateRentalCost() {
        return 50*days   ;
    }

    @Override
    public void displayDetails() {
        System.out.println("Rental Details: \n" +
                "Car Model: "+ model + "\n" +
                "Daily Rental Rate: $" + 50 + "\n" +
                "Rental Cost: $" + this.calculateRentalCost() );
    }
}
