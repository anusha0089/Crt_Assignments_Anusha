package anusha;
public class ArithmeticOperatorChallenge {

    // Implement addition without using the + operator
    public static int add(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    // Implement subtraction without using the - operator
    public static int subtract(int a, int b) {
        return add(a, add(~b, 1));
    }

    // Implement multiplication without using the * operator
    public static int multiply(int a, int b) {
        int result = 0;
        while (b != 0) {
            if ((b & 1) == 1) {
                result = add(result, a);
            }
            a <<= 1;
            b >>= 1;
        }
        return result;
    }

    // Implement division without using the / operator
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }

        int quotient = 0;
        int sign = ((a < 0) ^ (b < 0)) ? -1 : 1;

        long dividend = Math.abs((long) a);
        long divisor = Math.abs((long) b);

        while (dividend >= divisor) {
            dividend = subtract((int) dividend, (int) divisor);
            quotient = add(quotient, 1);
        }

        return multiply(quotient, sign);
    }

    // Implement finding remainder without using the % operator
    public static int remainder(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }

        int sign = (a < 0) ? -1 : 1;
        long dividend = Math.abs((long) a);
        long divisor = Math.abs((long) b);

        while (dividend >= divisor) {
            dividend = subtract((int) dividend, (int) divisor);
        }

        return multiply((int) dividend, sign);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(add(5, 3));       // Expected: 8
        System.out.println(subtract(10, 3));  // Expected: 7
        System.out.println(multiply(4, 6));   // Expected: 24
        System.out.println(divide(20, 4));    // Expected: 5
        System.out.println(remainder(17, 4)); // Expected: 1
    }
}

