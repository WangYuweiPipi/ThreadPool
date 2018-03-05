package util;

import java.util.concurrent.Callable;

/**
 * Created by Yuwei on 2018/3/2.
 */
public class ExecuteTaskCallable implements Callable{

    private int i;

    public ExecuteTaskCallable(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName()+","+i+",执行中……");
        return "ok";
    }
}
