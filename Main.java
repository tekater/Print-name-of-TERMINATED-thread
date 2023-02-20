public class Main {
    public static void main(String[] args) {
        Threader thread1 = new Threader();
        Thread thread0 = new Thread();
        Thread thread2 = new Thread();
        Thread thread3 = new Thread();
        Thread thread4 = new Thread();

        thread1.start();
        Thread[] threads = {
                thread0,thread1,thread2,thread3,thread4
        };

        ThreadUtil.printNameOfTerminatedThread(threads);
    }
}
