import java.io.*;

public class EmployeeTest {
    public static void  main(String[] args){
        Employee empOne = new Employee("runoob1");
        Employee empTwo = new Employee("runoob2");

        empOne.empAge(26);
        empOne.empDesignation("高级程序员");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empOne.empAge(20);
        empOne.empDesignation("初级程序员");
        empOne.empSalary(500);
        empOne.printEmployee();
    }
}
