public class binaryaddition {
    public static String addBinary(String binary1, String binary2) {
        // Align binary numbers
        int lenDiff = binary1.length() - binary2.length();
        if (lenDiff > 0) {
            binary2 = String.format("%0" + lenDiff + "d", 0) + binary2;
        } else if (lenDiff < 0) {
            binary1 = String.format("%0" + -lenDiff + "d", 0) + binary1;
        }

        StringBuilder result = new StringBuilder();
        int carry = 0;

        // Add digits from right to left
        for (int i = binary1.length() - 1; i >= 0; i--) {
            int sum = Character.getNumericValue(binary1.charAt(i)) +
                      Character.getNumericValue(binary2.charAt(i)) + carry;

            result.insert(0, sum % 2); // Append the result digit
            carry = sum / 2; // Calculate carry
        }

        // Append carry, if any
        if (carry > 0) {
            result.insert(0, carry);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String binary1 = "1101";
        String binary2 = "101";
        String sum = addBinary(binary1, binary2);
        System.out.println("Sum: " + sum); // Output: 10100
    }
}