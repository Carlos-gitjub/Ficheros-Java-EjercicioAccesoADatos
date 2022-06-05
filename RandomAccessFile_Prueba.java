package default_package;

import java.io.IOException;
import java.io.RandomAccessFile;
public class RandomAccessFile_Prueba {
	public static void main(String[] args) {
		try {
			//Instanciamos la clase, creando el fichero binario y estableciendo permiso de lectura y escritura
			RandomAccessFile raf = new RandomAccessFile("/home/carlos/eclipse-workspace/fichero_binario2.ddr", "rw");

			//Escribimos dentro del fichero binario
			String texto = "Esto es una prueba de RandomAccessFile";
			byte[] texto_en_binario =  texto.getBytes();
			
			raf.write(texto_en_binario);

			
			//Leemos e imprimimos el fichero binario desde el byte 5
			raf.seek(5);
			int valor_byte = raf.read();
			while(valor_byte != -1) {
				System.out.print((char) valor_byte);
				valor_byte = raf.read();
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
