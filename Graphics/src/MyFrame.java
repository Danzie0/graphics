import javax.swing.JFrame;

public class MyFrame extends JFrame {

	MyPanel panel;

	MyFrame() {

		panel = new MyPanel();

		this.setTitle("2D Graphics");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}