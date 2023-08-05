import java.util.HashMap;

public class arrays{
    public static int longest_subarray_sum_divisible_by_k(int arr[],int k){
        int max_length=0;
        int sum=0;

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            int mod=((sum%k)+k)%k;
            
            if(mod==0){
                max_length=i+1;
            }

            if(!map.containsKey(mod)){
                map.put(mod, i);
            }else{
                int size=i-map.get(mod);
                max_length=Math.max(max_length, size);
            }
        }
        return max_length;
    }
    public static void main(String[] args){
        int arr[]={4,5,0,-2,-3,1};

        System.out.println(longest_subarray_sum_divisible_by_k(arr, 5));
    }
}


/*
 * Initialize max_length to 0 and sum to 0.
Initialize a HashMap map to store the prefix sum modulo k and its corresponding index.
Loop through the array arr:
For i = 0:
Add the value arr[0] to the sum (sum = 0 + 4 = 4).
Calculate the modulo (sum % k = 4 % 5 = 4).
Ensure the modulo is not negative (mod = (4 + 5) % 5 = 4).
Check if mod is equal to 0. It is not, so continue.
Check if map contains the mod (4). It does not, so continue.
Put an entry in the map with key mod (4) and value i (map = {4=0}).
For i = 1:
Add the value arr[1] to the sum (sum = 4 + 5 = 9).
Calculate the modulo (sum % k = 9 % 5 = 4).
Ensure the modulo is not negative (mod = (4 + 5) % 5 = 4).
Check if mod is equal to 0. It is not, so continue.
Check if map contains the mod (4). It does contain it with a value of 0.
Calculate the size (i - map.get(mod) = 1 - 0 = 1).
Update max_length to the maximum of the current max_length and the calculated size (max_length = max(0, 1) = 1).
For i = 2:
Add the value arr[2] to the sum (sum = 9 + 0 = 9).
Calculate the modulo (sum % k = 9 % 5 = 4).
Ensure the modulo is not negative (mod = (4 + 5) % 5 = 4).
Check if mod is equal to 0. It is not, so continue.
Check if map contains the mod (4). It does contain it with a value of 0.
Calculate the size (i - map.get(mod) = 2 - 0 = 2).
Update max_length to the maximum of the current max_length and the calculated size (max_length = max(1, 2) = 2).
Continue this process for all elements of the array.
The final value of max_length will be 6. The longest subarray whose sum is divisible by k=5 is the entire array: {4, 5, 0, -2, -3, 1}.

So, the function longest_subarray_sum_divisible_by_k(arr, 5) will indeed return 6.
 */