public class arrays{
    public static int binary_Search(int arr[],int start,int end,int key){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid==key){
                return mid;
            }else if(key<mid){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        int arr[]={0,1,2,3,4,5,6,7};
        System.out.println("Element found at index = " + binary_Search(arr, 0, arr.length-1, 7));
    }
}




/*
 * here we used binary search algorithm
 */