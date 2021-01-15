package ru.stqa.sandbox;

public class MyFirstProgram {
public static void main(String[] args){
hello("world!");
Square s = new Square(6);


    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area() );
Rectangle r = new Rectangle(9, 2);

    System.out.println("Площадь прямоугольника со сторонами " + r.a +" и " + r.b + " = " + r.area() );
}
public static void hello(String somebody){
       System.out.println("hello, " + somebody);
}

}



