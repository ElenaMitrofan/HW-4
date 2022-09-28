public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание - 2");
        // Задание 1
        int age = 20;
        if (age >=18) {
            System.out.println("Поздравляем с совершенолетием!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }

        // Задание 2
        if (age >=7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        } else if (age >=18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        // Задание 3
        int capacity = 102;
        int seatPlace = 60;
        int standingRoom = capacity - seatPlace;

        int seatsUsed = 200;

        if (seatsUsed <= seatPlace) {
            System.out.println("Осталось " + (seatPlace - seatsUsed) + " сидячих мест и " + standingRoom + " стоячих мест");
        } else if (seatsUsed > seatPlace && seatsUsed <= capacity) {
            System.out.println("Осталось " + (capacity - seatsUsed) + " стоячих мест");
        } else {
            System.out.println("Вагон не может вместить такое количество пассажиров");
        }


    }
}