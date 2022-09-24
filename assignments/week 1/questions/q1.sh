#!/bin/bash

echo Number Tree

echo "How many numbers would you like to utilize?";
read num
#creating accumulator var
acc="numbers:"
isVar=^[-+]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?$

if [[ $num =~ $isVar ]]
  then
  #For loop-- loop through starting at 0
  for((i=0; i<=$num; i++))
  do
    acc+=" $i";   # push to accumulator variable made above
    echo $acc;    # echo back every iteration
  done
else
  echo "$num is not a valid integer.";
fi
