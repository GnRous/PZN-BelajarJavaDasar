package com.pzn.javafundamental;

public class Array {
    public static void main(String[] args) {
        //penulisan Array ke-1

        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Dermawan";
        stringArray[1] = "Setiawan";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);

        stringArray[0] = "Maulana";

        String[] stringArray2 = new String[2];


        //penulisan Array ke-2
        String[] namaNama = {
                "Darmawan", "Setiawan"
        };

        int[] arrayInt = new int[] {
                1,2,3,4,5,6,7,8,9,10
        };

        long[] arrayLong = {
                10L,20L, 30L
        };

        //mengosongkan indeks array tertentu
        arrayLong[0] = 0;

        System.out.println(arrayLong.length);

        //Array didalam Array
        String[][] members = {
                {"eko", "Kurniawan"},
                {"Budi", "Nugraha"},
                {"Joko"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
    }
}
