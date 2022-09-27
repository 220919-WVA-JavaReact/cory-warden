#!/bin/bash
#Generate random token number for id, hardcoded below.
id=$RANDOM
echo "Please fill in the following fields below:"
read -p "What is the pokemon name? " name;
read -p "What is the pokemon gen? "  gen;
read -p "What is the pokemon's main type?  " type;
echo "Storage number: $id"
read -p "Who was this submitted by?  " user;
#Shovel information into csv file to be parsed when called.
echo "$name,$gen,$type,$id,$user" >> pokemon.csv;
#Return to home screen.
echo "Restarting program for you to search this pokemon!";
bash ./week1.sh;
