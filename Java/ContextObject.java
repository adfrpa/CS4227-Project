import java.util.List;

public class ContextObject {
    
    // Declare a private field 'rentals' of type List<Rental>
    private List<Rental> rentals;

    // Constructor that takes a List<Rental> parameter and sets the 'rentals' field
    public ContextObject(List<Rental> rentals) {
        this.rentals = rentals;
    }

    // Getter method to retrieve the 'rentals' field
    public List<Rental> getRentals() {
        return rentals;
    }
}
