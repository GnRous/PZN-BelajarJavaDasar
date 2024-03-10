package com.pzn.javafundamental;

public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "A";

        //Switch Biasa
        switch (nilai) {
            case "A":
                System.out.println("Wow, Anda lulus dengan Baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda cukup baik");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Mungkin Anda salah jurusan");
        }

        //Switch Lambda (Java version = 14 keatas)
        switch (nilai) {
            case "A" -> System.out.println("Wow, Anda lulus dengan Baik");
            case "B", "C" -> System.out.println("Nilai Anda Cukupo Baik");
            case "D" -> System.out.println("Anda tidak Lulus");
            default -> {
                System.out.println("Mungkin Anda Salah Jurusan");
            }
        }


        //Switch dengan Yield (Java version = 14 keatas)
        // memudahkan ketika memanfaatkan variabel tambahan, exmp: String ucapan
        String absen = "B";
        String ucapan;
        ucapan = switch (absen) {
            case "A":
                yield "Wow, Anda lulus dengan Baik";
            case "B", "C":
                yield "Nilai Anda cukup Baik";
            case "D":
                yield "Anda tidak Lulus";
            default:
                yield "Mungkin Anda salah Jurusan";
        };

        System.out.println(ucapan);
    }
}