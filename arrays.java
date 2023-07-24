public class arrays {
    public static boolean pair_sum(int arr[], int n, int x) {
        // Find the pivot element
        int i;
        for (i = 0; i < n - 1; i++)
            if (arr[i] > arr[i + 1])
                break;

        // l is now index of smallest element
        int l = (i + 1) % n;

        // r is now index of largest element
        int r = i;

        // Keep moving either l or r till they meet
        while (l != r) {
            // If we find a pair with sum x, we
            // return true
            if (arr[l] + arr[r] == x)
                return true;

            // If current pair sum is less, move
            // to the higher sum
            if (arr[l] + arr[r] < x)
                l = (l + 1) % n;

            // Move to the lower sum side
            else
                r = (n + r - 1) % n;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 11, 15, 6, 8, 9, 10 };
        if (pair_sum(arr, arr.length, 25)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

/*
 * here we used two pointer approach
 */