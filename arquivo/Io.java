package arquivo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public abstract class Io {	
	public static void escrever(Object object, String path) throws FileNotFoundException, IOException {
		File arquivo = new File(path);
		ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(arquivo, true));
		obj.writeObject(object);
		obj.close();	
	}

	public static ArrayList<Object> ler(String path) {
		FileInputStream arquivo = null;
		try {
			arquivo = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		ArrayList<Object> objects = new ArrayList<Object>();
		Object object = null;
		boolean cont = true;
		
		try {
			ObjectInputStream obj = new ObjectInputStream(arquivo);
			while (cont) {
				object = obj.readObject();
				if (object != null)
					objects.add(object);
				else
					cont = false;
		   }
		   obj.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return objects;
	}
	
	
}