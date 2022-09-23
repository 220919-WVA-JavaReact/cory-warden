#!/bin/bash

echo "Test Scores"

read -p "Please enter your Math score: " math;
read -p "Please enter your Science score: " sci;
read -p "Please enter your English score: " eng;

isVar=^[-+]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?[0-9]?$

#Check if number is a valid integer
if [[ $math =~ $isVar ]] && [[ $sci =~ $isVar ]] && [[ $eng =~ $isVar ]]
then
total="$((math + sci + eng)) / 3"; #total inputs and divide by 3
avg=`expr $total`;                 #express division to get answer

#Check if average is between certain range and send grade back.
if [[ $avg -ge 90 ]] && [[ $avg -le 100 ]]
  then
  echo "$avg is an A."
  elif [[ $avg -ge 80 ]] && [[ $avg -lt 90 ]]
   then
   echo "$avg is a B."
  elif [[ $avg -ge 70 ]] && [[ $avg -lt 80 ]]
   then
   echo "$avg is a C."
  elif [[ $avg -ge 60 ]] && [[ $avg -lt 70 ]]
   then
   echo "$avg is a D."
  else
   echo "$avg is a F."
fi
else
 echo "One of your scores is not a number. Please try again."
fi
