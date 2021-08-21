import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            BinOps bins = new BinOps();
            System.out.println("Введите первое число в двоичной системе счисления:");
            String value1 = scanner.nextLine();
            System.out.println("Введите второе число в двоичной системе счисления:");
            String value2 = scanner.nextLine();
            String sum = bins.sum(value1, value2);
            String mult = bins.mult(value1, value2);
            System.out.println("Сумма двух значений: " + sum
                    + "\nПроизведение двух значений: " + mult);
        } catch (Exception e) {
            System.out.println("Введены некорректные данные");
        }
    }
}
