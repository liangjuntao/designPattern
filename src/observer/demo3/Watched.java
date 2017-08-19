package observer.demo3;

import java.util.Observable;

/**
 * 被观察者者
 * 也就是subjct主题对象
 * @author Administrator
 *
 */
public class Watched extends Observable{
    
    private String data = "";
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        
        if(!this.data.equals(data)){
            this.data = data;
            setChanged();
        }
        notifyObservers();
    }
    
    
}