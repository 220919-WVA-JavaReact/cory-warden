import { User } from "./user";

export interface Point_2D {
    x: number,
    y: number,
    z: number
}

function drawPoint_1(point: Point_2D) {
    //implementation
}

function drawPoint_2(point: Point_2D) {
    //implementation
}

function drawPoint_3(point: Point_2D) {
    //implementation
}

let point: Point_2D = {
x: 1, y: 2, z: 3
}

drawPoint_2(point);

type CreateUserRequest = {
    user: User,
    createionTime: Date
}

//more often tyes are used to define shape of some function
type SendUserRequest = (user: User) => void;

export interface sendSomethingRequest {
    sendSomething: (user: User) => void;
}

let me = new User(1, 'cory', 'pass');

function testInterfaces(req: sendSomethingRequest) {
    req.sendSomething(me);
}

function testType(req: SendUserRequest) {
    req(me);
}

export default {
    testInterfaces,
    testType
}