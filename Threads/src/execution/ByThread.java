package execution;

public class ByThread extends Thread {
@Override
public void run() {
	// TODO Auto-generated method stub
	super.run();
	for(int i =0; i<=5; i++) {
		System.out.println(i);
		try {
			ByThread.sleep(1000);  
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public static void main(String[] args) {
	ByThread b = new ByThread();
	b.start();
	
}
}
