import javax.swing.*;
import java.awt.*;
public class Ex1401 extends Frame {
	
	public Ex1401() {
		setTitle("프레임 및 아이콘");
		setSize(600, 300);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.pink);
		add(panel);
		
		setIconImage(new ImageIcon("Coca-Cola-icon.png").getImage());
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
