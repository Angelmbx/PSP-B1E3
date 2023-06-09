/*
3. Realiza un programa servidor TCP que acepte 2 clientes. Mostrar para cada cliente conectados sus puertos local y remoto.
 Implementar también el programa cliente, donde se muestren los puertos locales y remotos a los que se encuentre conectado,
  asi como la IP de la máquina remota a la que se conecta.
 */

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {
        //Stablishing client conection
        Socket client = new Socket("localhost", 6000);

        //Need this to get Remote properties
        InetAddress i = client.getInetAddress();

        System.out.println("CLIENT1 providing LOCAL PORT: " + client.getLocalPort());
        System.out.println("CLIENT1 providing REMOTE PORT: " + client.getPort());
        System.out.println("CLIENT1 providing REMOTE IP: " + i.getHostAddress());

        //Close
        client.close();

        System.out.println("-----------------------------------------");

        //Client2
        Socket client2 = new Socket("localhost", 6000);

        InetAddress j = client2.getInetAddress();

        System.out.println("CLIENT2 providing LOCAL PORT: " + client2.getLocalPort());
        System.out.println("CLIENT2 providing REMOTE PORT: " + client2.getPort());
        System.out.println("CLIENT2 providing REMOTE IP: " + j.getHostAddress());

        //Close
        client2.close();

    }
}
