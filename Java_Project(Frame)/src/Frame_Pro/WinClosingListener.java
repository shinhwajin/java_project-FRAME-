package Frame_Pro;

import java.awt.event.WindowEvent;

public class WinClosingListener extends ListenerClass {

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("���� ������ Adapter");
		System.exit(0);
	}

}
