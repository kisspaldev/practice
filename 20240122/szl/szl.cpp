// szl.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#pragma once
#include <iostream>
#include <string>
#include <unordered_map>






//the sane solution for ASCII characters (but not special characters
std::unordered_map<char, int> counter(const std::string &s)
{
   

    std::unordered_map<char, int> retval;

    if ( s.size() == NULL)
    {
        std::cout << "empty sting is illegal" << std::endl;
        return retval;
    }

 

    for (const auto &i : s)
    {
        retval[i] += 1;
    }

    for (auto const &i : retval)
    {
        std::cout << "the character: " <<  i.first << " have been found " << i.second << " times." << std::endl;
    }

    return retval;
}



int main()
{

    counter("aaaaabbbdd1sdasdasdasdasd");

   
}

