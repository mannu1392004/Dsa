import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class String_Compression {
public static  void main(String args[]){

char[] x ={'a'};
compress(x);
}
    public static int compress(char[] chars) {
        char[] chars1 = new char[chars.length];
        List<Character>list = new ArrayList<>();
        List<Integer>add = new ArrayList<>();
        int i =0;
        int j = i+1;
        while (j<chars.length){


            if (chars[i] ==chars[j]){
                i++;
                j++;
            }
            else {
                list.add(chars[i]);
                add.add(j);
                i = j;
                j++;}
            if (i ==chars.length-1){
                list.add(chars[i]);
                add.add(j);
            }
        }

        int k = 0;
        for (int m = 0;m<list.size();m++){
            chars1[k] = list.get(m);
            k++;
            if (add.get(m)!=1){
                if (m==0){
                    chars1[k] = add.get(m).toString().charAt(0);
                    k++;
                }
                else {

                    int x =(add.get(m)-add.get(m-1));
                    if (x>1&&x<10) {
                        chars1[k] = Integer.toString(x).charAt(0);
                        k++;
                    }
                    if (x>=10){
                        chars1[k] = Integer.toString(x).charAt(0);
                        k++;
                        chars1[k] = Integer.toString(x).charAt(1);
                        k++;
                    }

                }
            }
        }
        if (!add.isEmpty()) {
            int ans = add.getFirst();
            for (int px = 0; px < add.size() - 1; px++) {
                ans = (add.get(px + 1) - add.get(px)) + ans;

            }

            return ans;


        }



        return 1;
    }
}
