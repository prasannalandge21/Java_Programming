class Logic {
    void printOddNumbers(int n) {
        System.out.print("Odd numbers up to " + n + ": ");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + (i + 2 <= n ? ", " : ""));
        }
        System.out.println();
    }
}

class Q3 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.printOddNumbers(20);
    }
}

// Output : Odd numbers up to 20: 1, 3, 5, 7, 9, 11, 13, 15, 17, 19