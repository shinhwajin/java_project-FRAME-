package Layout;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ButtonTest {

	public static void main(String[] args) {

		Frame f = new Frame("버튼 테스트");
		f.setBounds(200, 200, 400, 400);

		f.setLayout(null); // 자동배치 사용안함

		// Frame에 추가되는 각각의 컴포넌트를 고유 사이즈와 위치를 설정하여 배치한다
		Button btnOK = new Button("확인");
		btnOK.setBounds(70, 90, 100, 50);
		Button btnClose = new Button("닫기");
		btnClose.setBounds(btnOK.getBounds()); // btnOK와 같은 사이즈의 Button
		
		btnClose.setLocation(btnOK.getX()+btnOK.getWidth()+60, btnOK.getY());
		
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
