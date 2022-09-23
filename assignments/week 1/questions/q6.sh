#!/bin/bash
echo "Prime or Composite?"

echo "Input a number to see if it is prime or composite: "
read num

#check if it's a true integer
isVar=^[-+]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?$
if [[ $num =~ $isVar ]] && [[ $num -gt 1 ]]
then
  for ((i=2;i<=$num/2; i++))                 #loop to check through all possible numbers for a r0 outcome.
  do
    resp=$((num%i))
    if [[ $resp -eq 0 ]]                     #if outcome of r0 then echo below statement that numb is composite.
    then
      echo "$num is a composite number.";
      exit 0;                                #break the remainder of code
    fi
  done
  echo "$num is a prime number.";            # if not equal to 0, then advise number is prime.
else
  echo "Error: This is not a number over 1."        # if init entry was not a number greater than 1, send error.
fi

