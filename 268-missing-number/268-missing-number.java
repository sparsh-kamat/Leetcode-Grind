class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        while (i< nums.length){
            int correct= nums[i];
            if (correct<nums.length) {
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                }else i++;
            }else i++;
        }

        //parse through array for missing number
        for (int k=0;k<nums.length;k++){
            if (nums[k]!=k) return k;
        }
        return nums.length;
        
    }
    static void swap(int[] nums, int i, int j){
        int temp= nums[j];
        nums[j]=nums[i];
        nums[i]=temp;
    }
}