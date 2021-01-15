package ru.stqa.sandbox;

public class MyFirstProgram {
public static void main(String[] args){
hello("world!");
Square s = new Square(10);


    System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s) );
Rectangle r = new Rectangle(5, 7);

    System.out.println("Площадь прямоугольника со сторонами " + r.a +" и " + r.b + " = " + area(r) );
}
public static void hello(String somebody){
       System.out.println("hello, " + somebody);
}
public static double area(Square s){
    return s.l * s.l;

}
public static double area(Rectangle r){
    return r.a * r.b;

}

}