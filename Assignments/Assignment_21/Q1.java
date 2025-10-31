class Logic {

    /**
     * Calculates the product of all digits in a number.
     * num The number to process.
     */

    void productOfDigits(int num) {
        long product = 1;
        int tempNum = Math.abs(num);

        if (tempNum == 0) {
            product = 0;
        } else {
            while (tempNum > 0) {
                int digit = tempNum % 10;
                product *= digit;
                tempNum /= 10;
            }
        }
        System.out.println("The product of digits in " + num + " is: " + product);
    }
}

class Q1 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.productOfDigits(234);
    }
}

// Output :  The product of digits in 234 is: 24