public class arrays {
    public static int min(int arr[], int si, int ei) {
        while (si < ei) {
            int mid = si + (ei - si) / 2;
            if (arr[mid] > arr[mid + 1]) {
                return arr[mid];
            } else if (arr[mid] < arr[mid - 1]) {
                return arr[mid - 1];
            } else if (arr[mid] < arr[si]) {
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }
        return arr[si];
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 8, 1, 2 };
        System.out.println(min(arr, 0, arr.length - 1));
    }
}

/*
 * we use binary search here
 */