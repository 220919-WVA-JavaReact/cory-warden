#!/bin/bash

echo "What is your curl website?";
read website;

read -p "What is your name?" name;
read -p "What would you like to say?" message;

curl -H "Content-Type: plain/text/" -H "sender: $name" 
-d "$message" -X POST $website


# http://messageservice-env.eba-ismembei.us-east-1.elasticbeanstalk.com/messages
