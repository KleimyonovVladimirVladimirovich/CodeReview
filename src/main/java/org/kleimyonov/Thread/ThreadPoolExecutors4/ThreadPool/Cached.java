package Thread.ThreadPoolExecutors4.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;

public class Cached {
    public static void main(String[] args) {
        ExecutorService myExecute = Executors.newCachedThreadPool();
//ДИНАМИЧЕСКИ СОЗДАЕТ ПОТОКИ ПО МЕРЕ НЕОБХОДИМОСТИ (ОЧЕНЬ МНОГО РЕСУРСОВ ХАВАЕТ)
        //В ПРИНЦИПЕ ПОХОЖ НА SINGLE, ТАК КАК ТОЖЕ ВЫВОДИТ ПО ОЧЕРЕДИ, НО ТУРБО БЫСТРО
        Runnable r = () -> {
            System.out.println(Thread.currentThread().getName() + " " + (Long.MAX_VALUE % Long.MIN_VALUE));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        for (int i = 0; i < 50; i++) {
            myExecute.submit(r);
        }
        myExecute.shutdown();


    }
}
