import java.util.Scanner;

public class contest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 1; i <= test; i++) {
            int h = sc.nextInt();
            int x = sc.nextInt();
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();
            int k = sc.nextInt();

            int hitsWithGun = (h + x - 1) / x;
            int y5 = 0;
            int hitsWithLaser = 0;
            while (k > 0 || h > y5) {
                y5 = y5 + y1;
                k--;
                hitsWithLaser++;
            }
            if (y5 < h) {
                h = y5 - h;
                h = (h + y2 - 1) / h;
            }
            hitsWithLaser = hitsWithLaser + h;


            if (hitsWithGun > hitsWithLaser) {
                System.out.println(hitsWithLaser);
            } else {
                System.out.println(hitsWithGun);
            }

        }
    }

}
