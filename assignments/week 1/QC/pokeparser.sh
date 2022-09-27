#!/bin/bash

exec < $1
read header #read/skip first line of csv file.

while IFS="," read -r name gen type id user;
do
        echo "Pokemon Name: $name";
        echo "Generation: $gen";
        echo "Type: $type";
        echo "Storage ID: $id";
        echo "Submitted by: $user";
        echo "+---------------------------------------+";
done
