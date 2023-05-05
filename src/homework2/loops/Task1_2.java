package homework2.loops;

public class Task1_2 {
    public static void main(String[] args) {

            if (args[0].contains("-")) {
                System.out.println("Введено отрицательное число!");
                return;
            }
            if (args[0].contains(".")) {
                System.out.println("Введено не целое число!");
                return;
        }
        String input = args[0];
        int result = 1;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!Character.isDigit(c)) {
                System.out.println("Введены некорректные данные!");
                return;
            }
            int digit = Character.getNumericValue(c);
            result *= digit;
            if (i == input.length() - 1) {
                System.out.print(digit + " = ");
            } else {
                System.out.print(digit + " * ");
            }
        }
        System.out.println(result);
    }
}