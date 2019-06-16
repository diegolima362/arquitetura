import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Login implements Serializable {
	private static final long serialVersionUID = 1L;
	private String nome;
	private String senha;
	
	public Login() {}
	public Login(String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
    public static void escrever(Login login, ArrayList<Login> logins) {
        FileOutputStream fos;
        ObjectOutputStream oos;
		try {
			fos = new FileOutputStream("\\bin\\logins.obj");
			oos = new ObjectOutputStream(fos);
			logins.add(login);
			oos.writeObject(logins);
			fos.close();
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}     
    }
    
    @SuppressWarnings("unchecked")
	public static ArrayList<Login> ler() {
    	ArrayList<Login> logins = new ArrayList<>();
    	FileInputStream fis;
    	ObjectInputStream ois;
    	
		try {
			fis = new FileInputStream("\\bin\\logins.obj");
			ois = new ObjectInputStream(fis);
			logins = (ArrayList<Login>)ois.readObject();
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
		return logins;
    }
}
