package Conjuntos;

import java.util.Arrays;

public class Conjunto {
	private int j=100;
	private boolean a[];
	
	public Conjunto() {
		a = new boolean[j];
		Arrays.fill(this.a, Boolean.FALSE);
	}
	
	
	

	public boolean[] getA() {
		return a;
	}

	public void setA(boolean[] a) {
		this.a = a;
	}
	
	public void insertarElemento(int n) {
		this.a[n]=true;
		
	}
	
	public void eliminarElemento(int n) {
		this.a[n]=false;
	}
	
	public void aStingConjunto() {
		//int[] f = new int [j];
		for(int i=0; i<j; i++) {
			if (this.a[i]== true) {
				System.out.print(i+ " ");//f[i]= i;
			}
		}
		//System.out.println(Arrays.toString(f));
	}
	
	/*public void esIgualA(Conjunto b) {
		//b[1]=5;
		
		boolean k = Arrays.deepEquals(b, this.a);
		System.out.println(k);
		
	}*/
}