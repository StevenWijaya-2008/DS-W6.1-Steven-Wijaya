import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan angka umur (pisahkan dengan spasi):");
        String input = sc.nextLine();

        String[] numbers = input.split(" ");

        Queue<Integer> passed = new LinkedList<>();
        Queue<Integer> blocked = new LinkedList<>();

        for (String numStr : numbers) {
            int age = Integer.parseInt(numStr);

            if (age >= 28 && age <= 118) {
                passed.add(age);
            } else {
                blocked.add(age);
            }
        }

        System.out.println(passed);
        System.out.println(blocked);

        sc.close();
    }
}