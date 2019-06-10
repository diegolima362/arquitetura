import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    private static ObjectOutputStream output;
    private static ObjectInputStream input;
    private int codigo;
    private String nome;
    //private Endereco endereco;
    private int telefone;
    
    public Cliente() {}
    public Cliente(String nome, int codigo, /*Endereco endereco*/ int telefone) {
        this.nome = nome;
        this.codigo = codigo;
        //this.endereco = endereco;
        this.telefone = telefone;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
//    public Endereco getEndereco() {
//        return endereco;
//    }
//    public void setEndereco(Endereco endereco) {
//        this.endereco = endereco;
//    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        if (telefone > 0) {
            this.telefone = telefone;
        }
    }
    
    public static void escrever(Cliente cliente, ArrayList<Cliente> clientes) {
            FileOutputStream fos;
            ObjectOutputStream oos;
			try {
				fos = new FileOutputStream("./bin/clientes.obj");
				oos = new ObjectOutputStream(fos);
				clientes.add(cliente);
				oos.writeObject(clientes);
				fos.close();
				oos.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
           
            
    }
    
    @SuppressWarnings("unchecked")
	public static ArrayList<Cliente> ler() {
    	ArrayList<Cliente> c = new ArrayList<>();
    	FileInputStream fis;
    	ObjectInputStream ois;
    	
		try {
			fis = new FileInputStream("./bin/clientes.obj");
			ois = new ObjectInputStream(fis);
			c = (ArrayList<Cliente>)ois.readObject();
			fis.close();
			ois.close();
		} catch (EOFException e) {
			e.printStackTrace();
    	} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return c;
    }
    
    /*
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
	public static ArrayList<Cliente> ler() {
		abrirArquivoL();
		ArrayList<Cliente> clientes = lerArquivoL();
		fecharArquivoL();
		return clientes;
	}
    private static void abrirArquivoL() {
		try {
			input = new ObjectInputStream(Files.newInputStream(Paths.get("./bin/clientes.obj"), StandardOpenOption.READ));
		}
		catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}
    private static ArrayList<Cliente> lerArquivoL() {
    	ArrayList<Cliente> tmp = new ArrayList<>();
    	while (true) {
	    	try {
				tmp  = (ArrayList<Cliente>)input.readObject();
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
    	
    	return tmp;
	}
	private static void fecharArquivoL() {
		try {
			if (input != null)
				input.close();
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}*/
} 