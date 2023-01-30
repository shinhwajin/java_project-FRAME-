package Layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderLayoutTest {
	/*
	BorderLayout은 컨테이너를 North, South, East, West, Center 모두 5개의 영역으로 나눔
	다만, 각 영역에 컴포넌트는 하나만 배치할 수 있음
	*/
	Frame f = new Frame();
	Button jb1 = new Button("북");
	Button jb2 = new Button("서");
	Button jb3 = new Button("중앙");
	Button jb4 = new Button("동");
	Button jb5 = new Button("남");
	Button jb6 = new Button("버튼6");
	
	public BorderLayoutTest() {
		// Frame을 BorderLayout으로 설정
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
