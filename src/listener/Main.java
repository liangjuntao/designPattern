package listener;

public class Main {
	public static void main(String[] args) {  
        EventSourceObject object = new EventSourceObject();  
        //注册监听器  
        object.addCusListener(new CusEventListener(){  
//            @Override  
//            public void fireCusEvent(EventSourceObject e) {  
//                super.fireCusEvent(e);  
//            }  
        });  
        //触发事件  
        object.setName("eric");  
    }  
}
