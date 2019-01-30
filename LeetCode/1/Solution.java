// https://leetcode.com/problems/two-sum
// vishal
// 01/30/2019

import java.util.*;

class Solution{
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i=0;i<nums.length;++i){
            int complement = target - nums[i];
            if(hmap.containsKey(complement))
                return new int[]{hmap.get(complement),i};
            hmap.put(nums[i], i);
        }        
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] v = new int[size];
        for(int i=0;i<size;++i){
            
            v[i]=sc.nextInt();
        }
        int sum=sc.nextInt();
        int []result=twoSum(v,sum);
        for(int i:result)
            System.out.print(i+" ");
    }
}