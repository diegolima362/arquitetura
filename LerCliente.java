import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LerCliente {
	private static ObjectInputStream input;
	
	public static void ler() {
		abrirArquivoL();
		lerArquivoL();
		fecharArquivoL();
	}
    private static void abrirArquivoL() {
		try {
			input = new ObjectInputStream(Files.newInputStream(Paths.get("./bin/clientes.obj")));
		}
		catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}
    private static void lerArquivoL() {
    	while (true) {
	    	try {
			
				Cliente cliente = (Cliente) input.readObject();
				System.out.printf("Nome: %s\n", cliente.getNome());
				System.out.printf("Código: %d\n", cliente.getCodigo());
				System.out.printf("Telefone: %d\n", cliente.getTelefone());
	    	}
	    	catch (EOFException endOfFileException) {
	    		endOfFileException.printStackTrace();
	    	}
	    	catch (ClassNotFoundException classNotFoundException) {
	    		classNotFoundException.printStackTrace();
	    	}
	    	catch (IOException ioException) {
	    		ioException.printStackTrace();
	    		break;
	    	}
    	}
	}
	private static void fecharArquivoL() {
		try {
			if (input != null)
				input.close();
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}
}
