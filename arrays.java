public class arrays{
    public static int kadane_s(int arr[]){
        int max_sum=Integer.MIN_VALUE;
        int curr_sum=0;

        for(int i=0;i<arr.length;i++){
            curr_sum=Math.max(arr[i], curr_sum+arr[i]);
            max_sum=Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }
    public static void main(String[] args){
        int arr[]={1,-2,6,-1,3};
        System.out.println("Max sum is = "+kadane_s(arr));
    }
}


/*
 * kadane's algorithm
 */