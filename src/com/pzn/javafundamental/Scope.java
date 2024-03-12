package com.pzn.javafundamental;

public class Scope {
  public static void main(String[] args) {
    sayHello("Dermawan");
    sayHello("");
  }

  static void sayHello(String name) {
    String hello = "hello " + name;

    if (!name.isBlank()) {
      String hi = "Hi " + name;
      System.out.println(hi);
    }

    System.out.println(hello);
    //System.out.println(hi); //ini error karena bukan scope nya
  }
}
