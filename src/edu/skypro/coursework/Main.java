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
        for (Employee employee : employeeBook) {
            System.out.println(employee.toString());
        }
    }

    public static double calculateCostsAmountOnSalaries() {
        int sum = 0;
        for (Employee employee : employeeBook) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static String findEmployeeWithMinSalary() {
        double minSalary = employeeBook[0].getSalary();
        for (Employee value : employeeBook) {
            if (value.getSalary() < minSalary) {
                minSalary = value.getSalary();
            }
        }
        String employeeWithMinSalary = employeeBook[0].toString();
        for (Employee employee : employeeBook) {
            if (minSalary == employee.getSalary()) {
                employeeWithMinSalary = employee.toString();
            }
        }
        return employeeWithMinSalary;
    }

    public static Employee findEmployeeWithMaxSalary() {
        double maxSalary = employeeBook[0].getSalary();
        Employee employee = null;
        for (Employee value : employeeBook) {
            if (value.getSalary() > maxSalary) {
                maxSalary = value.getSalary();
                employee = value;
            }
            /*if (maxSalary == value.getSalary()) {
                employee = value;
                break;
            }*/
        }
        return employee;
    }
}