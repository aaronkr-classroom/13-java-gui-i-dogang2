import javax.swing.*;
import java.awt.*;

public class Ex1403 extends JFrame {
	
	public Ex1403() {
		setTitle("계산기");
		setSize(300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//제목패널
		JPanel titlePanel = new JPanel();
		titlePanel.setBounds(0, 0, 300, 40);
		add(titlePanel);
		JLabel title = new JLabel("계산기", JLabel.CENTER);
		title.setFont(new Font("함로촘돋움", Font.BOLD, 20));
		titlePanel.add(title);
		//숫자패널
		JPanel numPanel = new JPanel();
		numPanel.setBounds(0, 40, 300, 40);
		add(numPanel);
		JTextField num1 = new JTextField(5);
		JTextField num2 = new JTextField(5);
		numPanel.add(num1);
		numPanel.add(num2);
		
		JPanel btnPanel1 = new JPanel();
		btnPanel1.setBounds(0, 80, 300, 40);
		add(btnPanel1);
		JButton plus = new JButton("+");
		btnPanel1.add(plus);
		JButton minus = new JButton("-");
		btnPanel1.add(minus);
		
		JPanel btnPanel2 = new JPanel();
		btnPanel1.setBounds(0, 120, 300, 40);
		add(btnPanel1);
		JButton mult = new JButton("*");
		btnPanel1.add(mult);
		JButton div = new JButton("/");
		btnPanel1.add(div);
		
		JPanel resJPanel = new JPanel();
		btnPanel1.setBounds(0, 160, 300, 40);
		add(btnPanel1);
		JLabel lbl1 = new JLabel("결과값: ");
		btnPanel1.add(lbl1);
		JLabel lbl2 = new JLabel("");
		btnPanel1.add(lbl2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex1403();
	}
}
