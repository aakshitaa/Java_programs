import java.util.Scanner;
class ToUpperStringBuffer 
{ 
    public static void main(String args[]) 
    { 
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter string to change to upper case: ");
            String str = sc.nextLine();
            System.out.println("String in upper case:" +changeToUpper(str));
        } 
    } 
    static String changeToUpper(String str) 
    { 
        StringBuffer sbf = new StringBuffer(str); 
        for (int i=0; i<sbf.length(); i++) 
        { 
            char ch = sbf.charAt(i); 
            if (Character.isLowerCase(ch)) 
            { 
                sbf.setCharAt(i, Character.toUpperCase(ch)); 
            } 
        } 
        return sbf.toString(); 
    } 
}