                                    //minimum in rotated sorted array
public class arrays{
    public static int min(int arr[],int si,int ei){
        while(si<ei){
            int mid=si+(ei-si)/2;
            if(arr[mid+1]<arr[mid]){
                return arr[mid+1];
            }else if(arr[mid-1]>arr[mid]){
                return arr[mid];
            }else if(arr[mid]<arr[ei]){
                ei=mid-1;
            }else{
                si=mid+1;
            }
        }
        return arr[si];
    }

    public static int max(int arr[],int si,int ei){
        while (si < ei) {
            int mid=si+(ei-si)/2;
            if(arr[mid+1]<arr[mid]){
                return arr[mid];
            }else if(arr[mid-1]>arr[mid]){
                return arr[mid-1];
            }else if(arr[mid]<arr[si]){
                ei=mid-1;
            }else{
                si=mid+1;
            }
        }
        return arr[si];
    }
    public static void main(String[] args){
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(min(arr, 0, arr.length-1));
        System.out.println(max(arr, 0, arr.length-1));
    }
}







/*
 * here we used optimised binary search
 */