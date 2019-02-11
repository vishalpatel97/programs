/* LeetCode 7. Reverse Integer
    Vishal
    02/07/2019 */

class Solution{
    public int reverse(int x){
        int rev=0;
        while(x!=0){
            int temp=x%10;
            x/=10;
            if(rev>Integer.MAX_VALUE || (rev==Integer.MAX_VALUE && pop>7)) return 0;
            if(rev<Integer.MIN_VALUE || (rev==Integer.MIN_VALUE && pop<-8)) return 0;
            rev=rev*10+pop;
        }
        return rev;
    }
}

