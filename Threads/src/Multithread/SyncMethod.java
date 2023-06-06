package Multithread;
class Task{
	synchronized  public static  void task1() {
		for(int i =0; i<=5; i++) {
			System.out.println(i);
		}
	}
	synchronized public static void task2() {
		for(int i =0;i<=5;i++) {
			System.out.println(i);
		}
	}
}
class Thread1 extends Thread{
	Task mt;
	Thread1(Task mt){
		this.mt=mt;
	}
	@Override
	public void run() {
      Task.task1();
	}
}
class Thread2 extends Thread{
 Task mt;
	public Thread2(Task mt){
		this.mt=mt;
	}
	@Override
	public void run() {
	Task.task2();
	}
}
public class SyncMethod {
	public static void main(String[] args) {
		Task mt = new Task();
		Thread1 t1 = new Thread1(mt);
		t1.start();
		Thread2 t2 = new Thread2(mt);
		t2.start();
		
		
	}
}
