class Logic {
    void printEvenNumbers(int n) {
        System.out.print("Even numbers up to " + n + ": ");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + (i + 2 <= n ? ", " : ""));
        }
        System.out.println();
    }
}

class Q2 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.printEvenNumbers(20);
    }
}
        
// Output : Even numbers up to 20: 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 
    