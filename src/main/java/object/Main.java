package object;

/**
 * Test class for educational purposes
 */
public class Main {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        System.out.println(someClass.getMyString());
        System.out.println(someClass.getMyFloat());
//        someClass.operatorsTest();
        SomeClass someClass1 = new SomeClass();
        System.out.println(someClass == someClass1);
        System.out.println(someClass.equals(someClass1));
        someClass1.setMyFloat(123);
        System.out.println(someClass.equals(someClass1));
        someClass.checkInt();
        someClass.checkString();
        Parent child = new Child();
    }
}
