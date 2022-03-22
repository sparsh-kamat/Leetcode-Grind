class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if(start>destination){
            int temp=start;
            start=destination;
            destination=temp;
        }
        int distC=0; int total=0;
        for (int j : distance) {
            total += j;
        }
        for (int i=start;i<destination;i++){
            distC+=distance[i];
        }
        int distAC=total-distC;

        return Math.min(distAC, distC);
    }
}