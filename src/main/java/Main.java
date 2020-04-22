/**
 * Main.
 *
 * @author lifeandfree
 */
public class Main {

    public static void main(String[] args) {

        String str1 = "My string value";
        String str2 = str1;
//        System.out.println(str1 == str2);

        String str3 = "new value";
//        System.out.println(str1 == str3);

        String str4 = new String("My string value");

//        System.out.println(str1 == str4);
//        System.out.println(str1.equals(str4));

        String str5 = "My string value";
//        System.out.println(str1 == str5);
//        System.out.println(str1.equals(str5));


        String str6 = "My string ";
        String str7 = "value";

        String str8 = str6 + str7;
//        System.out.println(str1 == str8);
//        System.out.println(str1.equals(str8));


        Integer i1 = 127;  // -128 127
        Integer i2 = 127;
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));

    }
}