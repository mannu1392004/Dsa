import java.util.*;

public class Find_the_Difference_of_Two_Arrays {
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4};
        int num1[] = {1, 2, 6, 7, 8};
        System.out.println(findDifference(num, num1));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            set1.add(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            if (!(set1.contains(nums1[i]))&&!(list1.contains(nums1[i]))) {
                list1.add(nums1[i]);
            }

        }
        list.add(list1);
        set1 = new HashSet<>();
        list1 = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (!(set1.contains(nums2[i]))&&!(list1.contains(nums2[i]))) {
                list1.add(nums2[i]);
            }
        }
        list.add(list1);


        return list;
    }
}
