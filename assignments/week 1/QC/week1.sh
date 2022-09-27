#!/bin/bash

echo "Welcome to the pokemon information center!";
echo "+----------------------------------------+";

echo "Would you like to acces the data information?";
read -p "(y/n):  " answer;

id=$RANDOM;
if [[ $answer == "y" ]];
  then
  echo "Would you like to make a new entry, search data, or logout?"
  read -p "(new/search/change/delete/logout):  " resp
  if [[ $resp == "new" ]];
    then
    bash ./newentry.sh;
  elif [[ $resp == "search" ]];
    then
    bash ./search.sh
  elif [[ $resp == "change" ]];
   then
   bash ./change.sh
  elif [[ $resp == "delete" ]];
    then
    echo "Would you like to delete a previous submission?"
    read -p "(y/n):  " submis
    if [[ $submis == "y" ]]
      then
      read -p "Please advise the Pokemon Name from the submission:  " pokemonname;
      sed "/$pokemonname$/d" pokemon.csv
    else
      echo "Returning you to the home screen."
      bash ./week1.sh
    fi
  else
    echo "would you like to log out?"
    read -p"(y/n):  " leave;
    if [[ $leave == "n" ]]
      then
      bash ./week1.sh;
    else
      echo "Thank you for visiting!";
      exit 0;
    fi
  fi
else
 echo "Thank you for visiting!";
fi
