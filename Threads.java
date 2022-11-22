import java.lang.Thread;
class A extends Thread{
    public void run(){
        System.out.println("This thread is made from Thread class!");
    }
}
class B implements Runnable{
    public void run(){
        System.out.println("This thread is made from Runnable interface!");
    }
}
class Threads{
    public static void main(String[] args) {
        A obj1=new A();
        B obj2=new B();
        obj1.start();
        Thread objThread=new Thread(obj2);
        objThread.start();
    }
}