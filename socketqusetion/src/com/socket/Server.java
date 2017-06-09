package com.socket;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 在serversocket和socket建立通信时，如果有一方关闭，将导致connected reset错误，或者其他的啥错误
 * socket的输出流对应的是serversocket的输入流，如果这个流在某一方被关闭将导致错误
 * 如socket中outputstream关闭，将导致服务端的抛出eof错误，或者是-1
 * 
 * 如果是bufferedReader,使用readLine读取字符串，发送的信息必须要以换行符结尾。
 * 
 * @author may
 *
 */
public class Server {
	
	private class Test 
	{
		
	}
	
	
	
	
	public static void main(String[] args) throws Exception {
		
		ServerSocket ss = new ServerSocket(8989);
		
		Socket socket = ss.accept();
		
		Thread.sleep(3000);
		
		InputStream in = socket.getInputStream();
//		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		
		DataInputStream dis = new DataInputStream(in);
		
		System.out.println(dis.readUTF());
		
		String message = null;
		
		/*while((message = br.readLine()) != null) {
			
			System.out.println(message);
		}*/
		
		message = dis.readUTF();
			
			System.out.println(message);
			
			Class<?> clazz = Server.class;
			clazz.getDeclaredClasses();
			
	
while(true) {
	
	
}


//		in.close();
//		ss.close();
	}
	
	
	

}
