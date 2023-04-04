import java.util.*;
class Activity_Selection{
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};   // end time arr sorted in ascending order if it 
        // not sorted, first we need to sort this end arr in ascending order.

        int maxAct=1;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st Activity
        maxAct=1;
        ans.add(0); // first activity index
        int lastEnd = end[0];

        for(int i=1; i<end.length; i++){
            if(start[i]>=lastEnd){
                maxAct+=1;
                ans.add(i);
                lastEnd=end[i];
            }
        }

        System.out.println("max activity = "+maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }

    }
}