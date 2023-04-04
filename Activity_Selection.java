import java.util.*;
class Activity_Selection{
    public static void main(String[] args) {
        //end time sorted
        // int[] start = {1, 3, 0, 5, 8, 5};
        // int[] end = {2, 4, 6, 7, 9, 9};   // end time arr sorted in ascending order if it 
        // not sorted, first we need to sort this end arr in ascending order.

        int[] start = {1, 3, 2, 5};
        int[] end = {2, 4, 3, 6};
        //Sorting arr based on end time in increasing order
        int[][ ] acitivities = new int[start.length][3];
        for(int i=0; i<start.length; i++){
            acitivities[i][0] = i;
            acitivities[i][1] = start[i];
            acitivities[i][2] = end[i];
        }
        Arrays.sort(acitivities,Comparator.comparingDouble(o->o[2]));
        int maxAct=1;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st Activity
        maxAct=1;
        // ans.add(0); // first activity index
        ans.add(acitivities[0][0]);
        // int lastEnd = end[0];
        int lastEnd = acitivities[0][2];

        // for(int i=1; i<end.length; i++){
        //     if(start[i]>=lastEnd){
        //         maxAct+=1;
        //         ans.add(i);
        //         lastEnd=end[i];
        //     }
        // }
        for(int i=1; i<acitivities.length; i++){
            if(acitivities[i][1] > lastEnd){
                maxAct+=1;
                ans.add(acitivities[i][0]);
                lastEnd = acitivities[i][2]; 
            }
        }

        System.out.println("max activity = "+maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }

    }
}