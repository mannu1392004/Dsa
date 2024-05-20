import java.util.Scanner;

public class Access_Control {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();

        for (int i = 0;i<test_case;i++) {
            int length_of_string = sc.nextInt();
            int access = sc.nextInt();

            String s = sc.next();
            System.out.println(access(s,length_of_string,access));}

    }
    public static String access(String s,int length_of_string,int access){
        int x = 0;
            for (int j = 0; j < length_of_string; j++) {
                if (s.charAt(j) == '0') {
                    x--;
                } else {
                    x = access;
                }

                if (x < 0) {
                    return "NO";
                }
            }

    return "yes";}

}

