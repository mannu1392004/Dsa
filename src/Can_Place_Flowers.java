public class Can_Place_Flowers {
    public static void main(String [] args){
        int arr[] = {0,0,1,0,1,0,0};
        int n = 2;
        System.out.println(canPlaceFlowers(arr,n));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int number = 0;

        if (flowerbed.length==2&&flowerbed[0]==0&&flowerbed[1]==0){
            number++;
            flowerbed[0]=1;
        }
        if (flowerbed.length==1&&flowerbed[0]==0){
          number++;
          flowerbed[0]=1;
      }

        if (flowerbed.length>2){
        if (flowerbed[0]==0&&flowerbed[1]==0){
            flowerbed[0]=1;
            number++;
        }
if (flowerbed[flowerbed.length-1]==0&&flowerbed[flowerbed.length-2]==0){
    flowerbed[flowerbed.length-1]=1;
    number++;
}}
        for(int i = 1;i<flowerbed.length-2;i++){

            if (flowerbed[i]==0 && flowerbed[i-1]==0&&flowerbed[i+1]==0){
            flowerbed[i] = 1;
            number++;
            }
        }
        if (number<n){
            return false;
        }



        return true;}
}
