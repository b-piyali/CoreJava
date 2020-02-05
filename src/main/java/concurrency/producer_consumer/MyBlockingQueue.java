package concurrency.producer_consumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueue<E> {
    private Queue<E> queue;
    private final int maxSize;
    Lock lock = new ReentrantLock();
    private Condition notFull = lock.newCondition();
    private Condition notEmpty = lock.newCondition();

    public MyBlockingQueue(int maxSize) {
        this.queue = new LinkedList<>();
        this.maxSize = maxSize;
    }

    public void put(E e) throws InterruptedException {
        lock.lock();
        try {
            if(queue.size() == maxSize)
                notFull.await();
            queue.add(e);
            notEmpty.signalAll();
        }finally{
            lock.unlock();
        }
    }

    public E take() throws InterruptedException {
        lock.lock();
        try {
            if(queue.size() == 0)
                notEmpty.await();
            E item = queue.remove();
            notFull.signalAll();
            return item;
        }finally{
            lock.unlock();
        }
    }
}
