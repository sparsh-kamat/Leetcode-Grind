class Solution {
    public int fib(int i) {
        if(i<2){return i;}
        return fib(i-1)+ fib(i-2);
    }
}