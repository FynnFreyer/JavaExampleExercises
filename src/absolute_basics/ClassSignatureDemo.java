package absolute_basics;

public class ClassSignatureDemo {
    // now we declare the static attribute `amount` of type int
    // static means something is shared between all objects of the class
    static int amount;
    // the next line declares the attribute `something` of data type int
    int something;

    // signatures are always build up the same way
    // [access_modifier] [static] return_type methodName([type param][, type param]...)
    //
    // things in brackets `[]` are optional, and things followed by ... may be repeated
    //
    // public is an access modifier
    // static means it's shared among all members of the class
    // void means nothing is returned
    // sayHi is the name of this method
    // the parentheses `()` contain parameters (arguments) that are passed into the method
    // the parameters have a name and a type
    public static void sayHi(boolean newline) {
        System.out.print("Hi!");
        if (newline) {
            System.out.println();
        }
    }

    // TODO: what is the meaning of `static` here?
    static void sayAmount() {
        System.out.println(ClassSignatureDemo.amount);
    }

    // this has no access modifier, so it can only be accessed from within the same package
    // TODO: what is the meaning of the `int` before `getTheAnswer`?
    static int getTheAnswer() {
        return 42;
    }

    // the main method is the entry point for execution
    public static void main(String[] args) {
        ClassSignatureDemo demo1 = new ClassSignatureDemo(1);
        ClassSignatureDemo demo2 = new ClassSignatureDemo(2);
        ClassSignatureDemo demo3 = new ClassSignatureDemo(3);

        // we call non-static methods on the object
        demo1.saySomething();
        // we call static methods on the class or the object
        ClassSignatureDemo.sayHi(true);
        demo1.sayHi(true);  // this works, but gives a warning


    }

    // this signature has no static, so it refers to one specific object, which can be referenced as `this`
    // TODO: why can we not use static here?
    public void saySomething() {
        System.out.println(this.something);
    }

    // the `SignatureDemo` method is a constructor, it constructs an object of type SignatureDemo (the class)
    // constructors are named like the class itself and don't declare a return type, because it's always the same
    ClassSignatureDemo(int something) {
        // `this` refers to the object we're constructing
        this.something = something;
        // we can access statically shared data from an object context
        ClassSignatureDemo.amount += 1;  // this counts the number of times the constructor was called (the number of created objects)
    }
}
