public class TesteCliente {
    public static void main(String[] args) {
        Cliente.escrever(new Cliente("Gabriel", 123, 12345678));
        Cliente.escrever(new Cliente("Maria", 124, 1234567889));
        Cliente.escrever(new Cliente("Carlos", 125, 1234567890));
        Cliente.escrever(new Cliente("Pedro", 126, 1234567890));
        
        Cliente.ler();
    }
}
