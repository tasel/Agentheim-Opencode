public class PriceCalculator {
    public static double calculateOrderValue(double quantity, double price) {
        return quantity * price;
    }

    /**
     * Calculates the tax amount (19% of order value).
     * @param orderValue the order value
     * @return tax amount = order value × 0.19
     */
    public static double calculateTaxAmount(double orderValue) {
        return orderValue * 0.19;
    }

    /**
     * Calculates the final value (order value + tax amount).
     * @param orderValue the order value
     * @param taxAmount the tax amount
     * @return final value = order value + tax amount
     */
    public static double calculateFinalValue(double orderValue, double taxAmount) {
        return orderValue + taxAmount;
    }
}
