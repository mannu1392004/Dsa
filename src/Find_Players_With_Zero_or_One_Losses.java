import java.util.*;

public class Find_Players_With_Zero_or_One_Losses {
    public static void main(String[] args){
     int[][]   matches = {{2,3},{1,3},{5,4},{6,4}};
        System.out.println( findWinners(matches));
    }
    public static List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer>win = new HashMap<>();
        HashMap<Integer,Integer>loose = new HashMap<>();
        List<List<Integer>>lists = new ArrayList<>();
        for (int i = 0;i<matches.length;i++){
            win.put(matches[i][0],0);
         if (loose.containsKey(matches[i][1])){
             int val = loose.get(matches[i][1]);
             val++;
             loose.put(matches[i][1],val);
         }
         else {
             loose.put(matches[i][1], 1);
         }
        }
        List<Integer>loosers = new ArrayList<>();
        for (Map.Entry<Integer,Integer> e :loose.entrySet()){
            win.put(e.getKey(), e.getValue());
            if (e.getValue()==1){
                loosers.add(e.getKey());
            }

        }
List<Integer>winner = new ArrayList<>();
        for (Map.Entry<Integer,Integer> e :win.entrySet()){
            if (e.getValue()==0){
                winner.add(e.getKey());
            }
        }
        Collections.sort(winner);
        Collections.sort(loosers);
lists.add(winner);
lists.add(loosers);
        System.out.println(loose);

return lists;
    }
}
