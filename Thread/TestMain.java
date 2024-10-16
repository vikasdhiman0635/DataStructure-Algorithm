package Thread;

public class TestMain {

    public static void main(String[] args) {
        System.out.println();
        // test t1 = new test();
        // t1.start();

        // test2 r= new test2();
        // Thread t2= new Thread(r);
        // t2.start();


        // for (int i = 0; i < 3; i++) {
        //     System.out.println("the main thread");
        // }

        // Join
        // Join j1= new Join();
        // Join j2= new Join();
        // Join j3= new Join(); 

        // j1.setName("Ram");
        // j2.setName("Mohan");
        // j3.setName("vivek");


        // j2.start();

        // try {
        //     j2.join();
        // } catch (InterruptedException e) {
        // }

        // j1.start();
        // j3.start();


        // Yield
        // Yield y1 = new Yield();
        // Yield y2 = new Yield();
        // Yield y3 = new Yield();

        // y1.setName("Ram");
        // y2.setName("Mohan");
        // y3.setName("vivek");

        // y1.start();
        // y2.start();
        // y3.start();

        // Stop
        // Stop s1 =new Stop();
        // Stop s2 =new Stop();
        // Stop s3 =new Stop();

        // s1.setName("Ram");
        // s2.setName("Mohan");
        // s3.setName("vivek");

        // s1.start();
        // s2.start();
        // s3.start();

        // s2.stop();

        // isAlive()
        // IsAlive i1= new IsAlive();

        // i1.setName("Ram");

        // System.out.println(i1.isAlive());
        // i1.start();
        // System.out.println(i1.isAlive());

        // Interrupt
        // Interrupt i1 = new Interrupt();
        // Interrupt i2 = new Interrupt();
        // Interrupt i3 = new Interrupt();

        // i1.setName("Mohan");
        // i2.setName("Ram");
        // i3.setName("vivek");

        // i1.start();
        // i2.start();
        // i3.start();

        // i2.interrupt();

        // Priority
        // Priority p1= new Priority();
        // Priority p2= new Priority();
        // Priority p3= new Priority();

        // p1.setName("Mohan");
        // p2.setName("Ram");
        // p3.setName("vivek");

        // p1.setPriority(Thread.MAX_PRIORITY);
        // p2.setPriority(Thread.MIN_PRIORITY);
        // p3.setPriority(Thread.NORM_PRIORITY);

        // p1.start();
        // p2.start();
        // p3.start();

        // Synchronization
        // Bus s1 = new Bus(1);

        // Thread t1 = new Thread(s1);
        // Thread t2 = new Thread(s1);
        // Thread t3 = new Thread(s1);

        // t1.setName("Vikas");
        // t2.setName("Vivek");
        // t3.setName("Yoganter");

        // t1.start();
        // t2.start();
        // t3.start();


        // static synchronization
        Bank b1 = new Bank(3000);

        Thread t1 = new Thread(b1);
        Thread t2 = new Thread(b1);

        Bank b2 = new Bank(2000);

        Thread t3 = new Thread(b2);
        Thread t4 = new Thread(b2);

        t1.setName("Ram");
        t2.setName("Sunita");

        t3.setName("Mohan");
        t4.setName("Roshni");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }

}

class test extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("the child thread");
        }
    }

}

class test2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println("the child thread");
        }
    }
    
}



// Thread Life Cycle
// As we know a thread is well known for independent execution, during the life cycle a thread can move from different states

// States
// 1: New State (Born)
// 2: Runnable State (Ready)
// 3: Running State (Execution)
// 4: Waiting State (Blocked)
// 5: Dead State (Exit)


//          Thread t = new Thread();
//              t.start();       Thread Schedular       Run Complete
//                  |                   |                   |
//     t---> New ----->  Runnable  --------->    Running  ---------> Dead
//                         ^                        | t.wait();
//                         |                        | t.join();
//                         |                        | t.sleep(1XXX);
//                          ---------Waiting<-------- t.suspend();


// Thread.sleep(1XXXX);
// It is a static method into the Thread class
// It's throws checked exception i.e. InterrupedException
// The main purpose of sleep method to put a thread into the waiting state for some time, and after time complete it's going to Runnable state
// Syntax:-> Thread.sleep(1000);
//              OR
//          Thread t = new Thread();
//          t.sleep(1000);



// What is Join method?
// The main purpose of join mothod to put the thread into the waiting state.
// If we want to execute complete any particular thread among all the threads awailable int the thread pool.
// Join method also throws a checked exception i.e. Interrupted Exception


class Join extends Thread{
    
    @Override
    public void run() {
        String n = Thread.currentThread().getName();
        for(int i=0; i<3; i++){
            System.out.println(n);
        }
    }
}


// Thread Schedular ?
// Thread Schedular is a part of JVM which execute multiple threads on a single processor randomly

//                                    JVM                               CPU
//                                  ___________
//  t1--------------------->       |           |------------------->           
//  t2--------------------->       |           |------------------->
//  t3--------------------->       |           |------------------->
//                                 |___________|

// Thread Schedular Algorithms
// 1: FCFS (First come first serve)
// 2: SJF  (Sort job first)
// 3: Round Robin 


// Yield() ?
// Yield is a method of thread class that allow us to run another thread which has same priority by pause it's current thread
// It is a Static method
// It can or can not be run because, If both threads have some priority then it will not work If all threads have 
// different priority the it will be work


class Yield extends Thread {

    @Override
    public void run() {
        String n = Thread.currentThread().getName();
        for(int i=0; i<3; i++){
            System.out.println(n);
            if(n.equals("Ram")){
                Thread.yield();  // using this I will skip this thread and go back to Runnable method
            }
        }
    }

}

// Stop()
// Stop is a method of thread class, which is used to terminate a thread permanantly
// It is not a safe method it's depricated
// it was comming in Java 1.2 version

class Stop extends Thread{

    @Override
    public void run() {
        String n = Thread.currentThread().getName();
        for(int i=0; i<3; i++){
            System.out.println(n);
        }
    }

}



// isAlive()?
// isAlive is a predefined method if thread class, which can verify weather a thread isAlive or not.
//
// Note:-> 1: If we use isAlive method before the start method then it will print false but after the start method it will print true
//         2: If thread isAlive then it will return true otherwise false

class IsAlive extends Thread{

    @Override
    public void run() {
        String n = Thread.currentThread().getName();
        for(int i=0; i<3; i++){
            System.out.println(n);
        }
    }

}

// Interrupt()
// Interrupt is a method of a thread class, which is using to interrupt the thread
// 
// Note:-> 1: If any thread is in sleeping or waiting state then we can easily interrupt the exception of thread by following InterruptedException
//         2: If thread not in sleep or waiting state ther ther execute normally

class Interrupt extends Thread{

    @Override
    public void run() {
        String n = Thread.currentThread().getName();
        for(int i=0; i<3; i++){
            System.out.println(n);
            if(n.equals("Ram")){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) { }
            }
        }
    }

}




// Thread Priority
// In java it is posible to asign the priority of a thread
// To set these priority java thread class has provided two predefine methods
// 1: setpriority()
// 2: getpriority()

// The Thread class has also provided thress PRE_DEFINE final static variable and it's value lie between 1 to 10.
// 
// Thread.MIN_PROPERITY ------> 1
// Thread.NORM_PROPERITY ------> 5
// Thread.MAX_PROPERITY ------> 10

// By default Thread priority is 5(Thread.NORM_PROPERITY)

class Priority extends Thread{

    @Override
    public void run() {
        String n = Thread.currentThread().getName();
        System.out.println(Thread.currentThread().getPriority());
        for(int i=0; i<3; i++){
            System.out.println(n);
        }
    }

}



// Synchronization in Thread
// Multithreading is very good when you want to complete one task as soon as posible, but
// in some situation it may provides some wrong result or some corrupted data, this 
// situation occure whenever on same resource is accessiable by multiple thread at the same time.

class Bus implements Runnable{

    int seat=1;
    int passenger;

    Bus(int passenger){
        this.passenger = passenger;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized(this){
        if(seat>=passenger){
            System.out.println(name +" Reversed Seat........!");
            seat= seat - passenger;
        }
        else{
            System.out.println("Sorry seat not awailable");
        }
    }
    }

}


// Static Synchronization

class Bank implements Runnable{

    static int bal = 5000;
    static int withdraw;

    Bank(int withdraw){
        this.withdraw = withdraw;
    }

    public static synchronized void withdraw() {
        String name = Thread.currentThread().getName();
        if(withdraw<=bal){
            System.out.println(name+ " withdraw amount");
            bal = bal-withdraw;
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }

    @Override
    public void run() {
        withdraw();
    }

}