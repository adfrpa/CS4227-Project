public class RegularPrice extends Price {

    // Returns the price code for regular movies, which is 0.
    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }

    // Calculates the charge for renting a regular movie for a specified number of days.
    @Override
    public double getCharge(int daysRented) {
        double amount = 2;  // Base rental fee is $2.
        if (daysRented > 2) {
            // If rented for more than 2 days, additional fee is $1.5 per day.
            amount += (daysRented - 2) * 1.5;
        }
        return amount;
    }
}
