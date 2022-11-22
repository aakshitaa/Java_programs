import java.lang.Thread;
class X extends Thread{
    public void run(){
        int pri=Thread.currentThread().getPriority();
        if (pri >8)
        {
        try{
            Thread.sleep(500);}
            catch(InterruptedException e)
            {System.out.println(e);}  
        }
    System.out.println("This is: "+Thread.currentThread().getName());    }
}
class ThreadPrioritySleep{
    public static void main(String[] args) throws InterruptedException {
        X obj1=new X();
        X obj2=new X();
        X obj3=new X();
        X obj4=new X();
        X obj5=new X();
        obj1.setPriority(10);
        obj2.setPriority(9);
        obj3.setPriority(8);
        obj4.setPriority(7);
        obj5.setPriority(6);
        obj1.start();
        obj2.start();
        obj3.start();
        obj4.start();
        obj5.start();   
    }
}