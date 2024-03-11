package com.pzn.javafundamental;

public class Break {
  public static void main(String[] args) {

    var counter = 1;

    while (true) {
      System.out.println("Perulangan w/ Break ke-" + counter);
      counter++;

      if (counter > 10) {
        break;
      }
    }

    System.out.println("Perulangan berhenti <di-break>)");
  }
}
