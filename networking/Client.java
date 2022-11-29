package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Client {

	public Client() {
		try {

			// creating the socket to connect to server running on same machine
			Socket client = new Socket("localhost", 3000);
			// getting the o/p stream of the connection
			PrintStream out = new PrintStream(client.getOutputStream());
			// sending the message to server
			out.println("Hello form client\n");
			out.flush();
			BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			System.out.println(in.readLine());

			in.close();
			out.close();
		} catch (IOException e) {
			System.out.println("e" + e);
		}
	}

	public static void main(String[] args) {
		new Client();
	}

}
