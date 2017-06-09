package youth.hong;

import java.awt.Frame;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
/**
 * @category serverSocket�ķ�����
 * @author May
 * @version 1.0
 */

@SuppressWarnings("serial")
public class TCPSocket extends Frame {
	//�洢��ǰ ���ߵ��û�
	private List<Client> clients = new ArrayList<Client>(2);
	private ServerSocket ss = null;
	public void start() {
		
		try {
			ss = new ServerSocket(8888);
			while(true) {
				Socket s = ss.accept();
				//System.out.println("ok!");
				//������ǰ�����û�
				Client c = new Client(s,this);
				clients.add(c);
				Thread t = new Thread(c);
				t.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	public List<Client> getClients() {
		return clients;
	}




	public static void main(String[] args) {
		new TCPSocket().start();
	}
}
