class Logic {
    void findFactorial(int num) {
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + num + " is: " + factorial);
    }
}

class Q3 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.findFactorial(5);
    }
}

// Output : The factorial of 5 is: 120