/* Leet code 27 Remove Element
    Vishal
    02/11/2019 */


class Solution {
    public int removeElement(int[] nums, int val) {
        int len=nums.length, count;
        for (int i=0;i<len;++i){
            if(nums[i]==val){
                count=0;
                for(int j=i+1;j<len;++j){
                    if(nums[j]==val){
                        count++;
                        continue;
                    }
                    nums[i++]=nums[j];
                }
                len=len-count-1;
            }
        }    
        return len;
    }
}

/*Take 2
public int removeElement(int[] nums, int val) {
    int len=nums.length;
    for (int i=0;i<len;++i){
        if(nums[i]==val)
            nums[i--]=nums[--len];
    }    
    return len;
}
*/