package anusha;
public class LogicalOperatorChallenge {

    public static boolean logicalOperatorChallenge(boolean a, boolean b, boolean c) {
        // Count the number of true values
        int trueCount = (a ? 1 : 0) + (b ? 1 : 0) + (c ? 1 : 0);
        // Check if at least two out of three variables are true
        return trueCount >= 2;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(logicalOperatorChallenge(true, true, true)); // Should print true
        System.out.println(logicalOperatorChallenge(true, true, false)); // Should print true
        System.out.println(logicalOperatorChallenge(true, false, true)); // Should print true
        System.out.println(logicalOperatorChallenge(false, true, true)); // Should print true
        System.out.println(logicalOperatorChallenge(false, false, false)); // Should print false
    }
}
