import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("                    ***  Конвертер валют ***");
        System.out.println("Сдать доллары:");
        int dollars = new Scanner(System.in).nextInt();
        System.out.println("Курс доллара:");
        int dollarKurs = new Scanner(System.in).nextInt();
        System.out.println("Получить руб.: "+ dollars*dollarKurs);
        System.out.println("");
        System.out.println("Сдать евро:");
        int euro = new Scanner(System.in).nextInt();
        System.out.println("Курс евро:");
        int euroKurs = new Scanner(System.in).nextInt();
        System.out.println("Получить руб.: "+ euro*euroKurs);
    }

}
