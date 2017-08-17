package future.demo1;

public class RealData implements Data {

	protected final String result;

	public RealData(String s) {
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < 10; i++) {
			sb.append(s);
			try {
				// 模拟构造时间比较长
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}

		System.out.println("--->真实数据已经生产完毕");
		result = sb.toString();
	}
	
	@Override
	public String getResult() {
		return result;
	}
}
