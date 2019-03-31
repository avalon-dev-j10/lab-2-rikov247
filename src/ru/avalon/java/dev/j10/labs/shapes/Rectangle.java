package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы прямые (равны 90
 * градусам).
 *
 * @see
 * <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Point, Polygon, Shape {

    private float x; // координата x
    private float y; // координата y
    private float a; // одна сторона прямоугольника
    private float b; // вторая сторона прямоугольника
    private int angle; // угол поворота в градусах

    public Rectangle(float x, float y, float a, float b, int angle) { // инициализация прямоугольника
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
        this.angle = angle;
    }

    public Rectangle(float x, float y, float a, float b) {
        /**
         * инициализация прямоугольника если не задается угол поворота
         */
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
    }

    public Rectangle(float a, float b) {
        /**
         * инициализация треугольника если не задается угол поворота и не
         * задаются координаты центра x и y
         */
        this.a = a;
        this.b = b;
    }

    public float getArea() { // расчёт площади прямоугольника
        float temp = a * b;
        return temp;
    }

    public float getPerimeter() { // расчёт периметра треугольника 
        float temp = 2 * a + 2 * b;
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
