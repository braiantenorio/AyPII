package test;

import empleado.Empleado;
import empleado.EmpleadoAsalariado;
import empleado.EmpleadoBaseMasComision;
import empleado.EmpleadoPorComision;
import empleado.EmpleadoPorHora;

public class TestEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado emp[] = new Empleado[4];

		emp[0] = new EmpleadoAsalariado("Juan", "11111111", 25000);
		emp[1] = new EmpleadoPorHora("Pedro", "22222222", 150, 100);
		emp[2] = new EmpleadoPorComision("Ana", "33333333", 450000, 10);
		emp[3] = new EmpleadoBaseMasComision("Maria", "44444444", 350000, 10, 15000);

		for (int i = 0; i<emp.length; i++)
			System.out.println(emp[i]+" Salario: " + emp[i].salario());
	
		/*
		for (Empleado e:emp)
			System.out.println(e);
			*/
	}

}
