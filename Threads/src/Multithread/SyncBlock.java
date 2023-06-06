package Multithread;
class Task{
	public static void task1() {
		for(int i =0; i<=5; i++) {
			System.out.println(i);
		}
	}
	public static void task2() {
		for(int i =0; i<=5; i++) {
			System.out.println(i);
		}
	}
}
class Thread1 extends Thread{
	Task t;
	Thread1(Task t){
		this.t=t;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Task.task1();
	}
}
class Thread2 extends Thread{
	Task t;
	Thread2(Task t){
		this.t=t;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Task.task2();
	}
}
public class SyncBlock {
public static void main(String[] args) {
	Task t = new Task();
	Thread1 t1 = new Thread1(t);
	t1.start();
	Thread2 t2 = new Thread2(t);
	t2.start();
	
	
}
}
