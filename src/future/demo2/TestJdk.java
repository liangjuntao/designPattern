package future.demo2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
/**
 * Data接口和FutureData就不需要了，JDK帮我们实现了。
 */
public class TestJdk {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// 执行FutureTask，相当于上例中的client.request("name")发送请求
		FutureTask<String> futureTask = new FutureTask<String>(new RealDataJdk("name"));
		ExecutorService executor = Executors.newFixedThreadPool(1); // 使用线程池
		System.out.println("1--->"+futureTask.isDone());
		executor.submit(futureTask);

		// 这里可以用一个sleep代替对其他业务逻辑的处理
		// 在处理这些业务逻辑过程中，RealData也正在创建，从而充分了利用等待时间
		System.out.println("数据:" + futureTask.get());
		System.out.println("2--->"+futureTask.isDone());
		Thread.sleep(2000);

		// 使用真实数据
		// 如果call()没有执行完成依然会等待
		System.out.println("3--->"+futureTask.isDone());
		System.out.println("数据:" + futureTask.get());
	}
}
