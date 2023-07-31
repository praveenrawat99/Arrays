import java.util.Arrays;
import java.util.Comparator;

public class arrays{
    public static class Interval{
        int start,end;

        Interval(int start,int end){
            this.start = start;
            this.end = end;
        }
    }

    public static void merge_intervals(Interval arr[]){
        Arrays.sort(arr,new Comparator<Interval>() {
            public int compare(Interval i1,Interval i2){
                return i1.start-i2.start;
            }
        });

        int index=0;
        for(int i=1;i<arr.length;i++){
            if(arr[index].end>=arr[i].start){
                arr[index].end=Math.max(arr[index].end, arr[i].end);
            }else{
                index++;
                arr[index]=arr[i];
            }
        }
        System.out.println("Merged intervals : ");
        for(int i=0;i<=index;i++){
            System.out.println("[" + arr[i].start + "," + arr[i].end + "]");
        }
    }
    public static void main(String[] args){
        Interval arr[] = new Interval[4];
        arr[0] = new Interval(6, 8);
        arr[1] = new Interval(1, 9);
        arr[2] = new Interval(2, 4);
        arr[3] = new Interval(4, 7);
        merge_intervals(arr);
    }
}


//here we are doing comparison based sorting
//here we start from a static class it helps us in comparison based sorting
/*
 * first we make a class then we push our input in comparison based sorting
 * then we write a condition for compare the first element with the second then
 * if we find some clues then we do merge of last element of previous and the current element
 */