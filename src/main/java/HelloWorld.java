public class HelloWorld {
    static int i = 9;

    public static void main(String[] args) {
        System.out.println("Hello world! ");
        Animal animal = new Dog();

        int i = 1;
        if( true){
            HelloWorld.i =3;
        }
    }
}

class Logger {
    Logger (String obj) {
        System.out.println("init " + obj);
    }
}

class Animal {
    static {
        System.out.println("static Animal");
    }

    static Logger staticName = new Logger("staticName");
    private Logger name = new Logger("privateName");


    {
        System.out.println("animal");
    }

    public Animal() {
        System.out.println("constructor animal");
    }
}

class Dog extends Animal {
    static Logger dogName = new Logger("dogName");
    Logger instanceName = new Logger("instanceName");

    static {
        System.out.println("static dog");
    }

    {
        System.out.println("dog");
    }

    public Dog() {
        this("name");
        System.out.println("dog constructor");
    }

    public Dog(String name) {

    }
}
