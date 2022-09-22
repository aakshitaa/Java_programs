package P;

import P.p1.Package1.*;
import P.p2.Package2;
import P.p2.Package2.*;

public class Final_Package {
    public static void main(String[] args) {
        Package2 p2 = new Package2();
        C1 obj1 = new C1();
        C2 obj2 = new C2();
        C3 obj3 = p2.new C3();
        C4 obj4 = p2.new C4();
        C5 obj5 = p2.new C5();
        obj1.bankdetails();
        obj2.display("Aakshita", 50000, 500097);
        obj3.display("Aakshita", 50000, 500097);
        obj4.bonus(50000);
        obj5.dob();
    }
}
