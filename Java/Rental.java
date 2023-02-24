public class Rental {

    // Declare instance variables for the movie being rented and the number of days rented.
    Movie movie;
    private int daysRented;

    // Constructor for creating a new rental with a given movie and number of days rented.
    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    // Getter method for the movie being rented.
    public Movie getMovie() {
        return movie;
    }

    // Getter method for the number of days rented.
    public int getDaysRented() {
        return daysRented;
    }

    // Method for calculating the rental charge for this rental based on the movie and number of days rented.
    public double getCharge() {
        return movie.getCharge(daysRented);
    }

    // Method for calculating the frequent renter points for this rental based on the movie and number of days rented.
    public int getFrequentRenterPoints() {
        return movie.getFrequentRenterPoints(daysRented);
    }
}
