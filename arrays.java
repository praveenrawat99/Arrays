                                        //Kth largest element in an array

import java.util.Arrays;
import java.util.Collections;

public class arrays{
    public static int Kth_largest_element(Integer arr[],int k){
        Arrays.sort(arr, Collections.reverseOrder());

        return arr[k-1];
    }

    public static void main(String[] args){
        Integer arr [] = {12,3,5,7,19};
        System.out.println(Kth_largest_element(arr, 2));
    }
}