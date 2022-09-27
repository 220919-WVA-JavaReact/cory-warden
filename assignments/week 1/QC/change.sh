#!/bin/bash

echo "What pokemon entry would you like to change the name of?"
#intake two variables to change
read -p "What entry would you like to change?  " change1;
read -p "What would you want to change it to?  " change2;
#use sed s = substitute, next to are change from and change to, then g = global change
sed -i "s/$change1/$change2/g" pokemon.csv
echo "Returning you to the initial screen."
echo "+----------------------------------+"
#Return to home screen.
bash ./week1.sh
