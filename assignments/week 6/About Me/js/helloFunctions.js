console.log("Hello Functions");

if ('0' ? console.log('truthy') : console.log('falsy'));

//Look at variable comparison
let x = 5;
let y  = '5';

console.log(x == y);
console.log(x === y);

function simpleIf() {
    if (5>6 ? console.log('yay') : console.log('boo'));
}

simpleIf();

function testValue(num) {
    if (num < 0) {
        console.log('Num is negative.');
    } else if (num > 0) { 
        console.log('Num is positive.');
    } else {
        console.log('Num is zero');
    }
}
testValue(-2);

let arr = [1,2,3,4,5,6,7];
let arr2 = [1,2,3,4,5,6,8];
function arrSum(array) {
    let sum = 0
    for (let i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    return sum;
}

console.log(arrSum(arr));

//For of is used for arrays and array like objects
let n = 0;
for (n of arr) {
console.log(n*n);
}


//For in loop is used to access props of an obj
let prop = "";
let obj = {name: 'bob', age:32};
for (prop in obj) {
    console.log(prop + ': ' + obj[prop]);
}

let coolFunction = () => {
console.log('I am anonymous.');
}

coolFunction();

//Callback functions are used everywhere. Array methods like find(), map(), filter(), and reduce()
//Use callbacks to operate on data

//Array find returns first ele that satisfies the cb function.
let greaterThan = arr.find((n) => {return n > 2});
console.log(greaterThan);

//Array filter returns an array of all the values that pass.
let greaterThanFilter = arr.filter((n) => {return n > 3});
console.log(greaterThanFilter);

//Array map allows to apply a callback function to each value in arr and create a new array based off of it.
let squares = arr.map((n) => {return n*n});
console.log(squares);

//default params showns on b, will be 1 if you do not use a second param
let defaultParams = (a, b=1) => {
    return a * b;
}
console.log(defaultParams(3, 2));
console.log(defaultParams(5));

const Book = function(t, a) {
    let title = t; 
    let author = a; 
    
    return {
       summary : function() { 
         console.log(`${title} written by ${author}.`);
       } 
    }
 }
 const book1 = new Book('Hippie', 'Paulo Coelho');
 book1.summary(); // Returns Hippie written by Paulo Coelho.

 let animal = {
    eats: true,
  walk() {
    console.log("Animal walk");
    }
  };
  let rabbit = {
    jumps: true,
    __proto__: animal	// sets animal to be a prototype of rabbit.
  };
  
  // we can find both properties in rabbit now:
  console.log( rabbit.eats ); // true 
  console.log( rabbit.jumps ); // true
  // walk is taken from the prototype
  rabbit.walk(); // Animal walk