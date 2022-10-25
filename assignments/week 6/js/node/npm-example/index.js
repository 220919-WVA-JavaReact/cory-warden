"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var user_1 = require("./src/user");
function saySomething(something) {
    console.log(something);
}
saySomething("Hello world");
saySomething(55);
// saySomething(true); -- function is expecting either string or a number. Cannot compile as this type is boolean.
function createAndPrintUser() {
    var me = new user_1.User(1, 'cory', 'pass');
    console.log(me);
    me.username = 'Cory';
    console.log(me.username);
}
createAndPrintUser();
