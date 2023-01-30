package Check_Choice;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckBoxTest {

	public static void main(String[] args) {
		// ������ ��ü f
		Frame f = new Frame();
		// 500,100 ��ǥ�� ũ�Ⱑ 800,250
		f.setBounds(500, 100, 800, 250);
		// Layout�� FlowLayout���� ����
		f.setLayout(new FlowLayout());
		// Font ����
		Font font = new Font("�������", Font.BOLD, 30);

		Label q1 = new Label("1. ���� �оߴ� �����Դϱ�?");
		Checkbox news = new Checkbox("news", true);
		Checkbox sports = new Checkbox("sports");
		Checkbox movie = new Checkbox("��ȭ");
		Checkbox music = new Checkbox("����");

		// üũ�ڽ� ���� ���� �Ǵ�
		news.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String str = e.getStateChange() == 1 ? "���� ���õ�" : "���� ��������";
				System.out.println(str);
			}
		});
		q1.setFont(font);
		f.add(q1);
		f.add(news);
		f.add(sports);
		f.add(movie);
		f.add(music);

		// ��Ÿ�� ���� : ������ �� �ϳ��� ���� ����
		Label q2 = new Label("��ȭ�� �� �޿� �󸶳� ���� ���ϱ�?");
		CheckboxGroup group = new CheckboxGroup();
		Checkbox one = new Checkbox("�� ��", group, true);
		Checkbox two = new Checkbox("�� ��", group, false);
		Checkbox three = new Checkbox("�� ��", group, false);

		// ���� ��ư ���� ���� �Ǵ�
		one.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("�� �� ���ϴ�");
			}
		});
		two.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("�� �� ���ϴ�");
			}
		});
		three.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("�� �� ���ϴ�");
			}
		});
		
		q2.setFont(font);
		f.add(q2);
		f.add(one);
		f.add(two);
		f.add(three);
//===============================================================
		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

}
