class Logic {

    /**
     * Checks if a year is a leap year.
     * A year is a leap year if it's divisible by 4, except for end-of-century
     * years,
     * which must be divisible by 400.
     * The year to check.
     */

    void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

class Q1 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.checkLeapYear(2024);
    }
}

// Output : 2024 is a leap year.