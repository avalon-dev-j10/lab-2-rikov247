package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.*;
import java.util.Random;

public class Main {

    public static Shape[] shapes = new Shape[10]; // массив под 10 фигур

    /**
     * TODO (Даниил Генадьевич): Поясните, пожалуйста, почему в данной ситуации приходится
     * инициализировать массив "shapes" внутри класса Main, а если его
     * инициализировать внутри метода main, то массив "shapes"
     * не виден в массиве getMaxArea()
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        for (int i = 0; i < shapes.length; i++) { // цикл с 0 до длины массива

            switch (new Random().nextInt(3)) {
                /**
                 * 3 - чтобы начались появляться все три варианта: 0, 1, 2. В
                 * скобках цикла switch, - условие для совпадения, которое
                 * рандомно изменяется каждый раз с изменением i. Параметры,
                 * инициализирующие фигуру гереируются рандомно
                 */

                case 0:
                    shapes[i] = new Circle(new Random().nextFloat());
                    break;

                case 1:
                    shapes[i] = new Triangle(
                            new Random().nextFloat(),
                            new Random().nextFloat(),
                            new Random().nextFloat()
                    );
                    break;

                case 2:
                    shapes[i] = new Rectangle(
                            new Random().nextFloat(),
                            new Random().nextFloat()
                    );
                    break;
            }

        }
        getMaxArea();
        /**
         * TODO (Даниил Генадьевич): Поясните, пожалуйста, почему нужно записывать getMaxArea()
         * в основном методе main, чтобы в отладчике (и видимо в памяти выделялось 
         * место) в переменных отображался вывод метода getMaxArea, то есть
         * отображалась переменная maxArea
         */
    }

    public static float getMaxArea() {

        float maxArea = 0;

        for (int i = 0; i < 10; i++) {
            if (maxArea < shapes[i].getArea()) {

                maxArea = shapes[i].getArea();

            }
        }
        return maxArea;
    }

}
