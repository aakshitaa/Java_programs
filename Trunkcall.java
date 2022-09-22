import java.util.*;

class Ordinary {
    double charges(int duration) {
        return 2.5 * duration;
    }
}

class Urgent {
    double charges(int duration) {
        return 3.5 * duration;
    }
}

class Lightning {
    double charges(int duration) {
        return 5.5 * duration;
    }
}

public class Trunkcall {
    public static void main(String[] args) {
        System.out.println("enter choice as 1 for ordinary, 2 for urgent, 3 for lightning :");
        try (Scanner sc = new Scanner(System.in)) {
            int ch = sc.nextInt();
            System.out.println("enter duration");
            int dur = sc.nextInt();
            double chr = 0;
            switch (ch) {
                case 1:
                    Ordinary o = new Ordinary();
                    chr = o.charges(dur);
                    break;
                case 2:
                    Urgent u = new Urgent();
                    chr = u.charges(dur);
                    break;
                case 3:
                    Lightning l = new Lightning();
                    chr = l.charges(dur);
                    break;
                default:
                    System.out.println("Wrong choice enterred!");
                    break;
            }
            System.out.println("Total Charges: " + chr);
        }
    }
}