package future.demo1;

public class Client {
    public Data request(final String queryStr){
        //返回伪数据
        final FutureData futureData = new FutureData();
        //开启线程构造真实数据
        new Thread(){
            public void run(){
            	System.out.println("--->将要去获取真实数据");
                RealData realData = new RealData(queryStr);
                futureData.setResult(realData);
            }
        }.start();
        //返回伪数据，等待真实数据加载
        System.out.println("--->返回假数据");
        return futureData;
    }
}