import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorMain {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            // Input: quantity from stdin (raw number)
            // Input: price from stdin (raw number)
            String line1 = reader.readLine();
            String line2 = reader.readLine();
            
            // Parse inputs
            double quantity = Double.parseDouble(line1);
            double price = Double.parseDouble(line2);
            
            // Calculate order value
            double orderValue = PriceCalculator.calculateOrderValue(quantity, price);
            
            // Format output
            String output = OutputFormatter.format(quantity, price, orderValue);
            System.out.print(output);
            
            System.exit(0);
        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid number format. Expected raw numbers.");
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Error: Failed to read input. " + e.getMessage());
            System.exit(1);
        }
    }
}
