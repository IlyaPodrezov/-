import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = num.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = num.nextInt();
        int result;
        System.out.print("Веберите знак +, -, *, /: ");
        String znak = num.nextLine();
        znak = num.nextLine();
        switch (znak) {
            case "+":
                result = num1 + num2;
                System.out.print("Ваш результат: " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.print("Ваш результат: " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.print("Ваш результат: " + result);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.print("На 0 делить нельзя");
                }
                else {
                    result = num1 / num2;
                    System.out.print("Ваш результат: " + result);
                }
                break;
            default:
                System.out.print("ВЫ ввели что-то неправильно");
        }
    }
}