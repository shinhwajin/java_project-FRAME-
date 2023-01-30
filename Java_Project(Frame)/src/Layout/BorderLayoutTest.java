package Layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderLayoutTest {
	/*
	BorderLayout�� �����̳ʸ� North, South, East, West, Center ��� 5���� �������� ����
	�ٸ�, �� ������ ������Ʈ�� �ϳ��� ��ġ�� �� ����
	*/
	Frame f = new Frame();
	Button jb1 = new Button("��");
	Button jb2 = new Button("��");
	Button jb3 = new Button("�߾�");
	Button jb4 = new Button("��");
	Button jb5 = new Button("��");
	Button jb6 = new Button("��ư6");
	
	public BorderLayoutTest() {
		// Frame�� BorderLayout���� ����
		f.setLayout(new BorderLayout());
		f.add(jb1, BorderLayout.NORTH);
		f.add(jb2, BorderLayout.WEST);
		f.add(jb3, BorderLayout.CENTER);
		f.add(jb4, BorderLayout.EAST);
		f.add(jb5, BorderLayout.SOUTH);
		f.add(jb6, "Center");
		
		f.setSize(400, 300);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}

	public static void main(String[] args) {

		new BorderLayoutTest();
		

	}

}
