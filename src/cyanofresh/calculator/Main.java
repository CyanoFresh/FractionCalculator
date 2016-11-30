package cyanofresh.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Числитель первой дроби: ");
        int xNumerator = s.nextInt();
        System.out.println("Знаменатель первой дроби: ");
        int xDenominator = s.nextInt();

        System.out.println("Числитель второй дроби: ");
        int yNumerator = s.nextInt();
        System.out.println("Знаменатель второй дроби: ");
        int yDenominator = s.nextInt();

        Model m = new Model(xDenominator, xNumerator, yDenominator, yNumerator);

        View.displayFraction(m.xNumerator, m.xDenominator);
        System.out.println();
        View.displayFraction(m.yNumerator, m.yDenominator);

        System.out.println("Выберите действие (1 - сумма, 2 - умножение, 3 - деление, 4 - вычитание): ");
        int action = s.nextInt();

        int[] result;

        switch (action) {
            case 1:
                result = Controller.sum(m);
                break;
            case 2:
                result = Controller.multiply(m);
                break;
            case 3:
                result = Controller.divide(m);
                break;
            case 4:
                result = Controller.subtract(m);
                break;
            default:
                result = Controller.sum(m);
                break;
        }

        System.out.println("Результат:");
        View.displayFraction(result[0], result[1]);
    }
}
