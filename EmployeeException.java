import java.util.Scanner;
public class EmployeeException {
   EmployeeException(){
        System.out.println("All entered employee details are correct");
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Employee name: ");
            String name = scanner.nextLine();
            System.out.println("Enter Employee age: ");
            int age = scanner.nextInt();

            try{
                if(Character.isDigit(name.charAt(0))){
                    throw new NameException("Name cannot start with a digit");
                } else if(age > 50){
                    throw new AgeException("Age cannot be greater than 50");
                } else {
                    EmployeeException obj=new EmployeeException();
                }
            } catch (NameException e){
                System.out.println(e.getMessage());
            } catch (AgeException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
class NameException extends Exception {
    public NameException(String message) {
        super(message);
    }
}
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}