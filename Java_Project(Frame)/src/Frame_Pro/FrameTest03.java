package Frame_Pro;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class FrameTest03 {
	
	public static void main(String[] args) {
		/*
		ȭ���� �߾ӿ� ������ ��ġ��Ű��
		1. ���� ���� ������� �ػ󵵸� �˾Ƴ���
		2. ������� �߾� ��ǥ�� �˾Ƴ���
		3. ������ �¿� ũ�⸦ �߾� ��ǥ���� �������
		
		x : ����� �߾� x��ǥ�� - ���� ������� ������ width/2
		y : ����� �߾� y��ǥ�� - ���� ������� ������ height/2
		*/
		
		Frame fr = new Frame("����°");
		fr.setSize(400,400);
		
		// 1. Toolkit�� ���� ������� �ػ󵵸� ������
		Toolkit tk = Toolkit.getDefaultToolkit();
		/*
		for(int i=0;i<3;i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			tk.beep();
		}
		*/
		// 2. Dimension�� ���� �߾� ��ǥ�� ������
		Dimension di = tk.getScreenSize();
		int monitorW = di.width;
		int monitorH = di.height;
		
		// 3. ������ �¿� ũ�� ���ֱ�
		int x = monitorW/2-fr.getWidth()/2;
		int y = monitorH/2-fr.getHeight()/2;
		
		fr.setLocation(x, y);
		fr.setVisible(true);
		
		
		
	}

}
