public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Task 1");
        for (int i = 0; i <= 10; i ++) {
            System.out.println("Итерация цикла " + i);
        }

        //Задача 2
        System.out.println("Task 2");
        for (int a = 10; a >= 1; a --) {
            System.out.println("Итерация цикла " + a);
        }

        //Задача 3
        System.out.println("Task 3");
        for (int b = 0; b < 17; b += 2) {
            System.out.println("Итерация цикла " + b);
        }

        //Задача 4
        System.out.println("Task 4");
        for (float w = 10; w <= 10 && w >= -10; w --) {
            System.out.println("Итерация цикла " + w);
        }
    }
}