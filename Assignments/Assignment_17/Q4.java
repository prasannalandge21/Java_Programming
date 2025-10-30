class Logic {
    void findMin(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        System.out.println("The minimum of " + a + ", " + b + ", and " + c + " is: " + min);
    }
}

class Q4 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.findMin(3, 7, 2);
    }
}

// Output : The minimum of 3, 7, and 2 is: 2