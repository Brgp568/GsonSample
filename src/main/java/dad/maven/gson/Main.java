package dad.maven.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese el nombre: ");
		String nombre = scanner.nextLine();

		System.out.print("Ingrese los apellidos: ");
		String apellidos = scanner.nextLine();

		System.out.print("Ingrese la edad: ");
		int edad = scanner.nextInt();

		Persona p = new Persona();
		p.setNombre(nombre);
		p.setApellidos(apellidos);
		p.setEdad(edad);

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);

		System.out.println(json);

	}

}
