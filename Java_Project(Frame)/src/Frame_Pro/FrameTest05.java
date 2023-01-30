package Frame_Pro;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTest05 {

	public static void main(String[] args) {
		
		MyFrame04 fr = new MyFrame04();
		fr.setBackground(Color.YELLOW);
		fr.setTitle("다섯번째 사용자 프레임");

		// WindowListener를 구현하고 있는 MyEventListener 참조
		//fr.addWindowListener(new MyEventListener());
		
		//fr.addWindowListener(new WinClosingListener());
		
		
		fr.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("어댑터를 생성하여 close감지!");
				System.exit(0);
			}
		});
		 
		
	}
}
