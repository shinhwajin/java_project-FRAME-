package Frame_Pro;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FrameTest02 {
	
	public static void main(String[] args) {
		
		/*
		JFrame fr = new JFrame("�ι�°");
		fr.setSize(400, 400); //������
		fr.setLocation(800, 100); //��ǥ
		
		// X ��ư�� ������ �� �ݱ�
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���� â�� �޸� �Ҹ�
		fr.setVisible(true);
		
		// ���� ���� ������ �� ���ϴ� �ϳ��� �����Ӹ� ������ �� ���(JFRame) -> dispose()
		fr.dispose();
		*/
		
		// ������ ����
		Frame frame = new Frame("���� �Է±�");
		frame.setBounds(800, 100, 250, 400);
		frame.setBackground(Color.CYAN);
		
		// ��Ʈ (�۲�, ����, ũ��)
		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 18);
		
		// ���ʴ�
		// ������Ʈ�� �ϳ��� ���´� panel
		Panel pNorth = new Panel();
		pNorth.setBackground(Color.GREEN);
		
		// �Է»��� �����
		TextField tf = new TextField(10);
		Button btn = new Button("�Է�");
		btn.setEnabled(false);
		
		// panel�� �Է»��� �ֱ�
		pNorth.add(tf);
		pNorth.add(btn);
		pNorth.setFont(font);
		
		// �߾Ӵ�
		TextArea ta = new TextArea("",0,0,TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBackground(Color.LIGHT_GRAY);
		ta.setFont(font);
		ta.setEnabled(false);
		
		// ���ʴ�
		Panel pSouth = new Panel();
		pSouth.setFont(font);
		pSouth.setBackground(Color.MAGENTA);
		
		Button btnSave = new Button("����");
		Button btnClose = new Button("�ݱ�");
		
		pSouth.add(btnSave);
		pSouth.add(btnClose);
		
		// ������Ʈ ��ġ
		// panel�� ��ġ�ϴ� �ڵ� BorderLayout
		frame.add(pNorth, BorderLayout.NORTH);
		frame.add(ta, BorderLayout.CENTER);
		frame.add(pSouth, BorderLayout.SOUTH);
		
		frame.setVisible(true);
		frame.setResizable(false); // â�� ũ�� ������ �� ������ ����
		//-------------------------------------------------------
		// TextField �� ���� �� ��쿡�� �Է¹�ư Ȱ��ȭ
		tf.addTextListener(new TextListener() {
			@Override
			public void textValueChanged(TextEvent e) {
				if(tf.getText().equals("")) {
					btn.setEnabled(false);
				} else {
					btn.setEnabled(true);
				}
			}
		});
		//---------------------------Key�̺�Ʈ(�Է�)----------------------------
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == KeyEvent.VK_ENTER) {
					ta.append(tf.getText()+"\n");
					
					//�ؽ�Ʈ�ʵ� ����ְ� ��Ŀ�� �̵�
					tf.setText("");
					tf.requestFocus();
				}
			}
		});
		//---------------------------Button�̺�Ʈ(�Է�)----------------------------
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.append(tf.getText()+"\n");
				
				//�ؽ�Ʈ�ʵ� ����ְ� ��Ŀ�� �̵�
				tf.setText("");
				tf.requestFocus();
			}
		});
		//---------------------------Button�̺�Ʈ(�ݱ�)----------------------------
		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		//---------------------------Button�̺�Ʈ(����)----------------------------
		btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String message = ta.getText();
				try {
					//FileDialog(save, load �� �� ����ϴ� ������(��ȭ����))
					FileDialog fd = new FileDialog(frame, "����", FileDialog.SAVE);
					fd.setVisible(true);
					//System.out.println(fd.getDirectory()+fd.getFile());
					String path = fd.getDirectory()+fd.getFile();
					if(!message.equals("")) { // message�� �����Ͱ� ������� �ʴٸ�
						FileWriter fw = new FileWriter(path);
						BufferedWriter bw = new BufferedWriter(fw);
						bw.write(message);
						//FileDialog�� ��ҹ�ư�� ������ �ʰ� ���� ����
						//������ ���
						if(fd.getFile() != null) {
							JOptionPane.showMessageDialog(frame, path+"\n ��ο� �����߽��ϴ�.");
						}
						bw.close();
					} else { // TextArea �� ����� �� ���ٸ�
						JOptionPane.showMessageDialog(frame, "������ ������ �����ϴ�.");
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		// ����
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});		
	}//main
}
