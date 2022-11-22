import java.lang.Thread;
class X extends Thread{
    static int num=0;
    synchronized public void run(){
    System.out.println(num++);    }
}
class ThreadSync{
    public static void main(String[] args) {
        X obj1=new X();
        X obj2=new X();
        X obj3=new X();
        X obj4=new X();
        X obj5=new X();
        X obj6=new X();
        X obj7=new X();
        X obj8=new X();
        X obj9=new X();
        X obj10=new X();
        obj1.start();
        obj2.start();
        obj3.start();
        obj4.start();
        obj5.start();
        obj6.start();
        obj7.start();
        obj8.start();
        obj9.start();
        obj10.start();
    }
}