import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество продаж в день нового менеджера через пробел:");
        System.out.print(">>>");

        String[] input = scanner.nextLine().split(" ");
        int[] salesCount = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            salesCount[i] = Integer.parseInt(input[i]);
        }

        SalesManager newManager;
        newManager = new SalesManager(salesCount);

        System.out.println("newManager's week sales: " + Arrays.toString(newManager.sales));
        System.out.println("newManager's max sale is: " + newManager.max());
        System.out.println("newManager's min sale is: " + newManager.min());
        System.out.println("newManager's trimmed mean: " + newManager.trimmedMean());
    }
}
