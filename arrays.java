import java.util.Arrays;

public class arrays{
    public static void three_sum(int arr[],int tar){
        Arrays.sort(arr);
        boolean found=false;
        for(int i=0;i<arr.length-1;i++){
            int left=i+1;
            int right=arr.length-1;
            int X=arr[i];

            while(left<right){
                if(arr[left]+arr[right]+X==tar){
                    System.out.print(X+"  ");
                    System.out.print(arr[left]+"  ");
                    System.out.println(arr[right]+"  ");

                    left++;
                    right--;
                    found=true;
                }
                else if(arr[left]+arr[right]+X<tar){
                    left++;
                }else{
                    right--;
                }
            }
        }
        if(found!=true){
            System.out.println("no triplets equal to target");
        }
    }
    public static void main(String[] args){
        int arr[]={-3,0,1,2,-1,4};
        three_sum(arr, 2);
    }
}


/*
 * here we used three pointer approach
*/