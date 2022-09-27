#!/bin/bash

echo "Would you like to search by user or pokemon name?"
read -p "(user/pokemon)  " input;
if [[ $input == "user" ]]
  then
#Search by username using grep to pull the row from csv file.
  read -p "What is your name?  " uname;
  sh pokeparser.sh pokemon.csv | grep -B4 -A1 "^Submitted by: $uname$";
elif [[ $input == "pokemon" ]]
  then
#Search by pokemon name using grep to pull the row from csv file.
  read -p "What is the pokemon name?  " pokename;
  sh pokeparser.sh pokemon.csv | grep -A5 "^Pokemon Name: $pokename$";
else
#Catchall for invalid input to return to home screen.
  echo "Input invalid. Please start from the beginning"
  bash ./week1.sh;
fi
