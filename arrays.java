public class arrays{
    public static int max_subarray_sum(int arr[]){
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                curr_sum=0;
                for(int k=start;k<=end;k++){
                    curr_sum+=arr[k];
                    if(curr_sum>max_sum){
                        max_sum=curr_sum;
                    }
                }
            }
        }
        return max_sum;
    }
    public static void main(String[] args){
        int arr[]={1,-2,6,-1,3};
        System.out.println(max_subarray_sum(arr));
    }
}