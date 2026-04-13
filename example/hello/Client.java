package example.hello;

import java.rmi.Naming;

public class Client {
    public static void main(String args[]) {
        String host = (args.length < 1) ? "localhost" : args[0];
        try {
            // Chamando o serviço original "Hello" com novas funções
            Hello stubHello = (Hello) Naming.lookup("rmi://" + host + "/MyHello");
            System.out.println("Soma (10+5): " + stubHello.soma(10, 5));
            System.out.println("Subtração (10-5): " + stubHello.subtrai(10, 5));
            System.out.println("Multiplicação (10*10): " + stubHello.multiplica(10, 10));

            // Chamando o novo serviço "CalculadoraEspecial"
            CalculadoraEspecial stubCalc = (CalculadoraEspecial) Naming.lookup("rmi://" + host + "/CalculadoraEspecial");
            System.out.println("Raiz Quadrada de 49: " + stubCalc.raizQuadrada(49.0));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}