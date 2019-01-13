package com.practice.test.D.P.adaptive.interf;

public class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw");
    }

    @Override
    public void resize() {
        System.out.println("possible");
    }

    @Override
    public void description() {
        System.out.println("not possible");
    }

}
