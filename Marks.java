import java.util.Scanner;

class Marks {

    void sort(int arr[]) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        check(arr);
    }

    void check(int arr[]) {
        String grade;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 40 && arr[i] <= 50) {
                grade = "PASS";
            } else if (arr[i] >= 51 && arr[i] <= 75) {
                grade = "MERIT";
            } else {
                grade = "DISTINCTION";
            }
            System.out.println("marks:" + arr[i] + "\tgrades:" + grade);
        }
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = new int[10];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            Marks m = new Marks();
            m.sort(arr);
        }
    }
}
