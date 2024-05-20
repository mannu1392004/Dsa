import java.util.Scanner;

public class contest2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String s = sc.nextLine();
        StringBuilder s1 = new StringBuilder();


        for (int i = 0;i<x;i++){
        s1.append(s.charAt(i));
        }
        for (int i = 1;i<x;i++){
            if (s1.charAt(i)<s1.charAt(i-1)){
                s1.repeat(i-1,' ');
            }

        }






    }
}
