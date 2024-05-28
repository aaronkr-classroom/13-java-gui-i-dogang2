import javax.swing.*;
import java.awt.*;

public class Ex1404 extends JFrame {
	
	public Ex1404() {
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
		numPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		add(numPanel);
		JTextField num1 = new JTextField(5);
		JTextField num2 = new JTextField(5);
		numPanel.add(num1);
		numPanel.add(num2);
		//버튼 패널
		JPanel btnPanel = new JPanel();
		btnPanel.setBounds(100, 80, 100, 80);
		
		btnPanel.setLayout(new GridLayout(2, 2, 10, 5));
		
		add(btnPanel);
		JButton plus = new JButton("+");
		btnPanel.add(plus);
		JButton minus = new JButton("-");
		btnPanel.add(minus);
		JButton mult = new JButton("*");
		btnPanel.add(mult);
		JButton div = new JButton("/");
		btnPanel.add(div);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex1404();
	}
}
