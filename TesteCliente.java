import java.util.ArrayList;

public class TesteCliente {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		ArrayList<Cliente> clientes = null;
		
		cliente.setNome("Gabriel");
		Cliente.escrever(cliente);
		
		clientes = Cliente.ler();
		
		for (Cliente c: clientes) {
			System.out.printf("Cliente: %s\n", c.getNome());
		}
		
		
	}
}
