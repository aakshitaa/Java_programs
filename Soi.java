public class Soi {
    void sum() {
        int sum = 0;
        int n = 41;
        while (n < 250) {
            if (n % 5 == 0)
                sum += n;
            n++;
        }
        System.out.println(sum);
    }

    public static void main(String args[]) {
        Soi ob = new Soi();
        ob.sum();
    }
}