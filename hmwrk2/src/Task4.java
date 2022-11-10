import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {

    void slowpoke(Scanner inFlow) {

        System.out.print("Введите что хотите: ");
        String someString = inFlow.nextLine();
        inFlow.reset();

        if (someString.isEmpty()) {
            throw new InputMismatchException("Пустые строки вводить нельзя!");
        } else {
            System.out.println("Вы ввели: " + someString);
        }
    }

    public static void main(String[] args) {
        Task4 app = new Task4();
        Scanner inFlow = new Scanner(System.in);
        app.slowpoke(inFlow);
        app.slowpoke(inFlow);
        app.slowpoke(inFlow);
        inFlow.close();
    }
}