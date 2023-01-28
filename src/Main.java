public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static boolean leapYear(int yearCheck) {
        return (yearCheck % 4 == 0 && yearCheck % 100 != 0) || yearCheck % 400 == 0;
    }

    public static String deviceOs(int deviceCheck) {
        if (deviceCheck == 0) {
            return "iOS";
        } else {
            return "Android";
        }
    }
    public static String yearCheck(int deviceYearCheck) {
        int currentYear = 2023;
        if (deviceYearCheck < currentYear) {
            return "облегченную ";
        } else {
            return "";
        }
    }
    public static String deliveryDays(int deliveryDistance) {
        int days = 0;
        if (deliveryDistance < 20) {
            days = 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            days = 2;
        } else if (deliveryDistance < 100 && deliveryDistance >= 60) {
            days = 3;
        } else if (deliveryDistance > 100) {
            days = 4;
        }
        boolean deliveryPossibility = days < 4;
        if (deliveryPossibility) {
            return ("Потребуется дней: " + days);
        } else {
            return "Доставки нет";
        }
        }
    public static void task1() {
        System.out.println("Задание 1");
        int year = 2021;
        boolean leapYearCheck = leapYear(year);
        if (leapYearCheck) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void task2() {
        System.out.println("Задание 2");
        int deviceYear = 2023;
        int deviceSystem = 0;
        System.out.println("Установите " + yearCheck(deviceYear) + "версию приложения для " + deviceOs(deviceSystem) + " по ссылке");
    }
    public static void task3() {
        int distance = 95;
        System.out.println(deliveryDays(distance));
    }
}