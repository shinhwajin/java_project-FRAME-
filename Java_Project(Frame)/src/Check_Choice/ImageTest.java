package Check_Choice;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageTest {
	
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setLayout(null);
		
		f.setBounds(200, 50, 1000, 700);
		
		//�̹���
		ImageIcon img = new ImageIcon("KakaoTalk_20230129_015528041.jpg");
		
		JLabel jl = new JLabel(img);  //JLabel���� ImageIcon ��밡��
		jl.setBounds(10,30,1000,700);  //���� �̹��� ������
		f.add(jl);
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}

}
