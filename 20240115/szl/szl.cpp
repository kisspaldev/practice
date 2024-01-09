// szl.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <iostream>

int main()
{
    std::cout << "Type a word to check if it's a true palidrome (aka, spaces do count)" << std::endl;
    std::string palidrome;
    std::cin >> palidrome;
    int start = 0, end = palidrome.size()-1;
    bool flag = false;
    while (start < end)
    {
        if (palidrome[start] != palidrome[end] && start != end )
        {
            std::cout << "not palidrome" << std::endl;
            flag = true;
            break;
        }
        start++; end--;
    }
   
    if(!flag)
        std::cout << "was a PALIdrome" << std::endl;
    


    return 0;
}

