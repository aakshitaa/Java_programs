import java.lang.Thread;
class A1 extends Thread{
    public void run(){
        for(int i=0;i<20;i++)
        {
            if (i%2==0)
        System.out.println("Even-"+i);
        }
    }
}
class B1 implements Runnable{
    public void run(){
        for(int i=0;i<20;i++)
        {
            if (i%2!=0)
        System.out.println("Odd-"+i);
        }
    }
}
class ThreadEvenOdd{
    public static void main(String[] args) {
        A1 obj1=new A1();
        B1 obj2=new B1();
        obj1.start();
        Thread objThread=new Thread(obj2);
        objThread.start();
    }
}