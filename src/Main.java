public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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
}