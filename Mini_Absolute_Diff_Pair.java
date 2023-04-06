import java.util.*;
public class Mini_Absolute_Diff_Pair {
    public static void main(String[] args){
        int arr1[] = {1,7,5};
        int arr2[] = {2,3,5};
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int minDiff = 0;
        for(int i=0; i<arr1.length; i++){
            minDiff += Math.abs(arr1[i]-arr2[i]);
        }
        System.out.println("Minimum absolute diff of pairs " + minDiff);
    }
    
}
