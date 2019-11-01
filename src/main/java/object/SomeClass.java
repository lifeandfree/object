package object;

import java.util.Objects;

public class SomeClass {

    private boolean myBoolean;
    private float myFloat = 10;

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    public boolean isMyBoolean() {
        return myBoolean;
    }

    public void setMyBoolean(boolean myBoolean) {
        this.myBoolean = myBoolean;
    }

    public float getMyFloat() {
        return myFloat;
    }

    public void setMyFloat(float myFloat) {
        this.myFloat = myFloat;
    }

    private String myString = "My string value";
    public void checkString() {
        String myString2 = myString;
        System.out.println(myString == myString2);

        myString = "new value";
        System.out.println(myString == myString2);

//        myString = new String("My string value");
        myString = "My string value";
        System.out.println(myString == myString2);
    }

    public void checkInt() {
        Integer i1 = 128;
        Integer i2 = 128;
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
    }

    public void operatorsTest() {
        System.out.println(myString instanceof String);
        long myLong = 12;
        int myInt = (int) myLong;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SomeClass someClass = (SomeClass) o;
        return myBoolean == someClass.myBoolean &&
                Float.compare(someClass.myFloat, myFloat) == 0 &&
                Objects.equals(myString, someClass.myString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(myString, myBoolean, myFloat);
    }
}
