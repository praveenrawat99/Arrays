public class arrays{
    public static void product_of_array_except_itself(int arr[]){
        int res[]=new int[arr.length];
        int product_of_all_before_ith_element=1;
        int product_of_all_after_ith_element=1;

        for(int i=0;i<arr.length;i++){
            res[i]=product_of_all_before_ith_element;
            product_of_all_before_ith_element*=arr[i];
        }

        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(res));

        for(int i=arr.length-1;i>=0;i--){
            res[i]*=product_of_all_after_ith_element;
            product_of_all_after_ith_element*=arr[i];
        }
        
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+"  ");
        }
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4};
        product_of_array_except_itself(arr);
    }
}

/*
 * here we used previous sum algorithm
 */