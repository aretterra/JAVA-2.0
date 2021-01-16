package ru.stqa.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTest {

@Test
    public void testArea(){
        Square s = new Square(6);
       Assert.assertEquals( s.area(),36.0);
    }
}
