import java.util.*;

public class Sort_Characters_By_Frequency {

    public static void main(String[] args){
        String s ="ccaaa";
        frequencySort(s);



    }
    public static String frequencySort(String s) {

        HashMap<Character,Integer> map = new HashMap<>();
        for (int i =0;i<s.length();i++){
            if (map.containsKey(s.charAt(i))){
                int x = map.get(s.charAt(i));
                x++;
                map.put(s.charAt(i),x);
            }
            else {
                map.put(s.charAt(i),1);
            }
        }

        Character [] key = new  Character[map.size()];
        int[] value = new  int[map.size()];

        int m =0;
        for (Map.Entry<Character, Integer> e :map.entrySet()){
          key[m] =e.getKey();
          value[m] =e.getValue();
          m++;
        }
        for (int i =0;i<key.length-1;i++){
            for (int j =0;j<key.length-1-i;j++){
                if (value[j]>value[j+1]){
                    Character temp = key[j];
                    key[j]=key[j+1];
                    key[j+1]=temp;


                    int temp2 = value[j];
                    value[j]=value[j+1];
                    value[j+1]=temp2;
                }

            }

        }

        StringBuilder s1= new StringBuilder();
        for (int i =key.length-1;i>=0;i--){
            for (int j=0;j<value[i];j++){
                s1.append(key[i]);

            }

        }

return s1.toString();

        }


}
