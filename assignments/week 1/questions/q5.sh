#!/bin/bash
again="y"
echo "Positive or Negative?"

echo "Input a number and see if they are positive or negative?"
read num
#echo "ex. 10 5 -5 3 -2 9 7 -7 9 10"
#read a b c d e f g h i j
#inputs=($a $b $c $d $e $f $g $h $i $j);
#echo $inputs;
#i=0
#while [[ $inputs[$i] -gt 0 ]]
#do
#  echo $inputs[$i]
#  $i++
#done

isVar=^[-+]?[0-9]?$
if [[ $num =~ $isVar ]]
then
  if [[ $num -gt 0 ]]
  then
    echo "The number is positive."
  elif [[ $num -lt 0 ]]
  then
    echo "The number is negative"
  else
    echo "The number is zero."
  fi
else
  echo "This is not a number."
fi

read -p "Would you like to go again? (y/n): " again;
if [[ $again = "y" ]]
then
 bash ./q5.sh;
else
 echo "Closing app."
fi
