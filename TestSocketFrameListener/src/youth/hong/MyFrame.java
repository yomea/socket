package youth.hong;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class MyFrame extends Frame {
	TextField tf = null;
	TextArea ta = null;
	Label l = null;
	public MyFrame() throws HeadlessException {
		super("MyFrame");
	}
	
	public void launchFrame() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		//this.class��λ��λ������,����Ҫ���з����ϲ�
		System.out.println(this.getClass().getResource("../../image/ico.ico"));
		//���������������Ǽ������ȫ�����������붥���ͬĿ¼������Ե�·��
		System.out.println(this.getClass().getClassLoader().getResource("image/ico.ico"));
		Image image = tk.getImage(this.getClass().getClassLoader().getResource("image/ico.ico"));
		this.setIconImage(image);
		this.setResizable(true);
		this.setLocation(300, 200);
		this.setSize(500, 500);
		this.setBackground(Color.GREEN);
		tf = new TextField();
		ta = new TextArea();
		l = new Label("����������");
		//ta.setEnabled(false);
		ta.setEditable(false);
		ta.setBackground(Color.GREEN);
		Panel p1 = new Panel(new GridLayout(1, 1));
		Panel p2 = new Panel(new GridLayout(2, 1));
		p1.add(ta);
		p2.add(l);
		p2.add(tf);
		this.add(p1, BorderLayout.CENTER);
		this.add(p2, BorderLayout.SOUTH);
		this.setVisible(true);
		tf.addActionListener(new MyActionListener(this));
		this.addWindowListener(new WindowAdapter(){

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}
	
	public static void main(String[] args) {
		new MyFrame().launchFrame();
	}
	
}

