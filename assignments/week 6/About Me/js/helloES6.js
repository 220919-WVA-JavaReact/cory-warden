//Scopes
//Anything out here is global scoped
let x = "I am global scoped";

//Anything inside a block of code is local scoped
let scopes = () => {
    let x2 = 'I am functional scoped';
    if (x2) {
        let x3 = 'I am block scoped';
    }

}
scopes();

hoistEx();

function hoistEx() { 
    console.log("I am hoisted");
}

//Since es6 we can create disembodied funcs with arrow notation
var simpleArrow = () => console.log('I am an arrow function');
simpleArrow();

let paramArrow = (num) => {
    console.log(`We were given the number ${num}`);
    console.log(`The square of ${num} is ${num * num}`);
}
paramArrow(3);