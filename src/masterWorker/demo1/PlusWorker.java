package masterWorker.demo1;

public class PlusWorker extends Worker {  
	  
    @Override  
    public Object handle(Object input) {  
          
        Integer i =(Integer)input;  
        System.out.println("当前值是"+i+",结果是"+i*i*i +","+ Thread.currentThread().hashCode());
        return i*i*i;  
    }  
  
      
} 