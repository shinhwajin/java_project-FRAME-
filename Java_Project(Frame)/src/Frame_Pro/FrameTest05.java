package Frame_Pro;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTest05 {

	public static void main(String[] args) {
		
		MyFrame04 fr = new MyFrame04();
		fr.setBackground(Color.YELLOW);
		fr.setTitle("�ټ���° ����� ������");

		// WindowListener�� �����ϰ� �ִ� MyEventListener ����
		//fr.addWindowListener(new MyEventListener());
		
		//fr.addWindowListener(new WinClosingListener());
		
		
		fr.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("����͸� �����Ͽ� close����!");
				System.exit(0);
			}
		});
		 
		
	}
}
