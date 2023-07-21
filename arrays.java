                                         //maximum product Sub_array
public class arrays{
    public static int max_product(int arr[]){
        int max_product=Integer.MIN_VALUE;
        int current_product=1;
        
        for(int i=0;i<arr.length;i++){
            current_product*=arr[i];
            if(current_product<=0){
                current_product=0;
            }
            max_product=Math.max(max_product, current_product);
        }
        return max_product;
    }
    public static void main(String[] args){
        int arr[]={2,3,-2,4};
        System.out.println("Maximum Product sub array is : "+ max_product(arr));
    }
}



/*HINT
 * kadane's algorithm
 */