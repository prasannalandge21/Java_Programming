class Logic {
    void calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}

public class Q1 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.calculateSum(10);
    }
}

// Output : The sum of the first 10 natural numbers is: 55