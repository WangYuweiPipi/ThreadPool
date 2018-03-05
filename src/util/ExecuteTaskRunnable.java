package util;

/**
 * Created by Yuwei on 2018/3/5.
 */
public class ExecuteTaskRunnable implements Runnable {

    private int i;

    public ExecuteTaskRunnable(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+","+i+",执行中……");
    }
}
