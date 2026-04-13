package example.hello;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class CalculadoraEspecialImplem extends UnicastRemoteObject implements CalculadoraEspecial {

    public CalculadoraEspecialImplem(int port) throws RemoteException {
        super(port);
    }

    public double raizQuadrada(double valor) throws RemoteException {
        return Math.sqrt(valor);
    }
}