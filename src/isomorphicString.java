import java.util.HashMap;

public class isomorphicString {

    public static void main(String[] args){

       String s = "aaeaa", t = "uuxyy";

        System.out.println(   isIsomorphic(s,t));



    }

    public static boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        if (s.length() == t.length()) {
            for (int i = 0; i < s.length(); i++) {
if (map1.containsKey(s.charAt(i))&&map1.get(s.charAt(i))!=t.charAt(i)){
    return false;
}
else {

    map1.put(s.charAt(i),t.charAt(i));

}

if (map2.containsKey(t.charAt(i))&&map2.get(t.charAt(i))!=s.charAt(i)){
    return false;
}
else {
    map2.put(t.charAt(i),s.charAt(i));
}




            }


        }
        else {
            return  false;
        }

    return true;
    }

}
