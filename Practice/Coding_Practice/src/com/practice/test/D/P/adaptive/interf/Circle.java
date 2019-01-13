package com.practice.test.D.P.adaptive.interf;

public class Circle implements Shape {

    Circle(){
        super();
    }
    @Override
    public void draw() {
        System.out.println("drwa circle");
    }

    @Override
    public void resize() {
        System.out.println("posssible");
    }

    @Override
    public void description() {
        System.out.println("ntn");
    }
}
