package Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMenu implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// Ŭ���� �޴��� ������ �ִ� �ؽ�Ʈ�� �����Ͽ� �̺�Ʈ ó��
		if (e.getActionCommand().equals("����Ʈ �¾�")) {
			System.out.println("����Ʈ �¾�");

		} else if (e.getActionCommand().equals("Close")) {
			System.out.println("����");
			System.exit(0);
		}

	}// actionPerformed

}
