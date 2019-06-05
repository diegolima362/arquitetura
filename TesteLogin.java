import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class TesteLogin {
	public static void main (String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		Login login = new Login("adimin", "admin");
		Scanner teclado = new Scanner(System.in);
		System.out.printf("O nome é %s\n", login.getNome());
		System.out.printf("A senha é %s\n", login.getSenha());
		
		System.out.printf("Alterando a senha\n");
		login.alterarSenha();
		Login.escreverLogin(login);
		
		Login login2 = Login.lerLogin();
		
		System.out.printf("O nome é: %s\n", login2.getNome());
		System.out.printf("A senha é: %s\n", login2.getSenha());
		teclado.close();
	}
}
