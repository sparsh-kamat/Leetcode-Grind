class Solution {
    public int numIdenticalPairs(int[] nums) {
        int f=0;
        for(int i=0;i<nums.length;i++){
            for(int g=i+1; g<nums.length;g++){
                if (nums[i]==nums[g]){
                    f++;
                }
            }
        }
        return f;
        
    }
}