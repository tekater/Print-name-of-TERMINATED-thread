public class ThreadUtil extends Threader{

static void printNameOfTerminatedThread(Thread[] threads) {

    for (int i = 0; i < threads.length; i++) {

        if ("NEW".equals(threads[i].getState().toString())){
            threads[i].start();

            System.out.println(threads[i].getName() + ": " +  threads[i].getState());

        }

        if ("TERMINATED".equalsIgnoreCase(threads[i].getState().toString())) {

            System.out.println("\n" + threads[i].getName() + ": " +  threads[i].getState());

        }
    }

    }
}

