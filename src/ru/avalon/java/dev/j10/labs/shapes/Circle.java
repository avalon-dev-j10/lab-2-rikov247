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
public class Circle implements Ellipse, Shape {

    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    private float radius; // переменная радиуса круга

    public Circle(float radius) { // метод описывающий, как ининциализируется круг 
        this.radius = radius;
    }

    public float getLength() { // метод описывающий, как рассчитывается длина круга = 2*pi*r
        float temp = 2 * ((float) Math.PI) * radius;
        return temp;
    }

    public float getArea() {
        float temp = ((float) Math.PI) * radius * radius;
        return temp;
    }
}
