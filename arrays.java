public class arrays{
    public static int max_subarray_sum(int arr[]){
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;

        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];

        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;

                curr_sum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(max_sum<curr_sum){
                    max_sum=curr_sum;
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


/*
 * here we used prefix sum concept
 * 
 * 
 * Step 1: Initialization and Prefix Sum Calculation

prefix = {1, -1, 5, 4, 7}
Step 2: Outer Loop (i = 0)

start = 0
Inner Loop (j = 0 to 4):
end = 0: curr_sum = prefix[0] = 1
end = 1: curr_sum = prefix[1] - prefix[0] = -2
end = 2: curr_sum = prefix[2] - prefix[0] = 5
end = 3: curr_sum = prefix[3] - prefix[0] = 4
end = 4: curr_sum = prefix[4] - prefix[0] = 7
max_sum is updated to 7
Step 3: Outer Loop (i = 1)

start = 1
Inner Loop (j = 1 to 4):
end = 1: curr_sum = prefix[1] = -1
end = 2: curr_sum = prefix[2] - prefix[1] = 6
end = 3: curr_sum = prefix[3] - prefix[1] = 5
end = 4: curr_sum = prefix[4] - prefix[1] = 8
max_sum is updated to 8
Step 4: Outer Loop (i = 2)

start = 2
Inner Loop (j = 2 to 4):
end = 2: curr_sum = prefix[2] = 5
end = 3: curr_sum = prefix[3] - prefix[2] = -1
end = 4: curr_sum = prefix[4] - prefix[2] = 2
max_sum remains 8
Step 5: Outer Loop (i = 3)

start = 3
Inner Loop (j = 3 to 4):
end = 3: curr_sum = prefix[3] = 4
end = 4: curr_sum = prefix[4] - prefix[3] = 3
max_sum remains 8
Step 6: Outer Loop (i = 4)

start = 4
Inner Loop (j = 4):
end = 4: curr_sum = prefix[4] = 7
max_sum remains 8
Final Output: 8

The correct maximum subarray sum is calculated as 8,
which corresponds to the subarray [6, -1, 3]. I apologize for the
earlier mistake in my explanation. The provided code indeed calculates the maximum subarray sum correctly.
*/