public class Is_Subsequence {
    public static void main(String[]args){
String s = "abc";
    String    t = "ahbgdc";

        System.out.println(isSubsequence(s,t));


    }
    public static boolean isSubsequence(String s, String t) {
if (s.isEmpty()){
    return true;
}


        int s1 = 0;
        int t1 =0;
        while (s1<s.length()&&t1<t.length()){

            if (s.charAt(s1)==t.charAt(t1)){
                s1++;
            }
            t1++;
            if (s1==s.length()){
                return true;
            }

        }



return false;
    }
}
