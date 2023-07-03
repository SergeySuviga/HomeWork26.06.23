// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        //task4();
    }

    public static void task1() {
        System.out.println("Задача 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = String.format("%s %s %s", lastName, firstName, middleName);
        System.out.printf("ФИО сотрудника — %s", fullName);
        System.out.println();

    }

    public static void task2() {
        System.out.println("Задача 2");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = String.format("%s %s %s", lastName.toUpperCase(),
                firstName.toUpperCase(),
                middleName.toUpperCase());
        System.out.println(fullName);
    }

    public static void task3() {
        System.out.println("Задача 3");

        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";

        String fullName = String.format("%s %s %s", lastName, firstName, middleName);
        char incorrektSyambol = 'ё';
        char correktSyambol = 'е';
        String currectFullName = fullName.replace(incorrektSyambol, correktSyambol);
        System.out.println("Данные ФИО сотрудника " + " - " +currectFullName);
    }

}
