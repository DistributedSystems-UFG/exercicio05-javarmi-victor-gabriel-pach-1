package example.hello;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculadoraEspecial extends Remote {
    double raizQuadrada(double valor) throws RemoteException;
}