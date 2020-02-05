package concurrency.producer_consumer;

import java.util.stream.IntStream;

public class ProducerConsumerMain {
    public static void main(String[] args) throws InterruptedException {
        MyBlockingQueue<Integer> queue = new MyBlockingQueue<>(10);
        Thread producer = new Thread(() -> {
            IntStream.range(1, 100).forEach(i -> {
                try {
                    queue.put(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i < 100; i++) {
                try {
                    System.out.println(queue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        consumer.start();

        Thread.sleep(1000L);

        producer.start();
        producer.join();
        consumer.join();
    }
}

