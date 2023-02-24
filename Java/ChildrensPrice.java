public class ChildrensPrice extends Price {

    @Override
    public int getPriceCode() {
        return Movie.CHILDREN; // Set price code as CHILDREN
    }

    @Override
    double getCharge(int daysRented) {
        double amount = 1.5; // Set base charge amount
        if (daysRented > 3) // If rented for more than 3 days, add additional charge
            amount += (daysRented - 3) * 1.5;
        return amount; // Return total charge amount
    }
}
