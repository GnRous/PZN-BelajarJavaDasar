package com.pzn.javafundamental;

import java.util.Scanner;

public class PengumumanKelulusan {
  public static void main(String[] args) {
    System.out.println("Perhitungan Penentuan Kelulusan:");
    hasilUjian();
  }

  static void hasilUjian() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan nilai anda : ");
    int nilai = scan.nextInt();

    if (nilai <= 50) {
      System.out.println("Kamu Tidak Lulus");
    } else if (nilai > 50 && nilai <= 70 ) {
      System.out.println("Selamat Anda Lulus");
    } else if (nilai > 70 && nilai <= 100) {
      System.out.println("Wow, Anda Lulus dengan sempurna");
    }
  }
}
