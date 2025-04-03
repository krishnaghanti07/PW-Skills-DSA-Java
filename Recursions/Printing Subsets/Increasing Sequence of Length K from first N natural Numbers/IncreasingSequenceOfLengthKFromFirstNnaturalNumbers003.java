import java.util.*;

public class IncreasingSequenceOfLengthKFromFirstNnaturalNumbers003 {
    public static void printSequences(int n, int k, int idx, String ans) {
        // Base case: if we've formed a sequence of length k, print it
        if (ans.length() == k) {
            System.out.println(ans);
            return;
        }
        
        // If we've reached the end of the number range, stop
        if (idx > n) {
            return;
        }

        // Exclude the current index and move to the next
        printSequences(n, k, idx + 1, ans);

        // Include the current index and move to the next (idx+1 ensures increasing order)
        char curr = (char)(idx + '0');
        printSequences(n, k, idx + 1, ans + curr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Enter the limit (length of the sequence): ");
        int k = sc.nextInt();

        String ans = "";
        printSequences(n, k, 1, ans);
    }
}
