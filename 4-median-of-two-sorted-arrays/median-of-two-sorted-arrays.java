class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] result = new int[m+n];

        for(int i = 0; i< m; i++){
            result[i]  = nums1[i];
        }

        for(int i = 0; i< n; i++){
            result[m+i] = nums2[i];
        }

        Arrays.sort(result);

        double p = 0;
        if((m + n)%2 == 0) {
            p = (result[((m+n)/2)-1] + result[(m+n)/2])/2.0;
        }
        else {
            p = result[(m+n)/2];
        }

        return p;
    }
}