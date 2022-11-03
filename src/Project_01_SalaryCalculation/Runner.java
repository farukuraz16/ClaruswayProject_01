package Project_01_SalaryCalculation;

public class Runner {
    public static void main(String[] args) {
        Employee employee = new Employee("Drake", 20000,41,2020);
        System.out.println("employee name = " + employee.name);
        System.out.println("employee salary = " + employee.salary);
        System.out.println("ödenecek vergi= " + employee.tax()+" tl");
        System.out.println("ödenecek bonus= " + employee.bonus());
        System.out.println("maaş artışı = " + employee.raiseSalary());

        System.out.println("employee toplam ödenecek maaş = " + (employee.salary + employee.raiseSalary()));
        System.out.println("employee.toString() = " + employee.toString());
    }

}
