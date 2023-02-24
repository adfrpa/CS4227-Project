public class NewReleasePrice extends Price {

    // Get the price code for this type of movie
    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    // Calculate the rental charge based on the number of days rented
    @Override
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }

    // Calculate the number of frequent renter points based on the number of days rented
    @Override
    int getFrequentRenterPoints(int daysRented) {
        if (daysRented > 1)
            return 2;
        return 1;
    }
}
