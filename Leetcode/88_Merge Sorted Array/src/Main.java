// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] nums1 = {4,5,6,0,0,0};
        int[] nums2 = {1,2,3};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //solution1
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums2[j] < nums1[i]  ) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }


        //solution 1
//        int[] clone = nums1.clone();
//        int i = 0;
//        int j = 0;
//        while (j < m && i < n) {
//            if (nums2[i] < clone[j] ) {
//                nums1[i+j] = nums2[i];
//                i++;
//            } else if (nums2[i] >= clone[j] ){
//                nums1[i+j] = clone[j];
//                j++;
//            }
//        }
//        while (j < m) {
//            nums1[n+j] = clone[j];
//            j++;
//        }
//        while (i < n) {
//            nums1[m+i] = nums2[i];
//            i++;
//        }

    }
}