#!/bin/bash

echo "Positive or Negative?"
arr=()

echo "Please input ten numbers to check for positive or negative with only a space between"
echo "i.e. 5 4 123 -56 -7 4 2 67 -12"
read a b c d e f g h i j;

#concatting to array
arr+="$a $b $c $d $e $f $g $h $i $j"
#echo $arr;

for cur in ${arr[@]} # find current index val through each item of array
do
 if [[ $cur -gt 0 ]]
  then
  echo "$cur is positive" >> even.txt; #if positive, send note to even.txt
 elif [[ $cur -lt 0 ]]
  then
  echo "$cur is negative" >> odd.txt; #if neg, send note to odd.txt
 else
  echo "Your number is zero"
 fi
done
echo "+-------------------------------------------+" >> odd.txt; #add break line in each file once loop completed.
echo "+-------------------------------------------+" >> even.txt;
echo "Please check files even.txt and odd.txt for responses."    #Notify user which files to check.
