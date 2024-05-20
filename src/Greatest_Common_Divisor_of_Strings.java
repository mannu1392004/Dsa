public class Greatest_Common_Divisor_of_Strings {
     public static void main(String[] args) {
        String s1 ="TAUXXTAUXXTAUXXTAUXXTAUXX";
        String s2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
         System.out.println(gcdOfStrings(s1,s2));
    }
    public static String gcdOfStrings(String str1, String str2) {
        // check
       if (str1.length()>str2.length()) {
           int x = 0;
           int y = 0;
           for (int i = 0; i < str1.length(); i++) {
               if (x == str2.length()) {
                   x = 0;
               }
               if (str1.charAt(i) == str2.charAt(x)) {
                   y++;

               }
               x++;
           }
           if (y == str1.length()) {
               return str1.substring(str2.length());
           }
       }
       else {
           int x = 0;
           int y = 0;
           for (int i = 0; i < str2.length(); i++) {
               if (x == str1.length()) {
                   x = 0;
               }
               if (str2.charAt(i) == str1.charAt(x)) {
                   y++;

               }
               x++;
           }
           if (y == str2.length()) {
               return str2.substring(str1.length());
       }

    }
       return "";
}
}
