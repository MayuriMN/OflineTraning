package offlineTraning;

//WAP to demonstrate how garbage collector work when any memory is not referenced by string object.

public class GarbageCollectorWork {

	   String st;

	public GarbageCollectorWork(String st) {
		super();
		// TODO Auto-generated constructor stub
		this.st=st;
	}

	   @Override
	    protected void finalize() throws Throwable {
	       
	        super.finalize();
	        System.out.println("Garbage collected");
	    }

	   
	   public static void main(String[] args) {
		
		   GarbageCollectorWork gcw = new GarbageCollectorWork("reference");
		   gcw = null;
	       System.gc();
	}
	
}
