class Logic {
    void findMax(int a, int b) {
        int max = (a > b) ? a : b;
        System.out.println("The maximum of " + a + " and " + b + " is: " + max);
    }
}

class Q3 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.findMax(20, 15);
    }
}

// Output : The maximum of 20 and 15 is: 20