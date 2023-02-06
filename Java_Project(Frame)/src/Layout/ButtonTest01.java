package Layout;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ButtonTest01 {

	public static void main(String[] args) {

		Frame f = new Frame("��ư �׽�Ʈ");
		f.setBounds(200, 200, 400, 400);
		

		f.setLayout(null); // �ڵ���ġ ������

		// Frame�� �߰��Ǵ� ������ ������Ʈ�� ���� ������� ��ġ�� �����Ͽ� ��ġ�Ѵ�
		Button btnOK = new Button("Ȯ��");
		btnOK.setBounds(70, 90, 100, 50);
		btnOK.setBackground(new Color(255,153,153));//��ư ����
		Button btnClose = new Button("�ݱ�");
		btnClose.setBounds(btnOK.getBounds()); // btnOK�� ���� �������� Button
		
		btnClose.setLocation(btnOK.getX()+btnOK.getWidth()+60, btnOK.getY());
		btnClose.setBackground(new Color(255,205,197));

		f.add(btnOK);
		f.add(btnClose);

		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

}
