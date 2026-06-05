public class InputParser {
    /**
     * Parses a raw numeric string to a double.
     * @param input raw numeric string from stdin
     * @return parsed double value
     * @throws IllegalArgumentException if input is not a valid number
     */
    public static double parse(String input) {
        return Double.parseDouble(input);
    }
}
