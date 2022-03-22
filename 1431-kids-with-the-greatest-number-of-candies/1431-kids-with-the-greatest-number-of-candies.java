class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for (int i = 0; i < candies.length; i++){
             if (candies[i] > max)
                 max = candies[i];
        }
        
        List<Boolean> lst= new ArrayList<Boolean>();
        
        for(int f=0; f< candies.length;f++){
             if(candies[f]+extraCandies>=max)
             {
                 lst.add(true);
             }
             else lst.add(false);       
        }
        return lst;
        
    }
}