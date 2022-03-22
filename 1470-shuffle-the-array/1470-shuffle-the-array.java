class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffled= new int[2*n];
        for(int i=0 ; i<n ; i++){
            int j=n+i;
            shuffled[2*i]=nums[i];
            shuffled[2*i+1]=nums[j];
            
        }        
        return shuffled;
    }
}