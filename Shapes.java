package com.shapes;

class rectangle{
    int w;
    int h;
    rectangle(int width, int height){
        this.w = width;
        this.h = height; 
    }
    void reactArea(){
        System.out.println("Area of Rectangle : "+(w*h));
    }
}

class square extends rectangle{
    square(int width, int height){
        super(w,h);
        this.w = width;
        this.h = height;
    }
    void squareArea(int w , int h){
        reactArea();
    }
}

public class Shapes{
    public static void main(String[] args){
        square sa =  new square();
        sa.square(10,10);
        // sa.rectangle(10,10);

    }
}