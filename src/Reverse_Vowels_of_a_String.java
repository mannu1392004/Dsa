import java.util.HashSet;

public class Reverse_Vowels_of_a_String {

   public static void main(String[] args){
       String s = "hello";
       System.out.println(reverseVowels(s));
   }
   public static String reverseVowels(String s) {
       HashSet<Character> vowels = new HashSet<>();
       vowels.add('a');
       vowels.add('e'); vowels.add('i'); vowels.add('o'); vowels.add('u');
       vowels.add('A'); vowels.add('E'); vowels.add('I'); vowels.add('O'); vowels.add('U');

       int fro = 0;
       int back =s.length()-1;

      StringBuilder arr = new StringBuilder(s);

       while (back>fro){
           if (vowels.contains(arr.charAt(fro))&&vowels.contains(arr.charAt(back))) {
               Character temp =  arr.charAt(fro);
               arr.setCharAt(fro,s.charAt(back));
               arr.setCharAt(back,temp);
               fro++;
               back--;
           }
           else if (vowels.contains(arr.charAt(fro))&&!vowels.contains(arr.charAt(back))){
               back--;
           }
           else if (vowels.contains(arr.charAt(back))&&!vowels.contains(arr.charAt(fro))){
               fro++;
           }
           else {
               fro++;
               back--;
           }
       }
     return arr.toString();
  }

}
