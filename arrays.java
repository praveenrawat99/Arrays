import java.util.HashMap;

public class arrays{
    public static int subarray_sum_divisible_by_k(int arr[],int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0, 1);
        
        int running_sum=0;
        int count=0;

        for(int i=0;i<arr.length;i++){
            running_sum+=arr[i];
            int reminder=running_sum%k;
            if(reminder<0){
                reminder+=k;
            }

            if(map.containsKey(reminder)){
                count+=map.get(reminder);
            }
            map.put(reminder, map.getOrDefault(reminder, 0)+1);
        }
        return count;
    }
    public static void main(String[] args){
        int arr[]={4,5,0,-2,-3,1};
        System.out.println(subarray_sum_divisible_by_k(arr, 5));
    }
}


/*
 * Initialize a HashMap map to store the running sum modulo k and its frequency.
Put an initial entry in the map with key 0 and value 1.
Initialize running_sum to 0 and count to 0.
Loop through the array arr:
For i = 0:
Add the value arr[0] to the running_sum (running_sum = 0 + 4 = 4).
Calculate the reminder (running_sum % k = 4 % 5 = 4).
Since the reminder is not negative, continue.
Check if map contains the reminder (4). It does not, so continue.
Put an entry in the map with key reminder (4) and value 1 (map = {0=1, 4=1}).
For i = 1:
Add the value arr[1] to the running_sum (running_sum = 4 + 5 = 9).
Calculate the reminder (running_sum % k = 9 % 5 = 4).
Since the reminder is not negative, continue.
Check if map contains the reminder (4). It does contain it with a value of 1.
Increment count by the value of the reminder in the map (count = 0 + 1 = 1).
Put an entry in the map with key reminder (4) and value 2 (map = {0=1, 4=2}).
Continue this process for all elements of the array.
The final value of count will be 7. The subarrays whose sum is divisible by k=5 are:

{5}
{5, 0}
{5, 0, -2, -3, 1}
{0}
{0, -2, -3, 1}
{0, -2, -3, 1, 4}
{4}
So, the function subarray_sum_divisible_by_k(arr, 5) will return 7.
 */