#!/bin/bash


again="y"
#all question titles
titles=("PushingNumbers" "FibonacciSeries" "FactorialNumber" "DirectoryInfo"
"Positve/Negative" "Prime/Composite" "Calculator" "Palindromes" "Even/Odd"
"MaxNumber" "GradeScores" "Even/OddStorage" "ChristmasTree" "PalindromeStorage")

echo "Choose which question you want to run? 1-14"
echo "----------"
read input
echo "----------"
echo -e " 
..
...
....
"


case $input in
1)bash ./q$input.sh;;
2)bash ./q$input.sh;;
3)bash ./q$input.sh;;
4)bash ./q$input.sh;;
5)bash ./q$input.sh;;
6)bash ./q$input.sh;;
7)bash ./q$input.sh;;
8)bash ./q$input.sh;;
9)bash ./q$input.sh;;
10)bash ./q$input.sh;;
11)bash ./q$input.sh;;
12)bash ./q$input.sh;;
13)bash ./q$input.sh;;
14)bash ./q$input.sh;;
esac

read -p "Do you want to try a different question? (y/n):  " again;
if [[ $again = "y" ]]
 then 
 bash ./allquestions.sh;
else
 echo "Thank you!"
 exit 0;
fi
