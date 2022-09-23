#!/bin/bash

echo "Even or Odd?"

echo "Please input your number: "
read num

isVar=^[-+]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?$

if [[ $num =~ $isVar ]]
then
  if [[ `expr $((num % 2))` == 0 ]]
    then
      echo "$num is even.";
    else
      echo "$num is odd.";
    fi
else
  echo "This is not a valid number."
fi
