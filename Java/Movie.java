public class Movie {

    // Declare and define the constants for the possible price codes.
    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    // Declare instance variables for the movie's title and price.
    private String title;
    Price price;

    // Constructor for creating a new movie with a given title and price code.
    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode); // Set the price of the movie based on the given price code.
    }

    // Getter method for the movie's title.
    public String getTitle() {
        return title;
    }

    // Setter method for the movie's price based on the given price code.
    public void setPriceCode(int priceCode) {
        switch (priceCode) {
            case CHILDREN: // If the price code is for a children's movie, set the price to the children's price.
                price = new ChildrensPrice();
                break;
            case NEW_RELEASE: // If the price code is for a new release, set the price to the new release price.
                price = new NewReleasePrice();
                break;
            case REGULAR: // If the price code is for a regular movie, set the price to the regular price.
                price = new RegularPrice();
                break;
            default: // If the price code is invalid, throw an exception.
                throw new IllegalArgumentException("invalid price code");
        }
    }

    // Method for calculating the rental charge for the movie based on the number of days rented.
    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

    // Method for calculating the frequent renter points for the movie based on the number of days rented.
    public int getFrequentRenterPoints(int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
    }

}
