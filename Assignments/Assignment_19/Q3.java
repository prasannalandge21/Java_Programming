class Logic {

    /**
     * Checks if a number is divisible by both 5 and 11.
     * The number to check.
     */

    void checkDivisible(int num) {
        // The '&&' (AND) operator ensures both conditions are true.
        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println(num + " is divisible by both 5 and 11.");
        } else {
            System.out.println(num + " is not divisible by both 5 and 11.");
        }
    }
}

class Q3 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.checkDivisible(55);
        obj.checkDivisible(110);
        obj.checkDivisible(50);
    }
}

// Output :
// 55 is divisible by both 5 and 11.
// 110 is divisible by both 5 and 11.
// 50 is not divisible by both 5 and 11.
