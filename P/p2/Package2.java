package P.p2;

import P.p1.*;
import P.p1.Package1.C1;

public class Package2 {
    public class C3 implements Package1.I1 {
        public void display(String name, int salary, int empid) {
            C1.salary += 1500;
            System.out.println("\nThe increased Salary and details are:" + "\nName: " + name + "\nSalary: " + C1.salary
                    + "\nEmployee ID: " + empid);
        }
    }

    public class C4 extends Package1.C1 {
        public void bonus() {
            C1.salary = C1.salary + 5000;
            System.out.println("\nBonus is: " + 5000 + " \nTotal Salary: " + (C1.salary));
        }
    }

    public class C5 extends Package1.C2 {
        public void dob() {
            System.out.println("\nDate of birth is:" + DOB);
        }
    }
}