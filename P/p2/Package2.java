package P.p2;

import P.p1.*;

public class Package2 {
    public class C3 implements Package1.I1 {
        public void display(String name, int salary, int empid) {
            salary += 1500;
            System.out.println("The increased Salary and details are:" + "\nName: " + name + "\nSalary: " + salary
                    + "\nEmployee ID: " + empid);
        }
    }

    public class C4 extends Package1.C1 {
        public void bonus(int salary) {
            System.out.println("Bonus is: " + 5000 + " Total Salary: " + (salary + 5000));
        }
    }

    public class C5 extends Package1.C2 {
        public void dob() {
            System.out.println("Date of birth is:" + DOB);
        }
    }
}