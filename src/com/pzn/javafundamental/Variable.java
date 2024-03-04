package com.pzn.javafundamental;

public class Variable {
    public static void main(String[] args) {
        String name;
        name = "Darmawan Setiawan";

        System.out.println(name);

        int age = 21;
        String address = "Indonesia";

        System.out.println(age);
        System.out.println(address);

        name = "Maulana Fakjrin";
        System.out.println(name);

        var firstName = "Darmawan";
        var lastName = "Setiawan";

        System.out.println(firstName + " " + lastName);

        final String application = "Belajar Java";

        //application = "Belajar PHP"; //Error
    }
}
