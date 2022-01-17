class Solution {
    public int[] plusOne(int[] digits) {
        
        int len =digits.length;
        for(int i=len-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]++;
                break;
            }
            else{
                digits[i]=0;
            }
            
        }
        if(digits[0]==0){
            int a[]=new int[len+1];
            a[0]=1;
            return a;
        }
        return digits;
    }
}
