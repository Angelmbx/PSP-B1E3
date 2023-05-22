/*
3. Realiza un programa servidor TCP que acepte 2 clientes. Mostrar para cada cliente conectados sus puertos local y remoto.
 Implementar también el programa cliente, donde se muestren los puertos locales y remotos a los que se encuentre conectado,
  asi como la IP de la máquina remota a la que se conecta.
 */

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {

        ServerSocket server = new ServerSocket(6000);
        System.out.println("SERVER set on PORT " + server.getLocalPort());

        Socket client1 = server.accept();
        System.out.println("SERVER providing client 1 LOCAL PORT: " + client1.getLocalPort());
        System.out.println("SERVER providing client 1 REMOTE PORT: " + client1.getPort());
        System.out.println("--------------------------------------------------");
        Socket client2 = server.accept();
        System.out.println("SERVER providing client 2 LOCAL PORT: " + client2.getLocalPort());
        System.out.println("SERVER providing client 2 REMOTE PORT:  " + client2.getPort());

        //close
        server.close();

    }
}