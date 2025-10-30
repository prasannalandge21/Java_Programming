class Logic {
    void sumOfDigits(int num) {
        int originalNum = num;
        num = Math.abs(num);
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("The sum of digits of " + originalNum + " is: " + sum);
    }
}

public class Q1 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.sumOfDigits(1234);
    }
}

// Output : The sum of digits of 1234 is: 10