import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class arrays{
    public static void biggest_number(ArrayList<String> arr){
        Collections.sort(arr,new Comparator<String>() {
            @Override
            public int compare(String X,String Y){
                String str1=X+Y;
                String str2=Y+X;

                return str1.compareTo(str2)>0?-1:1;
            }
        });
        
        Iterator<String> i=arr.iterator();
        while(i.hasNext()){
            System.out.print(i.next());
        }
    }
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("1");
        arr.add("34");
        arr.add("3");
        arr.add("98");
        arr.add("9");
        arr.add("76");
        arr.add("45");
        arr.add("4");

        biggest_number(arr);
    }
}


/*
Suppose we have the following input ArrayList of strings:
cssCopy code
["9", "8", "54", "99", "234"]
Step 1: The Collections.sort method is called on the arr list, using a custom comparator.
The comparator compares two strings by concatenating them in two different orders and comparing the results.
Step 2: The comparator compares the strings using the compare method. Let's consider a couple of comparisons:
•	When comparing "9" and "8":
•	xy = "98" (9 + 8)
•	yx = "89" (8 + 9)
•	Since xy is greater than yx, the comparator returns -1, indicating that "9" should appear before "8"
in the sorted order.
•	When comparing "8" and "54":
•	xy = "854" (8 + 54)
•	yx = "548" (54 + 8)
•	Since xy is greater than yx, the comparator returns -1, indicating that "8" should appear before "54" in the sorted order.
Step 3: The arr list is sorted based on the custom comparator. After sorting, the list becomes:
cssCopy code
["99", "9", "8", "54", "234"]
Step 4: An iterator i is created to iterate over the sorted arr list.
Step 5: The while loop starts iterating over the elements of the list.
Step 6: Inside the loop, each element is printed using System.out.print. The output will be:
Copy code
999854234
Step 7: The loop continues until there are no more elements in the iterator.
Step 8: The method execution is complete.
In summary, the code will sort the input list in such a way that the
concatenated strings form the largest possible number. In this case, the largest possible number is "999854234".

 */