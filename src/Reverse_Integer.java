public class Reverse_Integer {

        public static void main(String[] args){
            System.out.println(

                    reverse(964632435));
        }

        public static int reverse(int x) {
long res = 0;
                if (x >= 0) {
                    String number = Long.toString(x);
                    String reversed = new StringBuilder(number).reverse().toString();
                 res = Long.parseLong(reversed);


                } else {
                    String number = Integer.toString(x).substring(1);
                    String reversed = new StringBuilder(number).reverse().toString();
                    res =  Long.parseLong(reversed) * -1;
                }


            if(res < Math.pow(-2,31) || res > (Math.pow(2,31) -1))
            {
                return 0;
            }
else {
    return (int)res;
            }

        }

    }



