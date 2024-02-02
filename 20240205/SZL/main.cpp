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
    
}

int main()
{
 
    std::vector<int> vec = {3,2,1,4,5,6,9,8,11};
    int a = second_basic(vec);
    
    std::cout<<a<<std::endl;

    return 0;
}
