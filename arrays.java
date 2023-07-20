import java.util.Arrays;

public class arrays {
    public static void repeat(int arr[]) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i]);
                break;
            }

            if(i==arr.length-2){
                System.out.println("there is no repeating number");
            }
        }
    }

    public static void missing(int arr[]) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            int ans=arr[i]-1;
            if(ans!=arr[i-1]){
                System.out.println(ans);
                break;
            }

            if(i==arr.length-1){
                System.out.println("there is no missing number");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,5,4,8,7,9,3 };
        repeat(arr);
        missing(arr);
    }
}
