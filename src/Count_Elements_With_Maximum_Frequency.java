import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Count_Elements_With_Maximum_Frequency {

    public static void main(String[] args){
        int arr[] ={1,2,2,4,1,5,6};
    maxFrequencyElements(arr);
    }
    public static int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();

for (int a :nums){
    if (map.containsKey(a)){
        int x = map.get(a);
        x++;
        map.put(a,x);
    }

    else {map.put(a,1); }
}
int arr[] = new int[map.size()];
int i = 0;
for (Map.Entry<Integer,Integer> e :map.entrySet()){
arr[i] = e.getValue();
i++;

}
int x1 = arr.length-1;
        Arrays.sort(arr);

int r =1;
    for (int j =0;j<=x1-2;j++){
        if (arr[j] ==arr[x1]){
            r++;

        }
    }
    int x = r*arr[x1];

        System.out.println(3%9);
    return x;
    }
    }

