import java.util.ArrayList;

public class TesteCliente {
    public static void main(String[] args) {
        Cliente.escrever(new Cliente("Gabriel", 123, new Endereco(), 12345678));
        Cliente.escrever(new Cliente("Maria", 124, new Endereco(), 1234567889));
        Cliente.escrever(new Cliente("Carlos", 125, new Endereco(), 1234567890));
        Cliente.escrever(new Cliente("Pedro", 126, new Endereco(), 1234567890));
        
        System.out.println("Ok");
        ArrayList<Cliente> clientes = Cliente.ler();
		
    }
}
