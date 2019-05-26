import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Login implements Serializable {
	private String nome;
	private String senha;
	
	public Login(String nome, String senha) throws FileNotFoundException, IOException {
		setNome(nome);
		setSenha(senha);
		gravarLogin();
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
	
	public void gravarLogin() throws FileNotFoundException, IOException {
		File arquivo = new File("login.txt");
		ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(arquivo));
		obj.writeObject(this);
		obj.close();
	}
	
	public Login lerLogin() throws FileNotFoundException, IOException, ClassNotFoundException {
		File arquivo = new File("login.txt");
		ObjectInputStream obj = new ObjectInputStream(new FileInputStream(arquivo));
		Login log = (Login)obj.readObject();
		obj.close();
		
		return log;
	}
	
	public void alterarSenha() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a senha atual: ");
		String senha = teclado.nextLine();
		String novaSenha;
		
		if (this.senha == senha) {
			while (true) {
				System.out.print("Digite a nova senha: ");
				novaSenha = teclado.nextLine();
				System.out.print("Comfirme a nova senha: ");
				if (novaSenha == teclado.nextLine()) {
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
