package echo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {

		ServerSocket severSocket = new ServerSocket();
		severSocket.bind(new InetSocketAddress("192.168.0.207", 10001));

		System.out.println("<서버시작>");
		System.out.println("===============================================");
		System.out.println("[연결을 기다리고 있습니다.]");
		//반복시작/
		
		while(true) {
		Socket socket = severSocket.accept();
		
		//쓰레드 출장보내기(나가서 스트링보강하고 대화해라)
		
		Thread thread = new ServerThread(socket);
		thread.start();
		}
		
		
		/*
		
		System.out.println("===============================================");
		System.out.println("<서버 종료>");
		br.close();

		socket.close();
		severSocket.close();
		*/
	}

}
