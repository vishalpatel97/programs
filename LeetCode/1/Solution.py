### 
# https://leetcode.com/problems/two-sum
# vishal
# 01/30/2019
###

def twoSums(nums, target):
    hmap={}
    for i in range(len(nums)):
        complement = target - nums[i]
        try:
            if hmap[complement]>-1:
                return [hmap[complement],i]
        except:
            hmap[nums[i]]=i


if __name__=="__main__":
    size=int(input())
    l = list(map(int, input().split(' ',size)))
    sum = int(input())
    result = twoSums(l,sum)
    print(result)