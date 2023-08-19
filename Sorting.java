import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};
        
        // Sorting the array
        Arrays.sort(numbers);
        
        // Printing the sorted array
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
