class Solution {
    public void sortColors(int[] nums) {
        int k=nums.length-1;
        for(int i=k;i>=0;i--){
            int count=0;
            for(int j=0;j<i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                    count++;
                }
                else continue;
            }
            if(count==0) break;
        }
    }
}