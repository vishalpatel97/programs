/*  two sum
    Given an array of integers, return indices of the two numbers such that they add up to a specific target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    1/6/2019 */

/*  1) Brute force approach: Loop through each element and find if theres other element that is target - x
        Time Complexity: O(n^2)
        Space Complexity: O(1)

    2) 2-Pass Hash table:
    Store each element as in a hash table. Loop through each element and find using the hash table if its complement exists
        Time Complexity: O(n)
        Space Complexity: O(n)
    
    3) 1-Pass Hash table:
       While storing the elements we check in the hash table if its complement already exists
       Time Complexity: O(n)
       Space Complexity: O(n) */

//approach 3

#include<iostream>
#include<unordered_map>
#include<vector>
using namespace std;

vector<int> twoSum(vector<int>& nums, int target){
    unordered_map<int,int> hash;
    for(int i=0;i<nums.size();++i){
        int complement = target-nums[i];
        auto pos = hash.find(complement);
        if(pos!=hash.end())
            return vector<int>{pos->second,i};
        hash[nums[i]]=i;
    }
}

int main(){
    vector<int> elements;    
    int size,target,temp;
    cout<<"Enter no of elements ";
    cin>>size;
    for(int i=0;i<size;++i){
        cin>>temp;
        elements.push_back(temp);
    }
    cout<<"Enter target sum ";
    cin>>target;
    vector<int> answer;
    answer=twoSum(elements,target);
    vector<int>::iterator i=answer.begin();
    while(i!=answer.end()){
        cout<<*i<<" ";
        i++;
    }
    return 0;
}