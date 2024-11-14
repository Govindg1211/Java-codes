
class A extends Thread {

    public void run() {
        System.out.println("Thread A started...");

    }
}

class B extends Thread {

    public void run() {
        System.out.println("Thread B started...");

    }
}

class C implements Runnable {

    public void run() {
        System.out.println("Thread C started...");
    }
}

class threads {

    public static void main(String[] args) {
        A t1 = new A();
        B t2 = new B();
        C obj = new C();
        Thread t3 = new Thread(obj);

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Exit from main");
    }
}
