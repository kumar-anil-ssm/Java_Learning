package blockingQueue;

import java.util.concurrent.BlockingQueue;

public class OrderProducer implements Runnable {

	private BlockingQueue<String> queue;
	
	OrderProducer(BlockingQueue<String> queue){
		this.queue=queue;
	}
	
	

	@Override
	public void run() {

		try {
			queue.put("Mac Book");
			queue.put("Thik Pad");
			queue.put("iPhone");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
