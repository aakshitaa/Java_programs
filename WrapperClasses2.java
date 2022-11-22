public class WrapperClasses2{
    public static void main(String[] args) {
        float num = 5.5f;
        Float num1 = Float.valueOf(num);
        String str1 = num1.toString();
        float num2 = Float.parseFloat(str1);
        String str2 = Float.toString(num1);
        Float num3 = Float.valueOf(str2);
        float num4 = num3.floatValue();
        System.out.println("float to Float: "+num1+"\nFloat to String: "+str1+"\nString to float: "+num2+"\nfloat to String: "+str2+"\nString to Float: "+num3+"\nFloat to float: "+num4);
    }
    }