package edu.skypro.coursework;

public class EmployeeBook {
    private final Employee[] employees;
    private int size;

    public EmployeeBook() {
        employees = new Employee[10];
    }

    public void printAllEmployees() {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            System.out.println(employee);
        }
    }

    public double calculateCostsAmountOnSalaries() {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public Employee findMinSalary() {
        double minSalary = Integer.MAX_VALUE;
        Employee employee = null;
        for (Employee value : employees) {
            if (value.getSalary() < minSalary) {
                minSalary = value.getSalary();
                employee = value;
            }
        }
        return employee;
    }

    public Employee findMaxSalary() {
        double maxSalary = Integer.MIN_VALUE;
        Employee employee = null;
        for (Employee value : employees) {
            if (value.getSalary() > maxSalary) {
                maxSalary = value.getSalary();
                employee = value;
            }
        }
        return employee;
    }

    public double calculateAverageSalary() {
        return calculateCostsAmountOnSalaries() / size;
    }

    public void printFullNameAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    public void indexSalary(int indexRateInPercent) {
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() + (employee.getSalary() * indexRateInPercent / 100));
        }
    }

    public Employee findMinSalaryInDepartment(int department) {
        double minSalaryInDepartment = Integer.MAX_VALUE;
        Employee employee = null;
        for (Employee value : employees) {
            if (value.getSalary() < minSalaryInDepartment && department == value.getDepartment()) {
                minSalaryInDepartment = value.getSalary();
                employee = value;
            }
        }
        return employee;
    }

    public Employee findMaxSalaryInDepartment(int department) {
        double maxSalaryInDepartment = Integer.MIN_VALUE;
        Employee employee = null;
        for (Employee value : employees) {
            if (value.getSalary() > maxSalaryInDepartment && department == value.getDepartment()) {
                maxSalaryInDepartment = value.getSalary();
                employee = value;
            }
        }
        return employee;
    }

    public double calculateCostsAmountOnSalariesInDepartment(int department) {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public double calculateAverageSalaryInDepartment(int department) {
        int countEmployeesInDepartment = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                ++countEmployeesInDepartment;
            }
        }
        return calculateCostsAmountOnSalariesInDepartment(department) / countEmployeesInDepartment;
    }

    public void indexSalaryInDepartment(int indexRateInPercent, int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                employee.setSalary(employee.getSalary() + (employee.getSalary() * indexRateInPercent / 100));
            }
        }
    }

    public void printAllEmployeesInDepartment(int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println(employee);
            }
        }
    }

    public void printEmployeesIfTheySalaryLessThen(int salaryLessThen) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salaryLessThen) {
                System.out.println(employee);
            }
        }
    }

    public void printEmployeesIfTheySalaryMoreThen(int salaryMoreThen) {
        for (Employee employee : employees) {
            if (employee.getSalary() > salaryMoreThen) {
                System.out.println(employee);
            }
        }
    }

    public void addEmployee(String fullName, int department, double salary) {
        if (size >= employees.length) {
            System.out.println("Нельзя добавить сотрудника, закончилось место");
        }
        Employee newEmployee = new Employee(fullName, department, salary);
        employees[size++] = newEmployee;
    }

    public void removeEmployeeById(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                System.out.println(employees[i].getFullName() + ". Id: " + employees[i].getId() + ", удален");
                System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                employees[size - 1] = null;
                size--;
                return;
            }
        }
    }

    public void removeEmployeeByFullName(String fullName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFullName().equals(fullName)) {
                System.out.println(employees[i].getFullName() + ". Id: " + employees[i].getId() + ", удален");
                System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                employees[size - 1] = null;
                size--;
                return;
            }
        }
    }
}
