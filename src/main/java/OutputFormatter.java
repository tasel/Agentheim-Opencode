public class OutputFormatter {
    public static String format(double quantity, double price, double orderValue) {
        double taxAmount = orderValue * 0.19;
        double finalValue = orderValue + taxAmount;
        double taxRate = 19.0;
        double taxValue = orderValue;
        
        StringBuilder sb = new StringBuilder();
        sb.append("QUANTITY: ").append(quantity).append("\n");
        sb.append("PRICE: ").append(price).append("\n");
        sb.append("ORDER VALUE: ").append(orderValue).append("\n");
        sb.append("TAX RATE: ").append(taxRate).append("\n");
        sb.append("TAX VALUE: ").append(taxValue).append("\n");
        sb.append("TAX AMOUNT: ").append(taxAmount).append("\n");
        sb.append("FINAL VALUE: ").append(finalValue).append("\n");
        
        return sb.toString();
    }
}
