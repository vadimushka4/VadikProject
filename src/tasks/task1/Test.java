package tasks.task1;

public class Test {
    public static void main(String[] args) {
        Employer pidaras = new Employer();
        System.out.println(pidaras.getAverageSalary());
        System.out.println(pidaras.getEmployeeWithMaxSalary());
        System.out.println(pidaras.getYoungestEmployee().getSalary());
        System.out.println(pidaras.getEmployeesWithSalaryMoreThan(2500));
    }
}
