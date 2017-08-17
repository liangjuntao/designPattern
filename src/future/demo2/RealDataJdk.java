package future.demo2;

import java.util.concurrent.Callable;

public class RealDataJdk implements Callable<String> {
    protected String data;

    public RealDataJdk(String data) {
        this.data = data;
    }

    @Override
    public String call() throws Exception {
        // 利用sleep方法来表示真是业务是非常缓慢的
        try {
            System.out.println("RealData生成中...");
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        return data + "-RealData";
    }
}
