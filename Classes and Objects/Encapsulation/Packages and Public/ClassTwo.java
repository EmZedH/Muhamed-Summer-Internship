package com.pack2.two;

public class ClassTwo {
    public static void main(String[] args) {
        com.pack1.one.classOne obj = new com.pack1.one.classOne();
        System.out.println("Value of y in classOne = "+obj.y);
        System.out.println("Value of z in classOne = "+obj.z);
        obj.function();

    }
}
