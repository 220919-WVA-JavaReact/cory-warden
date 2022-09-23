#!/bin/bash:
#creating sign up prompt;



echo "Are you a new?";
read answer;
#takes response and then proceeds starting with yes
if [[ $answer = "Yes" ]] || [[ $answer = "Y" ]] || [[ $answer = "y" ]]
then
    read -p "First name: $fname";
      read -p "Last name: $lname";
      read -p "Email address: $email";
      read -p "Username: $uname";
     read -p "Password: $pw";
#takes response and proceeds with no to check if they exist
     else [[ $answer = "No" ]] || [[ $answer = "no" ]] || [[ $answer = "n" ]];
         read -p    "Enter your email:" xemail;

         if [[ $xemail =  ]]
          then
          echo "We found you!"
         else
          echo "You are not in our system."
        fi
fi