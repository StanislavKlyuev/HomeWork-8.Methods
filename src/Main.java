public class Main {

    public static void main(String[] args) {

        System.out.println("Task 1");
        /* Реализуйте метод, который получает в качестве параметра год, проверяет, является ли он високосным, и выводит результат в консоль.
        Эту проверку вы уже реализовывали в задании по условным операторам.
        Теперь проверку оберните в метод и используйте год, который приходит в виде параметра.
        Результат программы выведите в консоль. Если год високосный, то напечатайте сообщение:
        «...  год — високосный год». Если год невисокосный, то: «... год — невисокосный год».*/

        int year = 2018;
        printLeapYear(year);
        System.out.println();


        System.out.println("Task 2");
        /* Вспомните задание 2 из урока «Условные операторы», где вы предлагали пользователю облегченную версию приложения.
        Напишите метод, куда подаются два параметра: тип операционной системы (0 — iOS, 1 — Android ) и год выпуска устройства.
        Если устройство старше текущего года, предложите ему установить облегченную версию.
        Текущий год можно получить таким способом:
        int currentYear = LocalDate.now().getYear();
        Или самим задать значение вручную — ввести в переменную числовое значение.
        В результате программа должна выводить в консоль сообщение, какую версию приложения (обычную или облегченную)
        и для какой ОС (Android или iOS) установить пользователю.*/

        int clientOS = 1;
        int yearPhone = 2016;
        printSettingMessage(clientOS, yearPhone);
        System.out.println();


        System.out.println("Task 3");
        /* Возвращаемся к задаче на расчет дней доставки банковской карты.
        Ваша задача — доработать код, а именно написать метод, который на вход принимает дистанцию и возвращает итоговое количество дней доставки.*/

        int deliveryDistance = 125;
        System.out.println("Потребуется дней: " + deliveryDay(deliveryDistance));
        System.out.println();
    }


    public static void printLeapYear(int year) {
        if (year < 1584)
            System.out.println(year + " год не является високосным");
        else {
            if (year % 100 == 0 && year % 400 != 0)
                System.out.println(year + " год не является високосным");
            else if (year % 4 == 0)
                System.out.println(year + " год является високосным");
            else
                System.out.println(year + " год не является високосным");
        }
    }


    public static void printSettingMessage(int os, int year) {
        if (os == 0) {
            if (year > 2015)
                System.out.println("Установите версию приложения для iOS по ссылке");
            else
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            if (year > 2015)
                System.out.println("Установите версию приложения для Android по ссылке");
            else
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }


    public static String deliveryDay(int distance) {
        if (distance <= 20)
            return "1";
        else if (distance <= 60)
            return "2";
        else if (distance <= 100)
            return "3";
        else
            return "Доставки нет";
    }

}