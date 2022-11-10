import java.util.Locale;
import java.util.Scanner;

public class Task1 {

    float asker() {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        float asked = 0f;
        boolean flag = true;

        do {
            System.out.print("Введите число: ");
            if (!input.hasNextFloat()) {
                input.next();
                System.out.println("Не верный ввод! Введите число!");
            } else {
                asked = input.nextFloat();
                flag = false;
                input.close();
            }
        } while (flag);

        return asked;
    }


    public static void main(String[] args) {
        Task1 app = new Task1();
        System.out.println("Asked: " + app.asker());
    }

}