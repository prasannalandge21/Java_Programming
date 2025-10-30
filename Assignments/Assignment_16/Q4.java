class Logic {
    void reverseNumber(int num) {
        int originalNum = num;
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        System.out.println("The reverse of " + originalNum + " is: " + reversedNum);
    }
}

class Q4 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.reverseNumber(1234);
    }
}

// Output : The reverse of 1234 is: 4321