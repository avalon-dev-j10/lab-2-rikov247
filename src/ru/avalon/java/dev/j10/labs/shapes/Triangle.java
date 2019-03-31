package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая фигура,
 * образованная тремя отрезками, которые соединяют три точки, не лежащие на
 * одной прямой. Указанные три точки называются вершинами треугольника, а
 * отрезки — сторонами треугольника. Часть плоскости, ограниченная сторонами,
 * называется внутренностью треугольника: нередко треугольник рассматривается
 * вместе со своей внутренностью (например, для определения понятия площади).
 *
 * @see
 * <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Point, Polygon, Shape {

    private float x; // координата x
    private float y; // координата y
    private float a; // одна сторона трегуольника
    private float b; // вторая сторона трегуольника
    private float c; // третья сторона трегуольника
    private int angle; // угол поворота в градусах

    public Triangle(float x, float y, float a, float b, float c, int angle) { // инициализация трегуольника
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
        this.c = c;
        this.angle = angle;
    }

    public Triangle(float x, float y, float a, float b, float c) {
        /**
         * инициализация треугольника если не задается угол поворота
         */
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(float a, float b, float c) {
        /**
         * инициализация треугольника если не задается угол поворота и не
         * задаются координаты центра x и y
         */
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getArea() { // расчёт площади треугольника по формуле Герона
        float semiPer = (a + b + c) / 2; // полупериметр
        float temp = semiPer * (semiPer - a) * (semiPer - b) * (semiPer - c); // расчет площади
        return temp;
    }

    public float getPerimeter() { // расчёт периметра треугольника 
        float temp = a + b + c;
        return temp;
    }

    public float getX() { // возвращение координаты х
        return x;
    }

    public float getY() {  // возвращение координаты y
        return y;
    }

    public int getRotation() { // возвращение угла поворота
        return angle;
        /* в данной задаче как то реализовывать метод getRoration не нужно, 
                                * так как не требуется позиционировать в координатной сетке каждый узел 
                                * фигуры, поэтому и изменение координат узлов фигуры не требуется */
    }
}
