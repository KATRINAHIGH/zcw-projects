package io.zipcoder;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/**
 * Make this extend the Copier like `UnsafeCopier`, except use locks to make sure that the actual intro gets printed
 * correctly every time.  Make the run method thread safe.
 */
public class SafeCopier extends Copier {
    // stole this from here: http://www.baeldung.com/java-concurrent-locks
    ReadWriteLock lock = new ReentrantReadWriteLock();
    Lock writeLock = lock.writeLock();

    public SafeCopier(String toCopy) {
        super(toCopy);
    }

    public void run() {
        try {
            while (this.stringIterator.hasNext()) {
                writeLock.lock();
                this.copied += stringIterator.next() + " ";// + Thread.currentThread().getName();
                writeLock.unlock();
                Thread.sleep(10L);
            }
        }
        catch (NoSuchElementException ex) {
            this.copied += "FAIL ";
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


/**there's a variety of locks
 * readwrite lock -- once you have the lock no else can read or write to it
 * read lock -- uncommon if you have lock no can read it but can write to it
 * write lock -most common if you have the lock you can't write to it but you can read it
 * Want to keep locks locked as little as possible so program doesn't bog down. So put
 * writeLock near the thing I want to protect. Once create lock the next thread that comes through and tries to
 * grab the lock it can't so that thread stops and its halted. Once it unlocked all the threads fight for the lock.
 * fight===> a whole bunch of memory shit I don't understand is working under the hood to control the thread scheduling.
 *Also its up to the operating system, it s the operating system that gives you threads. This program could function
 * differently on different computers.
 * Once the thread is unlocked it goes to sleep for 10 milliseconds...the reason for that is that the same thread
 * doesn't take the lock multiple times in row. Sort of like the guy who butts in line repeatedly at the buffet.
 * YOu have to catch the interupted exception if you put a thread to sleep...the ide forces you to do it
 * Had to add the interrupted exception in case.
 *
 * Replace this above the unlock  to get visibility into what threads are accessing the program
 *  this.copied += Thread.currentThread().getName() + " ";
 */

