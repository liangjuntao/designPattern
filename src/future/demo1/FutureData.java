package future.demo1;

public class FutureData implements Data {

	protected RealData realData = null;

	protected boolean isReady = false;

	// 进行同步控制
	public synchronized void setResult(RealData realData) {
		if (isReady) {
			return;
		}
		System.out.println("--->正在去获取真正的数据");
		this.realData = realData;
		isReady = true;
		System.out.println("--->真实数据准备完毕，唤醒阻塞线程");
		notifyAll();

	}

	// 实际调用返回RealDate的数据
	@Override
	public synchronized String getResult() {
		while (!isReady) {
			try {
				System.out.println("--->真实数据没有准备好，我要进入阻塞状态了");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("--->拿到真实数据，开始返回");
		return realData.result;
	}

}
