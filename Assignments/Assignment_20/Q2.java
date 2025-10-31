class Logic {
    /**
     * Prints numbers in reverse order from n down to 1.
     * n The starting number.
     */

    void printReverse(int n) {
        System.out.print("Numbers from " + n + " down to 1: ");
        // Loop from n down to 1, decrementing by 1 each time.
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class Q2 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.printReverse(10);
    }
}

// Output : Numbers from 10 down to 1: 10 9 8 7 6 5 4 3 2 1