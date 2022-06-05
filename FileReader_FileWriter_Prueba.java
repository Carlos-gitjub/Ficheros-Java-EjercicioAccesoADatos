package default_package;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader_FileWriter_Prueba {
	public static void main(String[] args) {
		try {
			//Escribimos en fichero
			FileWriter fw = new FileWriter("/home/carlos/eclipse-workspace/fichero1.txt");
			System.out.println("Fichero creado!!");
			fw.write("Esto es una prueba de la clase FileWriter");
			fw.close(); //cerramos stream
			
			//Leemos el fichero y lo imprimimos por pantalla
			FileReader fr = new FileReader("/home/carlos/eclipse-workspace/fichero1.txt");
			System.out.println("Contenido de fichero:");
			int valor = fr.read();
			while(valor!=-1){
			    System.out.print((char)valor);
			    valor=fr.read();
			}
			fr.close(); //cerramos stream

			
		}catch(IOException e) {
			System.out.print("Error E/S: "+ e);
		}
	}
}
