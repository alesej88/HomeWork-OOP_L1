public class OOP_L1 {
    static class Employee {
        int age;
        String name;
        String surname;
        long tel;
        String email;
        double salary;


        public static void main(String[] args) {
            Employee emp = new Employee();
            emp.age = 30;
            emp.name = "Ivan";
            emp.surname = "Petrov";
            emp.tel = 89003332220L;
            emp.email = "ip@gmail.com";
            emp.salary = 30000;
            System.out.println("Возраст сотрудника: " + emp.age + " лет" + " " + "Имя: " + emp.name + " " + "Фамилия: " + emp.surname + " " + "телефон: " + emp.tel + " " + "емайл: " + emp.email + " " + "зарплата: " + emp.salary);


        }
    }
}
//ex #2 ⦁	Создать массив из 5 сотрудников