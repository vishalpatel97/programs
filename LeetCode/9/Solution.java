/* LeetCode 9 Palindrome number
    vishal
    02/07/2019 */
class Solution{
    public boolean isPalindrome(int x){
        if((x%10==0 && x!=0) || x<0)    return false;
        int rev=0;
        while(x>rev){
            rev=rev*10+x%10;
            x/=10;
        }
        return x==rev || x==rev%10;
    }
}