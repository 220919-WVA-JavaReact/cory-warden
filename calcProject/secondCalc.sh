#!/bin/bash
restart="yes"
echo "Please enter the first number: " 
read num1

echo "Please choose an operator: ";
echo "1) add"
echo "2) subtraction"
echo "3) multiply"
echo "4) divide"
read opr

echo "Please enter a second number: "
read num2

if [ $opr = "1" ]
	then
	echo "Your answer is: " $((num1+num2));
elif [ $opr = "2" ]
	then
	echo "Your answer is: "  $((num1-num2));
elif [ $opr = "3" ]
	then
	echo "Your answer is: " $((num1*num2));
elif [ $opr = "4" ] 
	then
	echo "Your answer is: " $((num1/num2));
fi
read -p "Go Again? (yes/no): " restart;
if [ $restart == "yes" ]
  then
  exec ./${0};
fi
