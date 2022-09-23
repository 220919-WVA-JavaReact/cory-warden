#!/bin/bash

echo "Palindrome Test"

#get user input for palindrome
echo "Please enter a word: "
read str

#reversed string to check against 
reversedstr=""

#grab length of input string
length=${#str}
#echo $length

# index is str length - 1 (to acct for index0), greater than 0, move down one index at a time.
for (( i=$length-1; i>=0; i-- ))
do
  reversedstr="$reversedstr${str:$i:1}"; #extract each character from the string in reverse
# echo "$reversedstr";
done
if [[ $str = $reversedstr ]]             #check if original str is equal to extracted reverse
then
  echo "$str is a palindrome."
else
  echo "$str is not a palindrome."
fi

