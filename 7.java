/******************************************************************************
 ФИ: Талибов Сабир
 Группа:3523
 *******************************************************************************/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Task_3_2 {
    public static void main(String[] args) {
        System.out.print("Введите длину списка N: ");
        try (Scanner iScanner = new Scanner(System.in)) {
            int N = iScanner.nextInt();
            ArrayList ar = new ArrayList<>();
            Random ran = new Random();
            for (int i = 0; i < N; i++) {
                int x = ran.nextInt(N);
                ar.add(x);
            }
            System.out.println("Произвольный список целых чисел: \n " + ar);
            for (int i = ar.size() - 1; i >= 0; i--) {
                int even = ar.get(i) % 2;
                if (even == 0) {
                    ar.remove(i);
                }
            }
            Collections.sort(ar);
            System.out.println("Список с удаленными четными числами: \n " + ar);
        } catch (Exception e) {
            System.out.println("Ошибка ввода: " + e.getMessage());
        }
    }
}