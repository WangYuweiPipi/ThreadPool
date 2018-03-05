package util;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Yuwei on 2018/3/2.
 */
public class CachedThreadPool {

    private static CachedThreadPool pool = new CachedThreadPool();
    private ExecutorService exec;

    public static CachedThreadPool getInstance(){
        return pool;
    }

    // 初始化
    public void init(){
        exec = Executors.newCachedThreadPool();
    }

    // 初始化
    /*public CachedThreadPool() {
        exec = ThreadPoolFactory.getInstance().createCachedThreadPool();
    }*/

    // 添加线程，无返回值
    public void execute(Runnable task){
        exec.execute(task);
    }

    // 添加线程，有返回值
    public Future<?> submit(Callable<?> task){
        return exec.submit(task);
    }

    // 关闭线程
    public void shutdown(){
        exec.shutdown();
    }
}
