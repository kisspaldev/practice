// szl.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <iostream>


bool palidrome(std::string palidrome)
{

    int start = 0, end = palidrome.size() - 1;
    bool flag = false;
    while (start < end)
    {
        if (palidrome[start] != palidrome[end] && start != end)
        {
            return false;
        }
        start++; end--;
    }
    return true;

}

#define IS_TRUE(x) { if (!(x)) std::cout << __FUNCTION__ << " failed on line " << __LINE__ << std::endl; }

void test_palidrome()
{

    IS_TRUE(palidrome("aabbaa"));
    IS_TRUE(!palidrome("bbaacc"));
    IS_TRUE(palidrome("aba"));
}



int main()
{
    std::cout << "Type a word to check if it's a true palidrome (aka, spaces do count)" << std::endl;
   
 //   std::cout << palidrome("aabbaa") << std::endl;

    test_palidrome();

    return 0;
}

