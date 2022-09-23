#!/bin/bash

echo "Find the max number"

arr=()
echo "Please put in three numbers below"

read -p "First number: " num1;

read -p "Second number: " num2;

read -p "Third number: " num3;

arr+="$num1 $num2 $num3";

echo $arr;
isVar=^[-+]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?$
maxNum=0

if [[ $num1 =~ $isVar ]] && [[ $num2 =~ $isVar ]] && [[ $num3 =~ $isVar ]]
 then
 for cur in ${arr[@]}
  do
  if (( $cur > $maxNum ))
  then
   maxNum=$cur
  fi
 done
 echo "Your max number is $maxNum."
else
 echo "Your entries were not valid numbers. Try again"
fi




# echo "Your numbers are: $num1, $num2, $num3";
# if [[ $num1 -gt $num2 ]] && [[ $num1 -gt $num3 ]];
#   then
#   echo "$num1 is the largest number";
# elif [[ $num2 -gt $num1 ]] && [[ $num2 -gt $num3 ]];
#   then
#   echo "$num2 is the largest number";
# elif [[ $num3 -gt $num1 ]] && [[ $num3 -gt $num2 ]];
#   then
#   echo "$num3 is the largest number";
# else
#   echo "Two numbers are tied for largest number.";
# fi
