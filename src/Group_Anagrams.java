import java.util.*;

public class Group_Anagrams {
    public static void main(String[] args){
groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});

    }

    public static void groupAnagrams(String[] strs) {
List<String>s  = new ArrayList<String>();
      List<List<String>>main = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
         for (int i =0;i<strs.length;i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);

            String s2 = new String(chars);
              s.add(s2);
         set.add(s2);
        }
        System.out.println(s);
         List<String>set2 = new ArrayList<>();
Iterator<String> it = set.iterator();
         while (it.hasNext()){
    set2.add(it.next());
         }
         for (int i  =0;i<set2.size();i++){
             List<String>se = new ArrayList<>();
             for (int j = 0;j<s.size();j++){
                 if (Objects.equals(set2.get(i), s.get(j))){
                     se.add(strs[j]);
                 }
             }
             main.add(se);
         }
        System.out.println(main);

    }
}
