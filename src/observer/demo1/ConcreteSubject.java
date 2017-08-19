package observer.demo1;

public class ConcreteSubject extends Subject {

	private String state = "旧状态";
	

	public String getState() {
		return state;
	}

	public void change(String newState) {
		System.out.println("更改之前的状态是：" + state);
		state = newState;
		System.out.println("更改之后的的状态是：" + state);
		// 状态发生改变，通知各个观察者
		this.nodifyObservers(state);
	}
}