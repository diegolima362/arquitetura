import office.Endereco;
import office.Cliente;
import java.util.ArrayList;

public class TesteCliente {
    public static void main(String[] args) {
    	ArrayList<Cliente> clientes = new ArrayList<>();
        Cliente.escrever(new Cliente("Gabriel", 123, new Endereco(), 12345678), Cliente.ler());
        Cliente.escrever(new Cliente("Maria", 124, new Endereco(), 1234567889), Cliente.ler());
        Cliente.escrever(new Cliente("Carlos", 125, new Endereco(), 1234567890), Cliente.ler());
        Cliente.escrever(new Cliente("Pedro", 126, new Endereco(), 1234567890), Cliente.ler());
        
        clientes = Cliente.ler();
        for (Cliente cliente : clientes) {
        	System.out.printf("Nome: %s\n", cliente.getNome());
        }
    }
}
