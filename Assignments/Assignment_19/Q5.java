class Logic {

    /**
     * Calculates the power of a number using a loop.
     * base is the base number.
     * exp is the exponent.
     */

    void calculatePower(int base, int exp) {
        long result = 1; // Use 'long' to prevent overflow for large results.

        // Multiply the base by itself 'exp' times.
        for (int i = 1; i <= exp; i++) {
            result = result * base;
        }
        System.out.println(base + " raised to the power of " + exp + " is: " + result);
    }
}

class Q5 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.calculatePower(2, 5);
        obj.calculatePower(3, 4);
    }
}

// Output : 2 raised to the power of 5 is: 32
// Output : 3 raised to the power of 4 is: 81
