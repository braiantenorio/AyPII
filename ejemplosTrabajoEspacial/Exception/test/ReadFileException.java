package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadFileException {

	public static void main(String[] args) throws FileNotFoundException {

		System.out.print("Ingrese el nombre del archivo con su extensión: ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		File file = new File(name);
		Scanner read = null;
		try {
			read = new Scanner(file);

		} catch (FileNotFoundException e) {
			System.out.printf("Error archivo %s no encontrado!", name);
			return;
		}
		read.useDelimiter("\\s*;\\s*");
		String title = null;
		String category;
		String runningTime;
		int year;
		double price = 0;

		try {
			while (read.hasNext()) {
				title = read.next();
				category = read.next();
				runningTime = read.next();
				year = read.nextInt();
				price = validPrice(read.nextDouble());
				System.out.println(title + " " + category + " " + runningTime
						+ " " + year + " " + price); // just for debugging

			}
		} catch (InputMismatchException e) {
			System.out.printf("Error archivo %s con formato inválido.", name);		
		} catch (BadPriceException e) {
			System.out.printf("Revisar el precio de %s.", title);
		} finally {
			read.close();
		}
		input.close();
		
	}

	private static double validPrice(double p) throws BadPriceException {
		if (p < 0)
			throw new BadPriceException();
		return p;
	}

}
