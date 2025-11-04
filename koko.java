class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int n : piles){
            max = Math.max(max,n);
        }
        int k = max;
        int lo = 1; 
        int hi = max;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            int time = 0;
            for(int pile : piles){
                time += Math.ceil(((double)pile/mid));
            }

            if(time > h){
                lo = mid + 1;
            }
            else if(time <= h){
                hi = mid - 1;
                k = mid;
            }
        }
        return k;
    }
}