import  java.util.Scanner;
class StringLength{
    static String name;
    StringLength(){
        name="aakshita";
    }
    void length(){
        System.out.println(name.length());
    }
    void contains_a(){
        if (name.contains("a")){
            int occ=0;
            for(int i=0;i<name.length();i++){
                if(name.charAt(i)=='a'){
                    occ++;
                    System.out.println("Locations where ' a ' occurred: "+i);
                }
            }
            System.out.println("Number of times' a ' occurred: "+occ);           
    }
        else{
            System.out.println("String doesnt conatin 'a'");
        }
    }
    public static void main(String[] args) {
        StringLength obj=new StringLength(); 
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter String: ");
            name= sc.nextLine();
        }
        name.toLowerCase();  
        obj.length();
        obj.contains_a();
    }
}