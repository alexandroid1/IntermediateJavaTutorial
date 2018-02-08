package com.globallogic.stringmethods;

public class SomeMoreStringMethods {

    public static void main(String[] args) {
        String s = "buckyrobertsbuckyroberts";
        System.out.println(s.indexOf("k")); // 3
        System.out.println(s.indexOf("k",5)); // 15
        System.out.println(s.indexOf("x")); // -1
        System.out.println(s.indexOf("rob")); // 5
        System.out.println(s.indexOf("rob",10)); // 17

        String a  = "Bacon ";
        String b  = "monster";
        System.out.println(a+b); // Bacon monster
        System.out.println(a.concat(b)); // Bacon monster

        System.out.println(a.replace('B','F')); // Facon
        System.out.println(b.toUpperCase()); // MONSTER
        System.out.println(b.trim()); // no spaces at all

    }
}
