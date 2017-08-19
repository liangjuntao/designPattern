package observer.demo2;

/**
 * 推模型的观察者模式
 * 主题对象通过nodifyObservers方法主动的把数据推给观察者
 * 这里只是把状态给传递过来了
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		// 创建主题对象
		ConcreteSubject subject = new ConcreteSubject();
		// 创建观察者对象
		Observer observer = new ConcreteObserver();
		// 将观察者对象登记到主题对象上
		subject.attach(observer);
		// 改变主题对象的状态
		subject.change("new state");
	}
}