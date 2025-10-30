class Logic {
    void sumEvenOddDigits(int num) {
        int originalNum = num;
        num = Math.abs(num);
        int sumEven = 0;
        int sumOdd = 0;

        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                sumEven += digit;
            } else {
                sumOdd += digit;
            }
            num /= 10;
        }

        System.out.println("For number " + originalNum + ":");
        System.out.println("  Sum of Even Digits: " + sumEven);
        System.out.println("  Sum of Odd Digits: " + sumOdd);
    }
}

class Q4 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.sumEvenOddDigits(123456);
    }
}

/* Output : For number 123456:
  Sum of Even Digits: 12
  Sum of Odd Digits: 9
  
