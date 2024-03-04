package com.pzn.javafundamental;

public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        Integer iniInteger = 100;
        long iniLong = 10000L;

        Byte iniByte = null;

        System.out.println(iniByte);

        iniByte = 100;
        System.out.println(iniByte);

        // primitif -> bukan primitif
        int iniInt = 100;
        Integer iniInteger2 = iniInt;
        System.out.println(iniInteger2);

        // bukan primitif -> primitif
        Integer iniObject = iniInt;
        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();

        Long amount = 1000000L;
    }
}
