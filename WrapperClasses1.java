public class WrapperClasses1{
public static void main(String[] args) {
    int num = 10; 
    Integer num1 = new Integer(num); 
    String str1 = num1.toString(); 
    int num2 = Integer.parseInt(str1); 
    String str2 = Integer.toString(num2); 
    Integer num3 = Integer.valueOf(str2); 
    int num4 = num3.intValue();
    System.out.println("int to integer: "+num1+"\nInteger to String: "+str1+"\nString to int: "+num2+"\nint to String: "+str2+"\nString to Integer: "+num3+"\nInteger to int: "+num4);
}
}