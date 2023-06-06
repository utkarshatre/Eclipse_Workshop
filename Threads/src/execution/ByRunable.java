package execution;

public class ByRunable implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println(i);

			try {
				ByRunable.sleep(1000);
			}
			catch(InterruptedException s) {
				s.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		ByRunable by = new ByRunable();

		Thread t = new Thread(by);
		t.start();
	}
}