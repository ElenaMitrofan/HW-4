public class Main {
    public static void main(String[] args) {
        // Задание 1
        int age = 200;
        if (age >=18) {
            System.out.println("Поздравляем с совершенолетием!");
        }
        if (age <18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }

        // Задание 2
        if (age >=7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age >=18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (age >=24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        // Задание 3
        int capacity = 102;
        int seatPlace = 60;
        int standingRoom = capacity - seatPlace;

        int seatsUsed = 200;

        if (seatsUsed <= seatPlace) {
            System.out.println("Осталось " + (seatPlace - seatsUsed) + " сидячих мест и " + standingRoom + " стоячих мест");
        }
        if (seatsUsed > seatPlace && seatsUsed <= capacity) {
            System.out.println("Осталось " + (capacity - seatsUsed) + " стоячих мест");
        }
        if (seatsUsed > capacity) {
            System.out.println("Вагон не может вместить такое количество пассажиров");
        }


    }
}