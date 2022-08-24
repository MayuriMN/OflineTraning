package offlineTraning;

//WAP to demonstrate which is fast in processing StringBuilder or StringBuffer

public class StringBuilderNBuffer {

	public static void main(String[] agrs) {
        StringBuffer sb = new StringBuffer("Hi");
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 10000; i++) {
            sb.append(new StringBuffer("World"));
        }
        long end = System.currentTimeMillis();
        long runningTime = end - start;
        System.out.println("Running Time required by String buffer " + runningTime);



       
        long start2 = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Hi");
        for (int j = 0; j <= 10000; j++) {
            sb2.append(new StringBuffer("World"));
        }
        long end2 = System.currentTimeMillis();
        long runningTime2 = end2 - start2;
        System.out.println("Running Time required by String builder " + runningTime2);
	}
	
}
