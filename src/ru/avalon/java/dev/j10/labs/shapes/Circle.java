package ru.avalon.java.dev.j10.labs.shapes;

import java.lang.Math;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из всех точек на
 * плоскости, равноудалённых от заданной точки.
 *
 * @see
 * <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Ellipse, Shape, Polygon, Point {

   private float radius; // радиус круга
   private float x; // координата x
   private float y; // координата y
   
    public Circle(float x, float y, float radius) { // инициализация круга
        this.radius = radius;
        this.x = x;
        this.y = y;
    }
    
    public Circle(float radius) { // инициализация круга без координат его центра
        this.radius = radius;
    }

    public float getLength() { // расчёт длины круга = 2*pi*r
        float temp = 2 * ((float) Math.PI) * radius;
        return temp;
    }

    public float getArea() { // расчёт площади круга = pi*r^2
        float temp = ((float) Math.PI) * radius * radius;
        return temp;
    }
    
    public float getPerimeter() { // расчёт периметра круга = длины окружности
        float temp = ((float) Math.PI) * radius * radius;
        return temp;
    }
    
    public float getX() { // возвращение координаты х
        return x;
    }
    
    public float getY() {  // возвращение координаты y
        return y;
    }
}
