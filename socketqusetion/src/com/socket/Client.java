package com.socket;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

public class Client {
	
	
	public static void main(String[] args) throws Exception {
		
		try {
			Socket socket = new Socket("localhost", 8989);
			OutputStream out = socket.getOutputStream();
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));
		DataOutputStream dos = new DataOutputStream(out);
			
		//	while(true) {
		//		bw.write("hello world" + "\n");
			dos.writeUTF("hello world" + "\n");
				dos.flush();
				
				//dos.close();//关闭了输出流，相对的服务器中的输入流将会抛出EOF异常
				TimeUnit.SECONDS.sleep(5);
				
				
	//	}
			while(true) {
				
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
