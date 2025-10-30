class Logic {
    void checkPrime(int num) {
        if (num <= 1) {
            System.out.println(num + " is NOT a Prime number.");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is NOT a Prime number.");
        }
    }
}

class Q1 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.checkPrime(11);
    }
}

// Output : 11 is a Prime number.
