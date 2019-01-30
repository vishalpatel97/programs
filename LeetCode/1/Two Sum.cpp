// https://leetcode.com/problems/two-sum
// vishal
// 01/30/2019

#include<iostream>
#include<vector>
#include<unordered_map>
using namespace std;
vector<int> twoSum(vector<int>&nums, int target);

int main(){
    vector<int> v;
    int size,temp;
    cin>>size;
    for(int i=0;i<size;++i){
        cin>>temp;
        v.push_back(temp);
    }
    cin>>size;
    vector<int> result = twoSum(v,size);
    for(auto i=result.begin();i!=result.end();++i)
        cout<<*i<<" ";
    return 0;
}

vector<int> twoSum(vector<int>&nums, int target){
    unordered_map<int,int> hash;
    for(int i=0;i!=nums.size();++i){
        int complement = target - nums[i];
        auto pos=hash.find(complement);
        if(pos!=hash.end())
            return vector<int>{pos->second,i};
        hash[nums[i]]=i;
    }
}