import testFunctions, { sendSomethingRequest } from './src/interface-example';
import { User } from './src/user';

function saySomething(something: string | number) {
    console.log(something);
}

saySomething("Hello world");
saySomething(55);
// saySomething(true); -- function is expecting either string or a number. Cannot compile as this type is boolean.

function createAndPrintUser(){
let me = new User(1, 'cory', 'pass');
console.log(me)

me.username = 'Cory';
console.log(me.username);
}
createAndPrintUser();

// testFunctions.testInterfaces((someUser: User) => {
//     console.log(sendSomethingRequest.sendSomething(someUser));
// })

testFunctions.testType((someUser: User) => {
    console.log(someUser);
});