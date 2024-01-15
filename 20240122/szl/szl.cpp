// szl.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#pragma once
#include <iostream>
#include <string>
#include <unordered_map>
#include <map>



std::map<char, int> counter(std::string s)
{

    std::map<char, int> retval;

    if ( s.size() == NULL)
    {
        std::cout << "empty sting is illegal" << std::endl;
        return retval;
    }

 

    for (auto &i : s)
    {
        retval[i] += 1;
    }

    for (auto i : retval)
    {
       // std::cout << i.second << " _" << i.first << std::endl;
        std::cout << "the character: " <<  i.first << " have been found " << i.second << " times." << std::endl;
    }

    return retval;
}



int main()
{

    counter("aaaaabbbdd1");

    
}

