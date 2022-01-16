class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> hs =new HashMap<Integer,Integer>();
       for(int i=0;i<nums.length;i++)
       {
           int x=target-nums[i];
           if(hs.containsKey(x))
           {
               return new int [] {hs.get(x),i};
           }
           hs.put(nums[i],i);
       }
        throw new IllegalArgumentException("No two sum solution");
    }
}
