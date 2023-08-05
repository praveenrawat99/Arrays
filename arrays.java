public class arrays{
    public static int make_array_palindrome(int arr[]){
        int operations=0;

        for(int i=0,j=arr.length-1;i<=j;){
            if(arr[i]==arr[j]){
                j--;
                i++;
            }else if(arr[i]<arr[j]){
                i++;
                arr[i]+=arr[i-1];
                operations++;
            }else{
                j--;
                arr[j]+=arr[j+1];
                operations++;
            }
        }
        return operations;
    }
    public static void main(String[] args){
        int arr[]={11,14,15,99};

        System.out.println(make_array_palindrome(arr));
    }
}

/*
 * here we used two pointer approach
 */