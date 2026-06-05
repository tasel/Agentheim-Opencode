public class OutputFormatter {
    /**
     * Formats the output as three raw numbers on separate lines.
     * @param quantity the quantity
     * @param price the price
     * @param orderValue the order value
     * @return formatted string with three lines
     */
    public static String format(double quantity, double price, double orderValue) {
        return quantity + "\n" + price + "\n" + orderValue + "\n";
    }
}
