#!/bin/bash

restart="y"
echo "Simple Calculator";
# Provide both numbers for calculator
read -p "Please provide your first number:" num1;

read -p "Please provide your second number:" num2;
	
# break sys if number is not an integer
isVar=^[-+]?[0-9]+$
## isNegativeVar=^-[0-9]+$
if ! [[ $num1 =~ $isVar ]] || ! [[ $num2 =~ $isVar ]]
  then echo "sorry, one of these is not an integer";
exit 0;
fi
	
#Type of expression
echo "+) Addition: +";
echo "-) Subtract: -";
echo "x) Multiply: x";
echo "/) Divide: /";
echo "Please enter the number of your above choice:";
read choice
	
# Switch case for addition, subtraction, multiplication, division
case $choice in
	+)sol=`expr $num1 + $num2`
	;;
	-)sol=`expr $num1 - $num2`
	;;
	x)sol=`expr $num1 "*" $num2`
	;;
	/)sol=`expr $num1 / $num2` ; sol+=" r$((num1%num2))" ;
	;;
esac
	
# Result
echo "The answer is: " $sol;
	
# Potential option to try again using same values? If not, send exit response.
read -p "Go Again? (y/n): " restart;
if [ $restart = "y" ]
  then
  bash ./q7.sh;
else
  echo "Calculator has been closed."
fi

