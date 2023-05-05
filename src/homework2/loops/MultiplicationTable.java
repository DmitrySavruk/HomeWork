package homework2.loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("\t"+"\t"+"Таблица умножения");
        printRow(2, 5);
        System.out.println();
        printRow(6, 9);
    }

    public static void printRow(int from, int to){
        for (int i = 1; i <= 10; i++) {
            for (int j = from; j <= to; j++) {
                System.out.print(j + "x" + i + "=" + (j*i) + "\t");
            }
            System.out.println();
        }
    }
}

