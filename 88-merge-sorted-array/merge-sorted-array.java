class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m+=n;
        int k=((nums1.length-1)-n)+1;
        for(int i=0;i<nums2.length;i++){
            nums1[k]=nums2[i];
            k++;
        }
        Arrays.sort(nums1);
    }
}