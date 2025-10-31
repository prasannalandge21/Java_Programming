class Logic {

    /**
     * Counts the total number of factors for a given number.
     * num The number whose factors are to be counted.
     */

    void countFactors(int num) {
        int factorCount = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factorCount++;
            }
        }
        System.out.println("Total number of factors for " + num + " is: " + factorCount);
    }
}

class Q4 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.countFactors(20);
    }
}
