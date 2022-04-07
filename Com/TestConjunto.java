package Com;

//import java.util.Arrays;

public class TestConjunto {

	public static void main(String[] args) {
		Conjunto c1= new Conjunto();
		Conjunto c2= new Conjunto();
		/*boolean [] z= new boolean[4];
		System.out.print(Arrays.toString(z));
		*/
		c1.insertarElemento(3);
		c1.insertarElemento(90);
		c1.insertarElemento(33);
		c1.insertarElemento(56);
		c1.eliminarElemento(33);
		
		c2.insertarElemento(3);
		c2.insertarElemento(90);
		
		c1.aStingConjunto();
		c2.aStingConjunto();
		c1.insertarElemento(18);

		


		
	}

}