#!/bin/bash
echo Fib Series
#Prompt for how many fib numbers you'd like to see
read -p "How many numbers would you like in the Fibonacci series? " num;

#first and second variable to connect fib sequence
a=0
b=1

isVar=^[-+]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?$

if [[ $num =~ $isVar ]]
  then
  for ((i=0; i<$num; i++))
  do
    echo "$a "     #Show last cycle of fib series
    acc=$((a+b))   #Accum current iteration with prior iteration
    a=$b           #Retains prior iteration output value
    b=$acc         #Updates current acc value to add with prior iteration.
  done
else
echo "$num is not a valid number.";
fi

