#!/bin/bash
echo "Prime or Composite?"

echo "Input a number to see if it is prime or composite: "
read num

#check if it's a true integer
isVar=^[-+]?[0-9]?[0-9]?$
if [[ $num =~ $isVar ]] && [[ $num -gt 1 ]]
then
  for ((i=2;i<=$num/2; i++))
  do
    resp=$((num%i))
    if [[ $resp -eq 0 ]]
    then
      echo "$num is a composite number.";
      exit 0;
    fi
  done
  echo "$num is a prime number.";
else
  echo "This is not a number over 2."
fi

