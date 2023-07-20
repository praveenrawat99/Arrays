                                         //sum of max and min element

public class arrays{
    public static int max_min(int arr[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }

        int ans=max+min;
        return ans;
    }
    public static void main(String[] args){
        int arr[]={4,1,7,5,3,2,0};
        System.out.println(max_min(arr));
    }
}