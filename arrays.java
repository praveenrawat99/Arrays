import java.util.HashSet;

public class arrays{
    public static void three_sum(int arr[]){
        boolean found = true;
        for(int i=0;i<arr.length-1;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i+1;j<arr.length;j++){
                int X=-(arr[i]+arr[j]);
                if(set.contains(X)){
                    System.out.println("Triplet is: "+arr[i]+" , "+arr[j]+" , "+X);
                    found=true;
                }else{
                    set.add(arr[j]);
                }
            }
        }
        if(found==false){
            System.out.println("no triplet");
        }
    }
    public static void main(String[] args){
        int arr[]={-1,0,1,2,-1,-4};
        three_sum(arr);
    }
}


/*for this question 
 * we have to find the triplets with zero sum
 * so we run a loop from int i=0 to i=arr.length-2
 * we will implement a HashSet 
 * after that we run a second nested loop from j=i+1 to j=arr.length-1
 * after this we check a condition int X=-(arr[i]+arr[j])
 * if X is already present in the set so we will get triplets with zero sum 
 * if not so we will add arr[j] in the set
 */