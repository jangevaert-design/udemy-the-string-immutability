package edu.cnm.deepdive;

public class TheStringImmutability {

  public static void main(String[] args) {

    String hello = "hello";
    String hi = hello + "world";
    hi = hello;

    System.out.println(hi + hello);//prints hellohello
    hello.toUpperCase();
    System.out.println(hello);//prints hello because Strings are immutable.
    //assign hello to the upperCase method and you will print it in upper case
    hello = hello.toUpperCase();
    System.out.println(hello);//prints HELLO

    //concat method
    String s1 = "1";
    String s2 = s1.concat("2");
    s2.concat("3");

    System.out.println("s1 = " + s1 + " and s2 = " + s2);//prints: s1 = 1 and s2 = 12

    //if we assign s2 to line 21:
    s2 = s2.concat("3");

    System.out.println("s1 = " + s1 + " and s2 = " + s2);//prints: s1 = 1 and s2 = 123

  }

}
