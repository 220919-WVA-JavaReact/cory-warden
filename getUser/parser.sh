#!/bin/bash

exec < $1
read header #read/skip first line of csv file.

while IFS="," read -r id fname lname email user pw
do
	echo "ID: $id";
	echo "First Name: $fname";
	echo "Last Name: $lname";
	echo "Email: $email";
	echo "Username: $user";
	echo "Password: $pw";
	echo "+---------------------------------------+";
done

