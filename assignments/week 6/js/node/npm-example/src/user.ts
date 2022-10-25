export class User {
    // fields or methods with no explicit access modifiers are auto public
    id: number; // public
    // private fields are only accessible from the class
    // convention for private is to prepend a _ to the name
    private _username: string;
    // protected fields are only accessible within the class scope and any child class
    protected password: string;
    
    //Constructor just like in JS
    constructor(id: number, username: string, password: string) {
        this.id = id;
        this._username = username;
        this.password = password;
    }

    public get username() {
        return this._username;
    }

    public set username(uname: string) {
        //not null or '' (empty string)
        if(uname) {
            this._username = uname;
        }
    }

}

