public class Threader extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(20L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\nFINISHED");
    }
}
