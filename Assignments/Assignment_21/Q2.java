class Logic {

    /**
     * Counts the number of even and odd integers between 1 and n.
     * n The upper limit of the range.
     */

        int evenCount = 0;
        int oddCount = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                evenCount++;
            }else {
                oddCount++;
            }
        }
        System.out.println("In the range 1 to " + n + ":");
        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Total odd  numbers: " + oddCount);
    }
    

class Q2 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.countEvenOddRange(50);
    }
}

