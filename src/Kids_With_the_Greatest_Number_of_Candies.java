import java.util.ArrayList;
import java.util.List;

public class Kids_With_the_Greatest_Number_of_Candies {
    public static void main(String [] args){

        int candies[] = {2,3,5,1,3};
        int extra = 3;
        System.out.println(kidsWithCandies(candies,extra));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
int max =0;
List<Boolean>list = new ArrayList<>();
        for (int val:candies){
    max= Integer.max(max,val);
}

        for (int val:candies){

            if (max<=val+extraCandies){
                list.add(true);
            }
            else {
                list.add(false);
            }
        }
        return list;
    }
}
