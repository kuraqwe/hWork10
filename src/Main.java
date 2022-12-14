public class Main {
    public static void main(String[] args) {
        //the first task
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        //the second task
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());
        //the third task
        System.out.println("Данные ФИО сотрудника - " + fullName.replace("ё", "е"));
    }
}