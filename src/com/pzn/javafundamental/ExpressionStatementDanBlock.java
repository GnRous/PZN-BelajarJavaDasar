package com.pzn.javafundamental;

import javax.xml.crypto.Data;
import java.util.Date;

public class ExpressionStatementDanBlock {
    public static void main(String[] args) {
        //A.Expression
        // 1 single value
        int value; //ini ekspresi
        value = 10; //ini juga ekspresi

        //B.Statement
        //kumpulan beberapa expresi
        System.out.println(value = 100); //ini statement. kalau ini -> (value = 100) adal expresi

        //Jenis-jenis Statement
        //1. assignment statement
        double aValue = 8933.234;
        //2. increment statement
        aValue++;
        //3. method invocation statement
        System.out.println("Hello World Derm!!");
        //4. object creation statement
        Date date = new Date();

        //C.Block
        //kumpulan statement dari 0 atau kebih statement dan ada di dalam kurung kurawal {..}
        /*public static String void main(String[] args) {
            System.out.println("Hello World");
        };*/
    }
}
