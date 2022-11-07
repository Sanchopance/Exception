import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер проверки:\n1 - деление на ноль\n2 - получение отрицательной разницы\n3 - null элемент в массиве");
        int res = scan.nextInt();

        switch (res) {
            case 1 ->

                    System.out.println(getDivide());
            case 2 ->

                    System.out.println(getPosDiff());
            case 3 -> {

                Integer[] result = {1, 2, null, 3};
                numberOneChange(result);
            }
            default -> System.out.println("Incorrect data");
        }

        scan.close();
    }

    private static int getDivide() {
        throw new RuntimeException("Divide by zero not permit");
    }

    private static int getPosDiff() {
        throw new RuntimeException("Difference not positive");
    }

    private static void numberOneChange(Integer[] array) {
        Random temp = new Random();
        Integer[] res = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                throw new RuntimeException("Null element was in array");
            }

            if (array[i] == 1) {
                array[i] = temp.nextInt(2, 10);
            }

            res[i] = array[i];
        }
        System.out.println(Arrays.toString(res));
    }
}