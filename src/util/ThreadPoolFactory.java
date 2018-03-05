package util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Yuwei on 2018/3/2.
 */
public class ThreadPoolFactory {
    private static final ThreadPoolFactory factory = new ThreadPoolFactory();

    private ExecutorService exec;

    public ThreadPoolFactory() {

    }

    public static ThreadPoolFactory getInstance(){
        return factory;
    }

    // 可缓存线程池
    public static ExecutorService createCachedThreadPool(){
        return Executors.newCachedThreadPool();
    }

    // 固定数量线程池
    public static ExecutorService createFixedThreadPool(int count){
        return Executors.newFixedThreadPool(count);
    }

}
