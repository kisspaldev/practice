// Online C++ compiler to run C++ program online
#include <iostream>
#include <algorithm>
#include <array>
#include <functional>
#include <vector>


int second_basic(std::vector<int> arr)
{
    std::sort(arr.begin(), arr.end());
    
    return arr[arr.size()-2];
}

int second_differnetly(std::vector<int> arr)
{
    int max=0, max2=0;
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
 
    std::vector<int> vec = {3,2,1,4,5,6,9,8,11};
    int a = second_basic(vec);
    
    int b = second_differnetly(vec);
    
    std::cout<<a<<std::endl;
    std::cout<<b<<std::endl;
    
    

    return 0;
}
