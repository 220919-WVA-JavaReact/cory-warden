#!/bin/bash

echo "Please type the first name of the user:"
read a

sh parser.sh ${1} | grep -B1 -A4 "First Name: $a";
