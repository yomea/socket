package com.socket;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ��serversocket��socket����ͨ��ʱ�������һ���رգ�������connected reset���󣬻���������ɶ����
 * socket���������Ӧ����serversocket��������������������ĳһ�����رս����´���
 * ��socket��outputstream�رգ������·���˵��׳�eof���󣬻�����-1
 * 
 * �����bufferedReader,ʹ��readLine��ȡ�ַ��������͵���Ϣ����Ҫ�Ի��з���β��
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
