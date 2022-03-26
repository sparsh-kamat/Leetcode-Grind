import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0){
		return new ArrayList<String>();}
        else{
        return lettercomb("",digits);}
    }
    
    static List<String> lettercomb(String p,String up){            
        String[] words= new String[10];
        words = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"}; //assigning the letters to numbers
         
        ArrayList<String> ans = new ArrayList<>();
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        
        int digit=up.charAt(0)-'0'; //make the char into a number
        for(int y=0;y<words[digit].length();y++){
            char ch= words[digit].charAt(y); //taking the leftmost character
            ans.addAll(lettercomb(p+ch,up.substring(1)));   //recursion here
        }
        
        return ans;
    }
}