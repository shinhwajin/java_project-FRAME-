package Frame_Pro;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTest01 {
	
	public static void main(String[] args) {
		
		/*
		Frame frame = new Frame("ù ������"); //������ ����
		frame.setBounds(800, 100, 400, 300); // (x��ǥ, y��ǥ, �ʺ�, ����) â ũ��
		frame.setBackground(Color.BLUE); // â ��
		frame.setVisible(true); // â ������
		*/
		
		Frame frame = new Frame("����");
		
		Button[] arbtn = new Button[5];
		
		String[] btnTitles = {"�ݱ�","����","���","Ȯ��","�ȳ�"};
		
		for(int i=0;i<arbtn.length;i++) {
			arbtn[i]=new Button(btnTitles[i]);
		}
		
		frame.add(arbtn[0], BorderLayout.EAST);
		frame.add(arbtn[1], BorderLayout.WEST);
		frame.add(arbtn[2], BorderLayout.SOUTH);
		frame.add(arbtn[3], BorderLayout.NORTH);
		frame.add(arbtn[4], BorderLayout.CENTER);
		
		//�����ӿ� ���빰�� ���� �� �� ���빰�� ���븸ŭ ������ Ȯ��
		frame.pack(); // â�� �� ���� ��ġ?
		frame.setVisible(true);
		
		//���ʿ� ��ġ�� �ݱ��ư Ŭ��
		arbtn[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		//x��ư ���� ��
		frame.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

}
