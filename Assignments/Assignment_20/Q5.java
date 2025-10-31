class Logic {

    /**
     * Finds the smallest digit in a given number.
     * num The number to inspect.
     */

    void findSmallestDigit(int num) {
        int smallestDigit = 9; // Initialize with the largest possible digit.
        int tempNum = Math.abs(num); // Handle negative numbers

        // If the number is a single digit, it's the smallest.
        if (tempNum < 10) {
            smallestDigit = tempNum;
        } else {
            while (tempNum > 0) {
                int digit = tempNum % 10; // Get the last digit
                if (digit < smallestDigit) {
                    smallestDigit = digit;
                }
                tempNum /= 10; // Remove the last digit
            }
        }
        System.out.println("The smallest digit in " + num + " is: " + smallestDigit);
    }
}

class Q5 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.findSmallestDigit(45872);
    }
}

// Output : The smallest digit in 45872 is: 2