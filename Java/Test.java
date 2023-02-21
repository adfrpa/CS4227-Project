public class Test {
// The main method of this class is used to test the Movie Rental system
public static void main(String[] args) {
    // Create three movie objects with different titles and rental types
    Movie movie1 = new Movie("The Lion King", Movie.CHILDREN);
    Movie movie2 = new Movie("The Godfather", Movie.REGULAR);
    Movie movie3 = new Movie("The Matrix", Movie.NEW_RELEASE);
    
    // Create three rental objects with different movies and rental periods
    Rental rental1 = new Rental(movie1, 3);
    Rental rental2 = new Rental(movie2, 2);
    Rental rental3 = new Rental(movie3, 5);
    
    // Create a new customer object with the name "John Smith"
    Customer customer = new Customer("John Smith");
    
    // Add the rental objects to the customer object
    customer.addRental(rental1);
    customer.addRental(rental2);
    customer.addRental(rental3);
    
    // Create a string representing the expected output of the statement method of the customer object
    String expected = "Rental record for John Smith\n" +
                      "\tThe Lion King\t1.5\n" +
                      "\tThe Godfather\t2.0\n" +
                      "\tThe Matrix\t15.0\n" +
                      "Amount owed is 18.5\n" +
                      "You earned 4 frequent renter points";
    
    // Get the actual output of the statement method of the customer object
    String actual = customer.statement();
    
    // Check if the expected and actual strings are equal
    if (expected.equals(actual)) {
        System.out.println("Test passed");
    } else {
        // Print a message and the expected and actual strings if they are not equal
        System.out.println("Test failed");
        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + actual);
    }
}
}

