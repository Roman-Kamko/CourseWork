package edu.skypro.coursework;

public class Main {
    static Employee[] employeeBook = new Employee[10];

    public static void main(String[] args) {
        employeeBook[0] = new Employee("Иванов Иван Иванович", 1, 70_000);
        employeeBook[1] = new Employee("Семенов Семен Семенович", 1, 70_000);
        employeeBook[2] = new Employee("Андреев Андрей Андреевич", 2, 65_000);
        employeeBook[3] = new Employee("Петров Петр Петрович", 2, 65_000);
        employeeBook[4] = new Employee("Сергеев Сергей Сергеевич", 3, 60_000);
        employeeBook[5] = new Employee("Романов Роман Романович", 3, 60_000);
        employeeBook[6] = new Employee("Елисеев Елисей Елисеевич", 4, 55_000);
        employeeBook[7] = new Employee("Парфенов Парфен Парфенович", 4, 55_000);
        employeeBook[8] = new Employee("Антонов Антон Антонович", 5, 50_000);
        employeeBook[9] = new Employee("Игнатов Игнат Игнатович", 5, 50_000);
        printAllEmployees();
        System.out.println(calculateCostsAmountOnSalaries());
        System.out.println(findEmployeeWithMinSalary());
        System.out.println(findEmployeeWithMaxSalary());
    }

    public static void printAllEmployees() {
        for (int i = 0; i < employeeBook.length; i++) {
            Employee employee = employeeBook[i];
            System.out.println(employeeBook[i].toString());
        }
    }

    public static double calculateCostsAmountOnSalaries() {
        int sum = 0;
        for (int i = 0; i < employeeBook.length; i++) {
            sum += employeeBook[i].getSalary();
        }
        return sum;
    }

    public static String findEmployeeWithMinSalary() {
        double minSalary = employeeBook[0].getSalary();
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i].getSalary() < minSalary) {
                minSalary = employeeBook[i].getSalary();
            }
        }
        String employeeWithMinSalary = employeeBook[0].toString();
        for (int i = 0; i < employeeBook.length; i++) {
            if (minSalary == employeeBook[i].getSalary()) {
                employeeWithMinSalary = employeeBook[i].toString();
            }
        }
        return employeeWithMinSalary;
    }

    public static Employee findEmployeeWithMaxSalary() {
        double maxSalary = employeeBook[0].getSalary();
        Employee employee = null;
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i].getSalary() > maxSalary) {
                maxSalary = employeeBook[i].getSalary();
            }
            if (maxSalary == employeeBook[i].getSalary()) {
                employee = employeeBook[i];
            }
        return employee;
    }


}
