package homework2.loops;

public class Task_1_1_1 {
        public static void main(String[] args) {
            if (args[0].contains("-")) {
                System.out.println("Введено отрицательное число!");
                return;
            }
            if (args[0].contains(".")) {
                System.out.println("Введено дробное число!");
                return;
            }
            if (!args[0].chars().allMatch(Character::isDigit)) {
                System.out.println("Введено не число!");
                return;
            }
            long max = Long.parseLong(args[0]);
            if (max > 20 || max ==0) {
                System.out.println("Число не соответствует требованиям,введите число от 1 до 20!");
            } else {
                long min = 1;
                for (long i = 1; i <= max; i++) {
                    min = min * i;
                    if (i < max) {
                        long j = 1 * i;
                        System.out.print(j + "*");
                    } else if (i == max) {
                        System.out.println(max + "=" + min);
                    }
                }
            }
        }
}








