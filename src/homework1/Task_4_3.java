package homework1;
import java.util.Scanner;
public class Task_4_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        double number1 = in.nextDouble();
        System.out.print("Input second number: ");
        double number2 = in.nextInt();

        double division = number1/number2;
        if ((division%1)==0){
            System.out.println(division);
        }
        else {

                System.out.println("Деление с целым значением невозможно");
            }
        }

    }
