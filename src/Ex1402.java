import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class Ex1402 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		frame.setTitle("My 1st GUI!");
		frame.setSize(600, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		frame.add(panel);
		
		JButton btn1 = new JButton("Coca Cola", new ImageIcon("img/다운로드.jpg"));
		JButton btn2 = new JButton("Diet Coke", new ImageIcon("img/"));
		JButton btn3 = new JButton("Coca Zero", new ImageIcon("img/"));
		btn1.setSize(64, 64);
		btn2.setSize(64, 64);
		btn3.setSize(64, 64);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		
		JCheckBox box1 = new JCheckBox("Subcribe to newsletter?");
		JCheckBox box2 = new JCheckBox("Receive SMS marketing?");
		JCheckBox box3 = new JCheckBox("Receive email marketing?");
		panel.add(box1);
		panel.add(box2);
		panel.add(box3);
		
		JRadioButton rbtn1 = new JRadioButton("1학년");
		JRadioButton rbtn2 = new JRadioButton("2학년", true);
		JRadioButton rbtn3 = new JRadioButton("3학년");
		JRadioButton rbtn4 = new JRadioButton("4학년");
		JRadioButton rbtn5 = new JRadioButton("기타");
		
		panel.add(rbtn1);
		panel.add(rbtn2);
		panel.add(rbtn3);
		panel.add(rbtn4);
		panel.add(rbtn5);
		
		String email[] = {"naver.com", " goole.com", "kakako.com"};
		JComboBox cbox1 = new JComboBox(email);
		panel.add(cbox1);
		
		Vector phone = new Vector();
		phone.add("SKT");
		phone.add("KT");
		phone.add("LG U+");
		JComboBox cbox2 = new JComboBox(phone);
		panel.add(cbox2);
		
		JLabel msg = new JLabel("메세지를 입력하세요: ");
		panel.add(msg);
		JTextArea msgTxt = new JTextArea(5, 10);
		panel.add(msgTxt);
		
		JLabel unJLabel = new JLabel("username: ");
		panel.add(unJLabel);
		JTextField uname = new JTextField(10);
		panel.add(uname);
		
		JLabel PwordLbl = new JLabel("password: ");
		panel.add(PwordLbl);
		JTextField pword = new JPasswordField(10);
		panel.add(uname);
		
		frame.setVisible(true);
		
	}

}
