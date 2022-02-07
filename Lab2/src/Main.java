import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int menu;
        Scanner reader = new Scanner(System.in);

        System.out.println("Начать покупки?\n" +
                "1)Да\n" +
                "0)Нет");
        menu = reader.nextInt();
        while (menu != 0) {
            menu = 1000;
            Product product = null;
            System.out.println("Что хотите купить ?:\n" +
                    "1)Мороженное\n" +
                    "2)Смузи\n" +
                    "3)Йоугрт\n");
            menu = reader.nextInt();
            switch (menu) {
                case 1:
                    product = new Product(FormsProduct.ICE_CREAM);
                    break;
                case 2:
                    product = new Product(FormsProduct.SMOOTHIE);
                    break;
                case 3:
                    product = new Product(FormsProduct.YOGURT);
                    break;
                default:
                    System.out.println("Неверно указан номер товара!");
            }
            if (product == null) {
                break;
            }
            System.out.printf("Добавить топпинг?:\n" +
                    "1)Не добавлять\n" +
                    "2)Сироп\n" +
                    "3)Посыпка\n");
            menu = reader.nextInt();
            switch (menu) {
                case 1:
                    System.out.println(product.sell());
                    break;
                case 2:
                    ProductWithTopping productWithTopping = new ProductWithTopping(product,FormsTopping.SYROP);
                    System.out.println(productWithTopping.sell());
                    break;
                case 3:
                    ProductWithTopping productWithTopping1 = new ProductWithTopping(product,FormsTopping.DRESSING);
                    System.out.println(productWithTopping1.sell());
                    break;
            }
            System.out.println("Купить еще?\n" +
                    "1)Дa\n" +
                    "0)Нет\n");
            menu = reader.nextInt();

        }
        System.out.println("Всего доброго)");
    }
}
