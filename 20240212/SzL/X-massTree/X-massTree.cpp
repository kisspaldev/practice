// X-massTree.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <string>
#include <stdexcept>





void nTree(int size)
{
    
    bool construcitonComplete = false;
    bool characterIt = false;
    bool print = false;
    bool SpaceIt = false;
    bool branchComplete = false;
    bool logic = true;
    // isHeightIt decides if this iteration is to add to the height of the tree or to work on branches
    int currheight = 0;
    int spacesToPrint = 1;
    int charsToPrint = 1;
    int trunkHeight = 0;
    int trunkThickness = (size *2)/7;
    int trunkCC = trunkThickness;

    std::string line;
    while (!construcitonComplete)
    {
        //dealing with the branhes and leaves
        if(!branchComplete)
        {
     
            if (logic)
            {

                    //how many spaces to offset the treeleaves with
                 spacesToPrint = size- currheight;
             
                //cleanup
                 logic = false;
                 SpaceIt = true;
                 characterIt = false;
                 print = false;
            }

            //queuing spaces to print
            if (SpaceIt)
            {
            
                if (spacesToPrint == 0)
                {
                    characterIt = true;
                }
                else
                {
                    line += " ";
                    spacesToPrint--;
                }
            }
            //calculating and queueing the leaves to print
            if (characterIt)
            {
                line += "X";
                charsToPrint--;


                if (charsToPrint == 0)
                {
                    print = true;
                    characterIt = false;
                }
            }
            //actually printing
            if (print)
            {
                std::cout << line << std::endl;
                currheight++;
                line = "";
                print = false;
                logic = true;
                charsToPrint = currheight*2+1;
            }//checking if we're done
            if (currheight == size)
            {
                branchComplete = true;
                construcitonComplete = false;
                characterIt = false;
                print = false;
                SpaceIt = false;
                logic = true;
            }
        }
        else
        {
            //dealing with the trunk
            if (logic)
            {
                spacesToPrint = size - trunkThickness / 2;
                SpaceIt = true;
                logic = false;
                
            }
            //queueing the spaces to pring
            if (SpaceIt)
            {
                line += " ";
                spacesToPrint--;
                if (spacesToPrint == 0)
                {
                    characterIt = true;
                    SpaceIt = false;
                }
            }
            //queueing the trunk to print
            if (characterIt)
            {
                line += "X";
                --trunkCC;
                
                if (trunkCC == 0)
                {
                    //actually printing
                    std::cout << line << std::endl;
                    line = "";
                    trunkCC = trunkThickness;
                    logic = true;
                    characterIt = false;
                    trunkHeight++;
                    if (trunkHeight == 2)
                    {
                        construcitonComplete = true;
                    }
                }
            }

        }

    }
 
}

bool tryParse(std::string& input, int& output) {
    try {
        output = std::stoi(input);
    }
    catch (std::invalid_argument) {
        return false;
    }
    return true;
}

int main()
{
    std::cout << "give a numberfor the the hegiht of the x-mass tree (minium 3) ";
    std::string input;
    int height;

    getline(std::cin, input);

    while (!tryParse(input, height))
    {
        std::cout << "Bad entry. Enter an INTEGER: ";
        getline(std::cin, input);
    }
   

    nTree(height);

    return 0;
}

