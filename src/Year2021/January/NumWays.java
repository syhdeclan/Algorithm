package Year2021.January;

public class NumWays {
    public int numWays(int n) {
        if (n < 2) {
            return 1;
        }
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i < n + 1; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1000000007;
        }
        return arr[n];
    }
}
