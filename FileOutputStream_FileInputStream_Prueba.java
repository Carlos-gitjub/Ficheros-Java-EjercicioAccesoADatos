package default_package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_FileInputStream_Prueba {
	public static void main(String[] args) {
			try {
				//Escribimos en fichero binario
				FileOutputStream fos = new FileOutputStream("/home/carlos/eclipse-workspace/fichero_binario.ddr");
				String texto = "Esto es una prueba de FileOutputStream";
				byte[] texto_en_binario = texto.getBytes();

				fos.write(texto_en_binario);
       			fos.close(); //cerramos stream

       			//Leemos el fichero binario e imprimimos el contenido
				FileInputStream fis = new FileInputStream("/home/carlos/eclipse-workspace/fichero_binario.ddr");

       			System.out.println("Contenido del fichero:");
       			int valor = fis.read();
    			while(valor!=-1){
    			    System.out.print((char)valor);
    			    valor=fis.read();
    			}
    			fis.close(); //cerramos stream

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}
}
