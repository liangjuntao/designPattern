package future.demo1;

public class TestMain {
	public static void main(String[] args) {
		
		//客户端发送请求取获取数据
		Data data = new Client().request("123456");
		//这个data立即返回
		System.out.println("--->立即返回的假数据"+data);
		//在实际获取数据的时候才返回了
		System.out.println("--->获取的真实数据"+data.getResult());
	}
}
