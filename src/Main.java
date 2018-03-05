import util.CachedThreadPool;
import util.ExecuteTaskCallable;

import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) {

        CachedThreadPool pool = CachedThreadPool.getInstance();
        pool.init();

        for(int i = 0; i < 10; i++){
//            pool.execute(new ExecuteTaskRunnable(i));
            Future<?> list = pool.submit(new ExecuteTaskCallable(i));
            try {
                System.out.println(list.get());
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        pool.shutdown();
    }
}
