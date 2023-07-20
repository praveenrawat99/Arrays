                                  //chocolate distribution problem

import java.util.Arrays;

public class arrays{
    public static int chocolate_distribution(int arr[],int m){
        Arrays.sort(arr);
        int min_diff=Integer.MAX_VALUE;
        for(int i=0;i+m-1<arr.length;i++){
            if(min_diff>arr[i+m-1]-arr[i]){
                min_diff=arr[i+m-1]-arr[i];
            }
        }
        return min_diff;
    }
    public static void main(String[] args){
        int arr[]={7,3,2,4,9,12,56};
        System.out.println(chocolate_distribution(arr, 3));
    }
}

/*In this question 
 * we have to distribute the chocolate packets in such a way that each student get 
 * min.. no. of chocolates such that the difference b/w max.. and min.. no. of chocolates is min..
 * 
 * so the approach is first we have to sort an array after that we have to write a condition 
 * by which we easily distribute chocolates
 * 
 * first we run the loop from i=0; and we have set the value of i with m in simple words we have to run the 
 * loop with difference of m  i+m-1<arr.length
 * after all of that we will find difference initially we take the min_diff +infinite then we check it from
 * the condition if arr[i+m-1]-arr[i] will give the min.. diff so we will update the min_diff and return it from the loop
 */