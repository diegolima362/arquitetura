import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Login implements Serializable {
	private String nome;
	private String senha;
	
	public Login(String nome, String senha) throws FileNotFoundException, IOException {
		setNome(nome);
		setSenha(senha);
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
	
	public boolean ehLogin(Login login) {
		
		if ((this.getNome().compareTo(login.getNome()) == 0) &&
				(this.getSenha().compareTo(login.getSenha()) == 0))
		{
			return true;
		}
		
		return false;
	}
	
	public static void gravarLogin(Login login) throws FileNotFoundException, IOException {
		File arquivo = new File("login.txt");
		ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(arquivo));
		obj.writeObject(login);
		obj.close();
	}
	
	public static Login lerLogin() throws ClassNotFoundException, IOException {
		FileInputStream  arquivo = new FileInputStream ("login.txt");
		ObjectInputStream obj = new ObjectInputStream(arquivo);
		Login log = (Login) obj.readObject();
		
		return log;
		
		/*
		boolean cont = true;
 		ArrayList<Login> objectsList = new ArrayList<Login>();boolean cont = true;
		try{
			ObjectInputStream obj = new ObjectInputStream(arquivo);
		   while(cont){
		      log = (Login)obj.readObject();
		      if(log != null)
		         objectsList.add(log);
		      else
		         cont = false;
		   }
		   
		   obj.close();
		}catch(Exception e){
		   //System.out.println(e.printStackTrace());
		}
		
		for (Login l: objectsList) {
			System.out.println(l.getNome());
			System.out.println(l.getSenha());
		} */
	}
	
	public void alterarSenha() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a senha atual: ");
		String senha = teclado.nextLine();
		String novaSenha;
		
		if (this.senha.compareTo(senha) == 0) {
			while (true) {
				System.out.print("Digite a nova senha: ");
				novaSenha = teclado.nextLine();
				System.out.print("Comfirme a nova senha: ");
				if (novaSenha.compareTo(teclado.nextLine()) == 0) {
					setSenha(novaSenha);
					break;
				}
				else {
					System.out.println("Senha inválida");
				}
			}
		}
		else {
			System.out.println("Senha inválida");
		}
		
		teclado.close();
	}
}
