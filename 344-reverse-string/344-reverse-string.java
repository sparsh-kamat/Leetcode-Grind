class Solution {
    public void reverseString(char[] s) {
        reverseStringg(s,0);
    }
    
    static void reverseStringg(char[] s,int i) {
        int n = s.length;
        if (i == n / 2)
            return;
        swap(s,i,n - i - 1);
        reverseStringg(s, i + 1);
    }
    
    static void swap(char []arr, int i, int j)
    {
        char temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}