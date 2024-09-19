import java.util.*;

public class CollectionFunction {
    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40,5,4,3,21,0};
        int Indx = Arrays.binarySearch(arr,30); 
        
        System.out.println(Indx);

        // sorting 
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.fill(arr,55);
        System.out.println(Arrays.toString(arr));
    }
}
