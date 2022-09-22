class parent {
    private int a = 10;
    int p = 2;

    private int mult() {
        return a * p;
    }

    int sum() {
        return a + p;
    }
}

class child extends parent {
    int b = a;
    int m = mult();
    int s = sum();

    int total() {
        return b + m + s;
    }

}

public class Pvt {
    public static void main(String args[]) {
        child obj = new child();
        int d = obj.total();
        System.out.println(d);
    }
}