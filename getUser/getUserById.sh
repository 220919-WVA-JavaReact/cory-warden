#!/bin/bash

echo "Please input your data file path: ";
read filepath;
# Take user input for ID
read -p "Please provide your ID number: " num;
	
# Ensure user is within boundaries of ID (currently hard coded top level)
if [ $num -gt 0 ] && [ $num -lt 500 ]
  then
  sh parser.sh $filepath | grep -A5 "ID: $num$";
else
  echo "Number is not between 0 and 500";
fi

# add file to userfile.txt if necessary, including underscore line from -A6
read -p "Would you like to append to userfile.txt? (y/n):" resp;
	
if [ $resp = "y" ]
  then
  sh parser.sh $filepath | grep -A6 "ID: $num$" >> userfile.txt;
else
  echo "Now exiting."
fi
