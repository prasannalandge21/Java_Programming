class Logic {
    void countDigits(int num) {
        if (num == 0) {
            System.out.println("The number of digits in 0 is: 1");
            return;
        }
        int originalNum = num;
        num = Math.abs(num);
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        System.out.println("The number of digits in " + originalNum + " is: " + count);
    }
}

class Q5 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.countDigits(7865);
    }
}
// Output : The number of digits in 7865 is: 4