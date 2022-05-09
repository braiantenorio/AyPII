package net.datastructures;

public class test {
	private static Deque<String> dq1 = new ArrayCircularDeque<String>(6);
    private static Deque<String> dq2 = new ArrayCircularDeque<String>(6);


    public static void main(String[] args) {
       
        dq2.addFirst("Pedro");
		dq2.addFirst("Juan");
		dq2.addFirst("Ana");
		dq2.addFirst("Pablo");
		dq2.addFirst("Maria");
		dq2.addFirst("Jorge");
		dq2.addFirst("Analia");
        System.out.println(dq2.size());
	}


        
    }

