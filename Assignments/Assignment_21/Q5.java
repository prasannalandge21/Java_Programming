class Logic {

    /**
     * Prints all numbers from 1 to n that are divisible by both 2 and 3.
     * n The upper limit of the range.
     */

    void printDivisibleBy2and3(int n) {
        System.out.print("Numbers from 1 to " + n + " divisible by both 2 and 3 are: ");
        for (int i = 1; i <= n; i++) {
            // A number divisible by both 2 and 3 is divisible by their LCM, which is 6.
            if (i % 6 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

class Q5 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.printDivisibleBy2and3(30);
    }
}
