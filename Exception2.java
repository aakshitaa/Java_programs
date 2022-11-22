class MyException extends Exception {
	MyException(String msg) {
		super(msg);
	}
}
public class Exception2 {
	public static void main(String[] args) {
		try {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
			if (a % b == 0) {
				System.out.println("Modulus of " + a + " and " + b + " is: " + a % b);
			} else
				throw new MyException("Operand is nonnumeric");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}