#!/bin/bash

echo "Membership Status? (existing/new)";
read status;
			
#if member is new, proceed to signup form.
if [[ $status = "new" ]]
  then
  echo "Welcome! Please answer a few questions below.";
  read -p "What is your first name?" fname;
  read -p "What is your last name?" lname;
  read -p "What is your email?" email;
  read -p "What is your username?" user;
  read -p "What is your password?" pw;
  echo "You have now signed up!";
  echo "$fname,$lname,$email,$user,$pw" >> mockdata.csv; #push saved variables into mockdata in csv format
  echo "Now try to login!";
  bash ./registerMember.sh;
fi
			
# if member is existing, show current information for member.
if [[ $status = "existing" ]]
  then
  read -p "What is your name? " name;
# parse information received and send back file report.
  sh parser.sh mockdata.csv | grep -A5 "First Name: $name$";
else
#if not member, return reason for no information. Potentially utilize wrap to beginning?
  read -p "you are not an existing member. Try again from the beginning? (y/n)" resp;
  if [[ $resp = "y" ]]
   then
   bash ./registerMember.sh
  else
   echo "Closing program."
  fi
fi

