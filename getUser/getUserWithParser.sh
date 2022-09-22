#!/bin/bash

#get user with parsed info

echo "Choose your id:"
read a
echo "How many lines would you like to show below the ID?:"
read b

sh parser.sh ${1} | grep -A"$b" "ID: $a$"
