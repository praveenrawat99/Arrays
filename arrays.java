                                                //next permutation

public class arrays{
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    public static void reverse(int arr[],int si,int ei){
        while (si<ei) {
            //swap the values
            swap(arr, si, ei);
            ++si;
            --ei;
        }
    }

    public static void next_permutation(int arr[]){
        int i,j;

        for(i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                break;
            }
        }

        if(i<0){
            reverse(arr, 0, arr.length-1);
        }else{
            for(j=arr.length-1;j>i;j--){
                if(arr[j]>arr[i]){
                    break;
                }
            }

            swap(arr, i, j);
            reverse(arr, i+1, arr.length-1);
        }
    }
    public static void main(String [] args){
        int arr[]={4,1,7,5,3,2,0};

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }

        next_permutation(arr);

        System.out.println();

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }
}

/*in this question
 * we have to find the pivot by which we easily make an array lexicographically grater
 * here we run a backward loop by making a condition arr[i]<arr[i+1] after that we will stop
 * after finding pivot we will think about if there is no pivot so in that condition we will 
 * just reverse an array but if pivot will find
 * so we just run again backward loop by comparing the pivot from the values by this condition 
 * arr[j]>arr[i] after that we will stop so we will come out from the loop so after that we will
 *  do swap i and j then we do reverse the array from i+1 to arr.length-1 
 */