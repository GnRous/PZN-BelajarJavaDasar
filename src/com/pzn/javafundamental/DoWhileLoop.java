package com.pzn.javafundamental;

public class DoWhileLoop {
  public static void main(String[] args) {

    var counter = 1;

    do {
      System.out.println("Perulangan do-while ke-" + counter);
      counter++;
    } while (counter >= 10);
  }
}
