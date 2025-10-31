class Logic {

    /**
     * Checks if a number is a perfect number.
     * num The number to check.
     */
    void checkPerfect(int num) {
        int sumOfDivisors = 0;
        // Find divisors and sum them up. Loop only up to num/2 for efficiency.
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sumOfDivisors += i;
            }
        }

        // Check if the sum of divisors equals the number itself.
        if (sumOfDivisors == num && num > 0) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }
}

class Q3 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.checkPerfect(6);
        obj.checkPerfect(28); // Another perfect number
        obj.checkPerfect(12);
    }
}

// Output : 6 is a perfect number.
// 28 is a perfect number.
// 12 is not a perfect number.
