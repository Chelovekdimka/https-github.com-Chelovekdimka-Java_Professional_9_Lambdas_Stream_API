//Створити список та заповнити рандомними числами 10 осередків, потрібно вивести суму квадратів усіх елементів списку.
//        Ми використовуємо метод map() для зведення квадрат кожного елемента, а потім застосовуємо метод reduce() для згортки всіх елементів в одне число.

package Ex_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        int sum = list.stream()
                .mapToInt(i -> i * i)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}