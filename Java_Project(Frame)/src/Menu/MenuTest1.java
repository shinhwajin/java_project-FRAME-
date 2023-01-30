package Menu;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuTest1 {

	public static void main(String[] args) {

		// �����ӿ� �޴� ���̱�
		Frame f = new Frame("�޴�");
		f.setSize(300, 200);
		// 1�ܰ�
		MenuBar mb = new MenuBar();
		// ���θ޴�
		Menu mFile = new Menu("����");
		// ���θ޴��� �Ӽ�
		MenuItem miNew = new MenuItem("New");// 1
		MenuItem miOpen = new MenuItem("Open");// 2
		MenuItem miSave = new MenuItem("Save");// 3
		// 4
		// �����޴��� ������ �ִ� �޴�
		Menu print = new Menu("Print");
		MenuItem printSetup = new MenuItem("����Ʈ �¾�");
		MenuItem printPre = new MenuItem("�̸�����");
		print.add(printSetup);
		print.add(printPre);

		MenuItem miClose = new MenuItem("Close");// 5

		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(miSave);
		mFile.add(print);
		mFile.add(miClose);

		// �޴��ٿ� �߰�
		mb.add(mFile);

		f.setMenuBar(mb);
		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}

}
