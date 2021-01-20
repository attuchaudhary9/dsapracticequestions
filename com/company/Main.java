package com.company;
class Cat{
    int legs,eyes;
}
public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.eyes = 2;
        cat1.legs = 4;
        System.out.println(cat1.legs + "  " + cat1.eyes);
        Cat cat2 = new Cat();
        cat2.eyes = 2;
        cat2.legs = 2;
        System.out.println(cat2.legs + "  " + cat2.eyes);
    }
}

