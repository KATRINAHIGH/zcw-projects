package io.zipcoder;

public class MonkeyTypewriter {
    public static void main(String[] args) {
        String introduction = "It was the best of times,\n" +
                "it was the blurst of times,\n" +
                "it was the age of wisdom,\n" +
                "it was the age of foolishness,\n" +
                "it was the epoch of belief,\n" +
                "it was the epoch of incredulity,\n" +
                "it was the season of Light,\n" +
                "it was the season of Darkness,\n" +
                "it was the spring of hope,\n" +
                "it was the winter of despair,\n" +
                "we had everything before us,\n" +
                "we had nothing before us,\n" +
                "we were all going direct to Heaven,\n" +
                "we were all going direct the other way--\n" +
                "in short, the period was so far like the present period, that some of\n" +
                "its noisiest authorities insisted on its being received, for good or for\n" +
                "evil, in the superlative degree of comparison only.";

        // Do all of the Monkey / Thread building here
        // For each Copier(one safe and one unsafe), create and start 5 monkeys copying the introduction to
        // A Tale Of Two Cities.
        UnsafeCopier badMonkey = new UnsafeCopier(introduction);
       SafeCopier goodMonkey = new SafeCopier(introduction);

        Thread unsafeWorker1 = new Thread(badMonkey);
        Thread unsafeWorker2 = new Thread(badMonkey);
        Thread unsafeWorker3 = new Thread(badMonkey);
        Thread unsafeWorker4 = new Thread(badMonkey);
        Thread unsafeWorker5 = new Thread(badMonkey);
        Thread safeWorker1 = new Thread(goodMonkey);
        Thread safeWorker2 = new Thread(goodMonkey);
        Thread safeWorker3 = new Thread(goodMonkey);
        Thread safeWorker4 = new Thread(goodMonkey);
        Thread safeWorker5 = new Thread(goodMonkey);

        unsafeWorker1.start();
        unsafeWorker2.start();
        unsafeWorker3.start();
        unsafeWorker4.start();
        unsafeWorker5.start();
        safeWorker1.start();
        safeWorker2.start();
        safeWorker3.start();
        safeWorker4.start();
        safeWorker5.start();

        // This wait is here because main is still a thread and we want the main method to print the finished copies
        // after enough time has passed.
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            System.out.println("MAIN INTERRUPTED");
        }

        // Print out the copied versions here.
        System.out.println(badMonkey.copied);
        System.out.println("------------------------------------------------");
        System.out.println(goodMonkey.copied);
    }
}


/**
 * created 1 instance of unsafe copier and I pushed it to 5 different threads. Called start on each thread
 * what that does is everytime you tell a thread to start it dispatches to the background. Up until now
 * everything running sequentially on main. Now think of main thread  trunk of a tree and it branches
 * 5 times. What that means is that all those workers instead of running sequentially are going to run all at the same
 * time. In unsafe copier method this instance is called once...there is only one copy of this instance and it's
 * being called by 5 threads at the same time. Side effect of that is depending on the order in which the threads execute
 * you will never have any control over the output. Inside unsafe copier there's a race condition---more than one process
 * has access to the resource at the same time.

 */
