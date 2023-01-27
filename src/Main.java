public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static boolean leapYear(int yearCheck) {
        return (yearCheck % 4 == 0 && yearCheck % 100 != 0) || yearCheck % 400 == 0;
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
}