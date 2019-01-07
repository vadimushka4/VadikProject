package tasks.task1;

public class Employer {

    Employee[] employees;

    public Employer() {
        initEmployees();
    }

    private void initEmployees() {

        Employee one = new Employee(21, "Mike", 2000);
        Employee two = new Employee(30, "Justin", 3000);
        Employee three = new Employee(23, "Bill", 1750);
        Employee four = new Employee(33, "John", 2500);
        Employee five = new Employee(19, "Donald", 2600);

        employees = new Employee[]{one, two, three, four, five};
    }

    public int getEmployeeWithMaxSalary() {
        int max = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
            }
        }

        return max;
    }

    public int getAverageSalary() {
        int salarySum = 0;
        for (int i = 0; i < employees.length; i++) {
            salarySum = salarySum + employees[i].getSalary();
        }
        int average = salarySum / employees.length;

        return salarySum;
    }

    public Employee getYoungestEmployee() {
        Employee youngest = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() < youngest.getAge()) {
                youngest = employees[i];
            }
        }

        return youngest;
    }

    public Employee[] getEmployeesWithSalaryMoreThan(int moreSalary) {
        Employee[] employees1 = new Employee[5];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() >= moreSalary) {
                employees1[i] = employees[i];
            }
        }

        return employees1;
    }
}
