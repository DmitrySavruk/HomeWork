package homework2.loops;
import java.util.Scanner;
public class Task1_3 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Вводим число: ");
            String numberAsString = in.nextLine();
            double number = Double.parseDouble(numberAsString);
            System.out.print("Вводим степень: ");
            String degreeAsString = in.nextLine();

            if (degreeAsString.contains(".")) {
                System.out.print("Введено дробное число");
                return;
            }
            if (degreeAsString.contains("-")) {
                System.out.print("Введено отрицательное число");
                return;
            }
            int degree = Integer.parseInt(degreeAsString);
            double result = 1;
            while (degree != 0) {
                result =  (result * number);

                degree--;
            }
            System.out.println(result);
        }

}

