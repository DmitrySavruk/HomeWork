package homework1;

public class Operators {
    public static void main(String[]args){
        int a = 5;
        int b = 2;
        int c = 8;
        int example1 = a+b/c;// в первую очередь выполняется операция деления 2/8=0,затем 5+0=5
        int example2 = (a+b)/c;// в первую очередь выполняется то, что в () 5+2=7,затем деление 7/8=0
        int example3 = (a+b++)/c;/* операция b++ выполняется после всех операций,поэтому не имеет смысла
        *поэтому вычисления производятся по принципу 2-ого примера*/
        int example4 = (a+b++)/--c;/* операция --с выполняется сразу и получаем 8-1=7, затем выполняем ()
        *5+2=7,затем / 7/7=1,операция b++ аналогично предыдущему примеру*/
        b = 2;
        c = 8;
        int example5 = (a*b>>b++)/--c;/* операция --с выполняется сразу и получаем 8-1=7,затем выполняем ()
        *5*2=10,затем 10 переводится в двоичную систему и выполняется сдвиг вправо на 2 символа и получаем 2,далее
        * операция / 2/7=0 */
        b = 2;
        c = 8;
        int example6 = (a+7>20 ? 68 : 22 * 2 >>b++)/--c;/* выполняем все по порядку 5+7=12, дальше сравнение 12 с 20
        *12 не больше 20,поэтому условие не выполняется, значит 22*2=11, 11/7=1*/
        b = 2;
        c = 8;
        /*boolean example7 = (a+7>20 ? 68 >= 68:22 * 2 >>b++) /--c;/* операция невозможна
        java: bad operand types for binary operator '/'
        first type:  java.lang.Object&java.io.Serializable&java.lang.Comparable<? extends java.lang.Object&java.io.Serializable&java.lang.Comparable<?>>
        second type: int*/
        b = 2;
        c = 8;
        boolean example8 = 6-b>3 && 12*12<=119;/* 6-2=4,4>3-true, дальше выполняется 144<=119-false, т.к дальше идет
        логический оператор & итоговым результатом у нас будет false*/
        boolean example9 = true && false;// аналогично предыдущему
        System.out.println(example1);
        System.out.println(example2);
        System.out.println(example3);
        System.out.println(example4);
        System.out.println(example5);
        System.out.println(example6);
        System.out.println(example8);
        System.out.println(example9);




    }
}
