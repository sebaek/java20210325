package p18.lecture.network;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class A02Socket {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;

		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("172.30.1.43", 5001));

			System.out.println("[연결 기다림]");
			socket = serverSocket.accept();
			System.out.println("[연결 완료]");
			InetSocketAddress address = (InetSocketAddress) socket.getRemoteSocketAddress();
			System.out.println(address.getAddress());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (socket != null) {
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (serverSocket != null) {
					serverSocket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
