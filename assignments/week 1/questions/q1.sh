#!/bin/bash

echo Number Tree

#Prompt for how many numbers to accumulate in tree
read -p "How many numbers would you like to utilize?" nums;

#creating accumulator var
acc="numbers:"

#For loop-- loop through starting at 0
for((i=0; i<=$nums; i++))
do
  acc+=" $i";   # push to accumulator variable made above
  echo $acc;    # echo back every iteration
done
