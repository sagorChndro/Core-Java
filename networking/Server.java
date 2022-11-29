package networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public Server() {
		try {
			ServerSocket server = new ServerSocket(3000);
			System.out.println(
					"Server behind at : " + (server.getInetAddress().getLocalHost()).getHostAddress() + ": 3000");
			System.out.println("Run the client");

			Socket socket = server.accept();

			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println(in.readLine());

			PrintStream out = new PrintStream(socket.getOutputStream());
			out.println("Welcome by server \n");
			out.flush();
			out.close();
			in.close();

		} catch (Exception e) {
			System.out.println("e" + e);
		}
	}

	public static void main(String[] args) {
		Server ser = new Server();
	}

}
