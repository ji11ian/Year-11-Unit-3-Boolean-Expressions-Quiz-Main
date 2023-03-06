public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int n) {
        if (n >= 90 && n <= 100) {
            return 'A';
        } else if (n >= 80 && n <= 89) {
            return 'B';
        } else if (n >= 70 && n <= 79) {
            return 'C';
        } else if (n >= 60 && n <= 69) {
            return 'D';
        } else if (n >= 50 && n <= 59) {
            return 'E';
        } else {
            return 'F';
        }
    }

    // Question 2 - fizzBuzz
    public static String fizzBuzz(int n) {
        if (n % 3 == 0 && n % 5 != 0) {
            return "fizz";
        } else if (n % 5 == 0 && n % 3 != 0) {
            return "buzz";
        } else if (n % 5 == 0 && n % 3 == 0) {
            return "fizzbuzz";
        } else {
            return "unlucky";
        }
    }

    // Question 3 - frontBack
    public static String frontBack(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            return str.substring(0, 2) + str + str.substring(0, 2);
        }
    }

    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c) {
        return (a + b == c || a + c == b || b + c == a);
    }

    // Question 5 - endUp
    public static String endUp(String str) {
        if (str.length() <= 2) {
            return str.toUpperCase();
        } else {
            String first = str.substring(0, str.length() - 3);
            String last = str.substring(str.length() - 3, str.length());

            return first + last.toUpperCase();
        }
    }
}
