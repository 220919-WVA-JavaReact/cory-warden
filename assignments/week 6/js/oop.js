window.onload = () => {
    console.log("Hello world!");
    console.log(objectLiteral.sayMyName());
    console.log(objectLiteral2.sayMyName());
    let cus1 = new Customer('Lesly', 'test');
    let cus2 = new Customer('Jonny', 'test');
    cus1.sayMyName();
    cus2.sayMyName();

    let emp1 = new Employee('Tyler', 'test', 'EMPLOYEE');
    let emp2 = new Employee('Cory', 'test', 'MANAGER');
    emp1.sayMyName();
    emp2.sayMyName();
    console.log('-----------------------');
    console.log(objectLiteral);
    console.log(cus1);
    console.log(emp1);
    console.log('-----------------------');
    console.log('default values');
    let emp3 = new Employee();
    console.log(emp3);
    let cus3 = new Customer();
    console.log(cus3);
    console.log('-----------------------');
    console.log(cus3.getType());
    console.log('-----------------------');
    // namedFunc();
    // someObject.someObject_namedFunction();
    // someObject.someObject_anonFunction();
    // someObject.someObject_arrowFunction();
    let map = new PoorMansMap();
    map.put('Kevin', 'password');
    map.put('Victoria', 'password');
    console.log(map.get('Kevin'));
    map.put('Kevin', 'pass');
    console.log(map.get('Kevin'));
    map.getKeyIfExists('Kevin');
}

let objectLiteral = {
    name: 'Cory',
    age: 27,
    sayHello: function() {
        return 'Hello';
    },
    sayMyName: function() {
        return `Hello, my name is ${this.name}`; //refers to current obj's name
    }
}

let objectLiteral2 = {
    name: 'Lukas',
    age: 30,
    sayHello: function() {
        return 'Hello';
    },
    sayMyName: function() {
        return `Hello, my name is ${this.name}`;
    }
}

//creating function that makes a constructor
function Customer(username = 'default username', password = 'default password') {
    this.username = username,
    this.password = password

    this.sayMyName = () => {
        console.log(`Hello, my name is ${this.username}`);
    }

    //Method overriding from Ln94
    this.getType = () => {
        return 'Overriden behaviour';
    }
}

//can also create as a class with es2015
class Employee {
    constructor(username, password, role) {
        this.username = username || 'username-missing';
        this.password = password || 'password-missing';
        this.role = role || 'role-missing';
    }

    sayMyName() {
        console.log(`Hello, my name is ${this.username}, I am a ${this.role}.`);
    }
}

/*
Abstraction in JS 
    no interfaces or abstract classes. 
    concept of having logic in functions to be reused
    focuses on I/O rather than implementation
    
Inheritance in JS
    prototype
Polymorphism
    Overriding - JS will find the method declared in the Customer prototype so it will not look any further.
*/

function User(type) {
    this.type = type;

    this.getType = () =>{
        return this.type;
    }
}

Customer.prototype = new User('Customer');

//Functions
function namedFunc() {
    console.log('named function is invoked');
}

let someObject = {
    someObject_namedFunction: function someFunc() {
        console.log('named function is invoked');
        console.log(this);
    },
    someObject_anonFunction: function() {
        console.log('anon function is invoked');
        console.log(this);
    },
    someObject_arrowFunction: () => {
        console.log('arrow function is invoked');
        console.log(this);
    }
}

/*
Create a custom Map
    Maps have Key/Value pairs
    put(k,v);
        if k/v exists already, override v.
    get(k,v);
        retrieve value associated with key
*/
function PoorMansMap() {
    let arr = [];

    function getKeyIfExists(key) {
        //check if key exists
        for (let i=0; i<arr.length; i+=2) {
            //checking if key is equal to value in array
            if (key === arr[i]) {
                //retrieve it
                return i;
            }
        }
        return -1; //says that key does not exist if no key found
    }

    function get(k) {
        let index = getKeyIfExists(k);
        //iterate through array by two at the key area
        if (index === -1) {
            return;
        } else {
            return arr[index + 1];
        }
    }

    function put(k,v) {
        let index = getKeyIfExists(k);
        //iterate through array by two at the key area
        if (index === -1) {
            arr.push(k);
            arr.push(v);
        } else {
            arr[index + 1] = v;
        }
    }

    //Encapsulation. Ablity to create a closure and access functions inside of a function on the global(window) level.
    return {
        get: get,
        put: put
    }
}



