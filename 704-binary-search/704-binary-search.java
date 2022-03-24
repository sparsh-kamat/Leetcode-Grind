class Solution {
    public int search(int[] nums, int target) {
        int s=0; 
        int e= nums.length -1;
        return searcch(nums,target,s,e);
    }
    static int searcch(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e-s) / 2;
        if (arr[m] == target) {
            return m;
        }

        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return searcch(arr, target, s, m-1);
            } else {
                return searcch(arr, target, m+1, e);
            }
        }

        if (target >= arr[m] && target <= arr[e]) {
            return searcch(arr, target, m+1, e);
        }

        return searcch(arr, target, s, m-1);
    }
}