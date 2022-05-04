package com.company;

public class Tapwyrma10 {
    public static void main(String[] args) {

        System.out.println(truFols(5,26,5,67,4,3));

    }
    static  boolean truFols(int a, int...varar){
        for (int i = 0; i < varar.length; i++) {
            if (a==varar[i]){
                return true;
            }
        }
        return false;
    }
}
