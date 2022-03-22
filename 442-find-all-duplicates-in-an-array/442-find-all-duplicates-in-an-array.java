class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        //sort the array with cyclic sort method
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            }else i++;
        }

        List<Integer> duplicates = new ArrayList<>(1);
        for(int j=0 ; j< nums.length;j++){
            if (nums[j]!=j+1) duplicates.add(nums[j]);
        }
        return duplicates;
        
    }
    static void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}