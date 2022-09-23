package P.p1;

import java.util.Scanner;

public class Package1 {
    public interface I1 {
        final String r = "The details of the employee are as follows-";

        void display(String name, int salary, int empid);
    }

    public static class C1 {
        Scanner sc = new Scanner(System.in);
        private long acc_number = 11244570;
        public static int salary = 25000;
        public String name = "Aakshita Singh";
        int empid = 78472;
        protected int acc_bal = 758444;

        public void bankdetails() {
            System.out.println("want to check account details? Y/N");
            String ch = sc.nextLine();
            switch (ch) {
                case "Y":
                    System.out.println("Account number is: " + acc_number + "\n Account Balance is: " + acc_bal);
                    break;
                case "N":
                    System.out.println("Ok!");
                    break;
                default:
                    break;
            }
        }
    }

    public static class C2 extends C1 implements I1 {
        public String DOB = "06/11/2003";

        public void display(String name, int salary, int empid) {
            System.out.println(r + "\nName: " + name + "\nSalary: " + salary + "\nEmployee ID: " + empid);
        }
    }
}