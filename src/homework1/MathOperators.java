package homework1;

public class MathOperators {
    public static void main(String[] args) {
        System.out.println(Math.sin(Math.toDegrees(30)));// перевод из градусов в радианы
        System.out.println(Math.cos(Math.toDegrees(30)));
        System.out.println(Math.pow(6, 4));// возведение числа в степень, а именно 6^4
        System.out.println(Math.sqrt(64));// извлечение корня
        System.out.println(Math.random());// вывод случайного числа
        System.out.println(Math.round(1.8));// округление в большую сторону
        System.out.println(Math.floor(1.9));// округлене в меньшую сторону
        System.out.println(Math.max(21, 11));// нахождение максимального числа
        System.out.println(Math.min(21, 11));// нахождение минимального числа
        System.out.println(Math.PI);// выведение числа ПИ
        System.out.println(Math.signum(-98));// показывает знак значения
        System.out.println(Math.hypot(12,9)); // вычисление квадрата из суммы квадратов
    }
}
