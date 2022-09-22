#!/bin/bash

echo "What is your first number?";
read num1;

echo "What is your second number?";

read num2;

echo "Add: +, Subtract: -, Multiply: *, Divide : /"

echo "What is your operator?";

read operator;

case $operator in
    +)
    echo $(($num1 + $num2));;
    -)
    echo $(($num1 - $num2));;
    \*)
    echo $(($num1 * $num2));;
    /)
    echo $(($num1 / $num2));;
    \?)
    echo error
esac
