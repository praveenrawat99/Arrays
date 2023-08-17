public class arrays{
    public static void print_subarrays(int arr[]){
        int total_subarrays=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+"  ");
                    total_subarrays++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays = " + total_subarrays);
    }
    public static void main(String[] args){
        int arr[]={2,4,6,8,10};
        print_subarrays(arr);
    }
}