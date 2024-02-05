#include <algorithm>
#include <array>
#include <functional>
#include <vector>
#include <limits.h>
#include <iostream>

int second_basic(std::vector<int> arr)
{
    
    if(arr.size() == 0)
        return INT_MIN;
    
    if(arr.size() == 1)
        return arr[0];
    
    std::sort(arr.begin(), arr.end());
    
    return arr[arr.size()-2];
}

int second_differnetly(std::vector<int> arr)
{
    if(arr.size() == 0)
        return INT_MIN;
    
    if(arr.size() == 1)
        return arr[0];
    
    int max=INT_MIN, max2=INT_MIN;
    for(auto it : arr)
    {
        if(it > max )
        {
            max2=max;
            max=it;
        }
        
        if(it > max2 && it < max)
        {
            max2=it;
        }
    }
    
    return max2;
}

int main()
{
 
    //std::vector<int> vec = {3,2,1,4,5,6,9,8,11};
    std::vector<int> vec = {0,-1,-2};
    
    int a = second_basic(vec);
