class Logic {

    /*
     * Displays a student's grade based on their marks.
     * The student's marks out of 100.
     */

    void displayGrade(int marks) {
        char grade;
        if (marks > 100 || marks < 0) {
            System.out.println("Invalid marks entered.");
            return;
        }

        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Marks: " + marks + ", Grade: " + grade);
    }
}

class Q2 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.displayGrade(82);
        obj.displayGrade(95);
        obj.displayGrade(45);
    }
}

// Output : Marks: 82, Grade: B
// Output : Marks: 95, Grade: A
// Output : Marks: 45, Grade: F
