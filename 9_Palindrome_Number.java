class Solution {
    public boolean isPalindrome(int x) {
        if(x>=0)
        {
        int sum=0;
        int temp=x;
        while(x!=0)
        {
            sum=sum*10+x%10;
            x/=10;
        }
        if(sum==temp )
            return true;
        else 
            return false;
        }
        return false;
       
        
        
    }
}
