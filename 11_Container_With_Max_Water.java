class Solution {
    public int maxArea(int[] height) {
        int m=0,l=0,r=height.length-1;
        while(l<r){
            m=Math.max(m,Math.min(height[l],height[r])*(r-l));
            
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return m;
        
    }
}
