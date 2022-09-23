#!/bin/bash

echo "Positive or Negative?"
arr=()

echo "Please input ten numbers to check for positive or negative with only a space between"
echo "i.e. 5 4 123 -56 -7 4 2 67 -12"
read a b c d e f g h i j;

arr+="$a $b $c $d $e $f $g $h $i $j"
echo $arr;

for cur in ${arr[@]}
do
 if [[ $cur -gt 0 ]]
  then
  echo "$cur is positive";
 elif [[ $cur -lt 0 ]]
  then
  echo "$cur is negative";
 else
  echo "Your number is zero"
 fi
done
