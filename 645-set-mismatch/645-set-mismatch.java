class Solution {
    public int[] findErrorNums(int[] nums) {
        //sort the array with cyclic sort method
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            }else i++;
        }

        int[] ans= new int[2];
        for (int k=0; k< nums.length;k++){
            if (nums[k]!=k+1){
                ans[0]= nums[k];
                ans[1]=k+1;
                return ans;
            }
        }
        return ans;
    }
    static void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}