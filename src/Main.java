public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание - 2");
        // Задание 1
        int age = 25;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }

        // Задание 2
        int childsAge = 6;
        if (childsAge < 5) {
            System.out.println("Ребенок не может кататься на аттракционе");
        } else if (childsAge < 14) {
            System.out.println("Ребенок может кататься в сопровождении взрослого");
        } else {
            System.out.println("Ребенок может кататься на атракционе");
        }

        // Задание 3
        int one = 10;
        int two = 18;
        int three = -100;
        if (one > two) {
            if (one > three) {
                System.out.println(one);
            } else if (one < three) {
                System.out.println(three);
            } else {
                System.out.println("Числа " + one + three + " равны");
            }
        } else if (one < two) {
            if (two > three) {
                System.out.println(two);
            } else if (two < three) {
                System.out.println(three);
            } else {
                System.out.println("Числа " + two + three + " равны");
            }
        } else {
            if (one > three) {
                System.out.println(one);
            } else if (one < three) {
                System.out.println(three);
            } else {
                System.out.println("Все числа равны");
            }
        }
    }

        }