public class BetterConcurrency {

    public static int x = 0;

    public static final int NUM_TIMES = 100000;
    
    public static void main(String[] args) {

	final Object ref = new Object();
	
	Thread t1 = new Thread(() -> {
		for (int j = 0; j < NUM_TIMES; j++) {
		    synchronized(ref) {
			x++;
		    }
		}
	    });	    
	Thread t2 = new Thread(() -> {
		for (int j = 0; j < NUM_TIMES; j++) {
		    synchronized(ref) {
			x--;
		    }
		}
	    });

	// Start off both threads
	t1.start();
	t2.start();
	
	// Wait for both to finish

	try {
	    t1.join();
	    t2.join();
	} catch (InterruptedException iex) { }

	// Print out final result - we have done x++ 10000 times
	// and x-- 100 times
	
	System.out.println("x is now " + x);
				   
    }
}
