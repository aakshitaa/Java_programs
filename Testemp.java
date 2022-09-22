class Employee {
    String name;
    int empid, salary;
    Employee() {
        name="xyz";
        empid=500094122;
        salary=25000;
    }
    Employee(String name, int empid, int salary){
        name=this.name;
        empid=this.empid;
        salary=this.empid;
    }
    void display(){
        System.out.println("Name= "+name+"Salary= "+salary);
    }
    void increaseSalary(){
        salary+=5000;
    }
}
class Manager extends Employee{
    Employee department =new Employee();
}

public class Testemp {
    
}
