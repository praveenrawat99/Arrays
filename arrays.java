import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class arrays{
    public static void make_biggest_no(ArrayList<Integer> arr){
        Collections.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer x,Integer y){
                int xy=x;
                int yx=y;

                int count_x=0;
                int count_y=0;

                while(x>0){
                    count_x++;
                    x/=10;
                }

                while(y>0){
                    count_y++;
                    y/=10;
                }

                x=xy;
                y=yx;

                while(count_x>0){
                    count_x--;
                    yx*=10;
                }

                while(count_y>0){
                    count_y--;
                    xy*=10;
                }

                xy+=y;
                yx+=x;

                return -xy+yx;
            }
        });

        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i));
        }
    }
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(54);
        arr.add(546);
        arr.add(548);
        arr.add(60);
        
        make_biggest_no(arr);
    }
}


/*
 * Here is a step-by-step explanation of the code:
1.	The method compare takes two integers x and y as input parameters and returns an integer value based on their comparison.
2.	The variables xy and yx are initialized to x and y, respectively. These variables will be used later to store the modified values of x and y.
3.	The variables countx and county are initialized to zero. These variables will be used to count the number of digits in x and y, respectively.
4.	The while loop starting at line 13 counts the number of digits in x by repeatedly dividing x by 10 and incrementing countx until x becomes 0.
5.	Similarly, the while loop starting at line 19 counts the number of digits in y by repeatedly dividing y by 10 and incrementing county until y becomes 0.
6.	The values of x and y are restored to their original values stored in xy and yx, respectively.
7.	The while loop starting at line 25 appends x to y by multiplying yx by 10 for each digit in x.
8.	The while loop starting at line 31 appends y to x by multiplying xy by 10 for each digit in y.
9.	Finally, the method returns the difference between the concatenated values yx+x and xy+y, negated (-) so that the values are compared in descending order.
This sorting algorithm compares the values of xy+y and yx+x to determine their relative order. If xy+y is greater than yx+x, the method returns a negative value indicating that x should come before y in the sorted list. If xy+y is less than yx+x, the method returns a positive value indicating that y should come before x in the sorted list. If xy+y is equal to yx+x, the method returns 0 indicating that x and y are equal in terms of sorting order.
Overall, this algorithm sorts a list of integers by concatenating them into a single integer and comparing the concatenated values. 

meaning of this line -xy + yx;
The line -xy + yx is the final expression that the compare method returns. This expression is a mathematical calculation that determines the sorting order of two integers x and y by concatenating them into a single integer and comparing the concatenated values.
Let's break down this expression:
1.	-xy subtracts the value of xy from 0. This effectively negates the concatenated value of xy.
2.	+ yx adds the concatenated value of yx to the negated value of xy. This yields the difference between the concatenated values of xy+y and yx+x.
3.	The final result is the difference between xy+y and yx+x, negated.
The resulting integer value returned by this expression is used by sorting algorithms to determine the order of two integers in a list. If the result is negative, it means that x should come before y in the sorted list. If the result is positive, it means that y should come before x in the sorted list. If the result is zero, it means that x and y are equal in terms of sorting order.

Meaning of this while :  (countx > 0) { countx--; yx *= 10; }
This code block is a while loop that runs as long as the value of countx is greater than 0. The purpose of this loop is to left-pad the integer value of yx with zeroes so that it has the same number of digits as the integer value of x.
During each iteration of the loop, the value of countx is decremented by 1, and the value of yx is multiplied by 10. This has the effect of adding a zero to the end of the integer value of yx for each iteration of the loop.
For example, if x has a value of 123 and yx has a value of 45, the loop will run 3 times, because countx has a value of 3. During each iteration of the loop, yx will be multiplied by 10, so its value will be 450 after the first iteration, 4500 after the second iteration, and 45000 after the third iteration. At the end of the loop, yx will have the value 45000, which has the same number of digits as the value of x (i.e., 3 digits).

 */