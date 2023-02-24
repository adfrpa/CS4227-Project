public abstract class Price {

    // an abstract method that returns the price code of the Movie object
    abstract int getPriceCode();

    // an abstract method that calculates the rental charge for a movie based on the number of days rented
    abstract double getCharge(int daysRented);

    // a method that returns the frequent renter points earned for a movie based on the number of days rented
    // this method returns 1 for most types of movies, but can be overridden by subclasses
    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
