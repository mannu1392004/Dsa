import java.util.Scanner;

public class kek {

        public static void main(String args[]){

            Scanner sc = new Scanner(System.in);

            int x = sc.nextInt();
            int y = sc.nextInt();

            switch (y){
                case 100:
                    System.out.println(x
                            /100);
                    break;

                case 20:
                    System.out.println(x/20);
break;

                case 1:
                    System.out.println(x);
break;

            }


        }
    }


