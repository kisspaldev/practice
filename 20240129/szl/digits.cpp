#include <iostream>
#include <string> 

int add_digits(std::string str)
{
    
    int digit = 0;
    for(auto c : str)
    {
        digit += c - '0';
        //std::cout << digit << std::endl;
    }
    
    if(digit < 10)
    return digit;
    return add_digits( std::to_string(digit));
}

int main() {
    // Write C++ code here
    std::cout << add_digits("12345") << std::endl;

    return 0;
}
