import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.NoSuchElementException;

public class EscreverCliente {
    private static ObjectOutputStream output;
    
	public static void escrever(Cliente cliente) {
    	abrirArquivoE();
    	adicionarE(cliente);
    	fecharArquivoE();
    	
    }
    private static void abrirArquivoE() {
		try {
			output = new ObjectOutputStream(Files.newOutputStream(Paths.get("./bin/clientes.obj"), StandardOpenOption.CREATE,StandardOpenOption.APPEND));
		}
		catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}
    private static void adicionarE(Cliente cliente) {
		try {
			output.reset();
			output.writeObject(cliente);
		}
		catch (NoSuchElementException elementException) {
			elementException.printStackTrace();
		}
		catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}
	private static void fecharArquivoE() {
		try {
			if (output != null)
				output.close();
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}
}
