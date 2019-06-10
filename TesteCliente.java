import java.util.ArrayList;

public class TesteCliente {
    public static void main(String[] args) {
    	ArrayList<Cliente> clientes = new ArrayList<>();
        Cliente.escrever(new Cliente("Gabriel", 123, 12345678), Cliente.ler());
        Cliente.escrever(new Cliente("Maria", 124, 1234567889), Cliente.ler());
        Cliente.escrever(new Cliente("Carlos", 125, 1234567890), Cliente.ler());
        Cliente.escrever(new Cliente("Pedro", 126, 1234567890), Cliente.ler());
        
        clientes = Cliente.ler();
        for (Cliente cliente : clientes) {
        	System.out.printf("Nome: %s\n", cliente.getNome());
        }
    }
}
