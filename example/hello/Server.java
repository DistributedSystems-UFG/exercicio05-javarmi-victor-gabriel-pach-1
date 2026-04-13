package example.hello;

import java.rmi.Naming;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server{
    public Server() {}

    public static void main(String args[]) {
    try {
        LocateRegistry.createRegistry(Registry.REGISTRY_PORT);

        // Serviço 1
        HelloImplem objHello = new HelloImplem(5678);
        Naming.rebind("MyHello", objHello);

        // Serviço 2 (Novo Servidor/Serviço)
        CalculadoraEspecialImplem objCalc = new CalculadoraEspecialImplem(5679);
        Naming.rebind("CalculadoraEspecial", objCalc);

        System.err.println("Servidores prontos (Hello e Calculadora)");
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}


