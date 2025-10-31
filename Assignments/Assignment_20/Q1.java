class Logic {

    /**
     * Calculates the sum of all even numbers from 1 to n.
     * is the upper limit of the range.
     */

    void sumEvenNumbers(int n) {
        int sum = 0;
        // Loop from 1 to n.
        for (int i = 1; i <= n; i++) {
            // Check if the number is even.
            if (i % 2 == 0) {
                sum += i; // Add the even number to the sum.
            }
        }
        System.out.println("The sum of even numbers up to " + n + " is: " + sum);
    }
}

class Q1 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.sumEvenNumbers(10);
    }
}

// Output : The sum of even numbers up to 10 is: 30