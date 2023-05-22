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

        System.out.println("CLIENT providing LOCAL PORT: " + client.getLocalPort());
        System.out.println("CLIENT providing REMOTE PORT: " + client.getPort());
        System.out.println("CLIENT providing REMOTE IP: " + i.getHostAddress());

        //Close
        client.close();
    }
}
