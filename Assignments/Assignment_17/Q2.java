class Logic {
    void checkPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;
        int temp = num;
        while (temp != 0) {
            reversedNum = reversedNum * 10 + temp % 10;
            temp /= 10;
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a Palindrome.");
        } else {
            System.out.println(originalNum + " is NOT a Palindrome.");
        }
    }
}

class Q2 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.checkPalindrome(121);
    }
}

// Output : 121 is a Palindrome.