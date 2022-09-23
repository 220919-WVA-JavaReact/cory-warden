#!/bin/bash

echo Factorials;
#Obtain how many iterations you want to cycle through, as well as factor number
read -p "What number would you like to see the factors of? " input;

#set base number for first input to not zero out
nums=1

#loop through while number is greater than 0
while [[ $input -gt 0 ]]
do
  echo "Step $input: $nums * $input";  #maintain ordered steps showing process
  nums=$((nums * input));              #multiply two numbers creating total to carry into next iter.
  input=$((input - 1));                #decrease input factor to eventually lead to final step @ 1
done

echo "The total is: $nums";            #print total of product
