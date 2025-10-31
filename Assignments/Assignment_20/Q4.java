class Logic {

    /**
     * Finds the largest digit in a given number.
     * num The number to inspect.
     */

    void findLargestDigit(int num) {
        int largestDigit = 0;
        int tempNum = Math.abs(num); // Handle negative numbers

        // If the number is a single digit, it's the largest.
        if (tempNum < 10) {
            largestDigit = tempNum;
        } else {
            while (tempNum > 0) {
                int digit = tempNum % 10; // Get the last digit
                if (digit > largestDigit) {
                    largestDigit = digit;
                }
                tempNum /= 10; // Remove the last digit
            }
        }
        System.out.println("The largest digit in " + num + " is: " + largestDigit);
    }
}

class Q4 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.findLargestDigit(83429);
    }
}

// Output :The largest digit in 83429 is: 9
