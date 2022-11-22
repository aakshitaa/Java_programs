
import java.util.Scanner; 
public class UpperConsole 
{ 
    public static void main(String[] args) 
    { 
        try (Scanner in = new Scanner(System.in)) {
            String s = in.nextLine(); 
            int n = s.length(); 
            char[] a = s.toCharArray(); 
            for (int i = 0; i < n; i++) { 
                if (Character.isLowerCase(a[i])) { 
                    a[i] = (char)((int)a[i] - 32); 
                } 
            } 
            s = new String(a); 
            System.out.println(s);
        } 
    } 
}