public class Find_the_Highest_Altitude {

    public static void main(String args[]){

    }

    public static int largestAltitude(int[] gain) {
int max = 0;
int sum = 0;
for (int i =0;i<gain.length;i++){
    sum = sum + gain[i];
    if (sum>max){
        max = sum;
    }

}

        return  max;
    }

}
