public class Practicum8 {

    static class BankingTask extends Thread {

        String taskName;

        BankingTask(String taskName) {
            this.taskName = taskName;
        }

        public void run() {

            for (int i = 1; i <= 3; i++) 
{
                System.out.println(taskName + " - Transaction " + i);
                try {
                    Thread.sleep(500);
                }
                catch (InterruptedException e) 
   {
                    System.out.println(taskName + " interrupted");
                    return;
                }
            }

            System.out.println(taskName + " completed");
        }
    }

    public static void main(String[] args)
            throws InterruptedException {

        BankingTask t1 =
            new BankingTask("ATM");

        BankingTask t2 =
            new BankingTask("Mobile Banking");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(
            "All banking transactions completed"
        );
    }
}
