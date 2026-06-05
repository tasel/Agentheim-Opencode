public class PriceCalculator {
    /**
     * Calculates the order value by multiplying quantity and price.
     * @param quantity the quantity (raw number)
     * @param price the price (raw number)
     * @return order value = quantity × price
     */
    public static double calculateOrderValue(double quantity, double price) {
        return quantity * price;
    }
}
