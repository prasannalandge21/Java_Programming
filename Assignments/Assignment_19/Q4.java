class Logic {
    /**
     * Prints each digit of a number separately, starting from the last digit.
     * The number whose digits are to be printed.
     */

    void printDigits(int num) {
        System.out.print("Digits of " + num + " are: ");
        // If the number is 0, just print 0.
        if (num == 0) {
            System.out.print(0);
            return;
        }
        // Take the absolute value to handle negative numbers correctly.
        int tempNum = Math.abs(num);
        // Loop until all digits are extracted.
        while (tempNum > 0) {
            // Get the last digit using the modulo operator.
            int digit = tempNum % 10;
            System.out.print(digit + " ");
            // Remove the last digit by integer division.
            tempNum = tempNum / 10;
        }
        System.out.println();
    }
}

class Q4 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.printDigits(9876);
    }
}

// Output : Digits of 9876 are: 6 7 8 9
