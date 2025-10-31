class Logic {
    /**
     * Finds and displays all factors of a given number.
     *  num The number whose factors are to be found.
     */

    void displayFactors(int num) { 
        System.out.print("Factors of " + num + " are: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

class Q3 {
    public static void main(String args[]) { 
        Logic obj = new Logic();
        obj.displayFactors(12); 
    }
}