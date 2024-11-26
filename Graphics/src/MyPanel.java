import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class MyPanel extends JPanel {

	// Image image;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	MyPanel() {

		// image = new ImageIcon("sky.png").getImage();
		this.setPreferredSize(new Dimension(500, 500));
	}

	public void paint(Graphics g) {

		Graphics2D g2D = (Graphics2D) g;

		// g2D.drawImage(image, 0, 0, null);

		// g2D.setPaint(Color.blue);
		// g2D.setStroke(new BasicStroke(5));
		// g2D.drawLine(0, 0, 500, 500);

		// ----RECTANGLE---
		g2D.setPaint(Color.pink);
		g2D.drawRect(0, 0, 100, 200);
		g2D.fillRect(0, 0, 100, 200);

		// ----CIRCLE---
		g2D.setPaint(Color.orange);
		g2D.drawOval(0, 400, 100, 100);
		g2D.fillOval(0, 400, 100, 100);

		g2D.setPaint(Color.black);
		g2D.setFont(new Font("Ink Free", Font.ROMAN_BASELINE, 30));
		g2D.drawString("This is a circle", 120, 490);

		// g2D.setPaint(Color.red);
		// g2D.drawArc(0, 0, 100, 100, 0, 180);
		// g2D.fillArc(0, 0, 100, 100, 0, 180);
		// g2D.setPaint(Color.white);
		// g2D.fillArc(0, 0, 100, 100, 180, 180);

		// ----TRIANGLE---
		int[] xPoints = { 150, 250, 350 }; // triangle
		int[] yPoints = { 300, 150, 300 };
		g2D.setPaint(Color.yellow);
		g2D.drawPolygon(xPoints, yPoints, 3);
		g2D.fillPolygon(xPoints, yPoints, 3);

		g2D.setPaint(Color.black);
		g2D.setFont(new Font("Ink Free", Font.ROMAN_BASELINE, 50));
		g2D.drawString("This is a triangle", 100, 400);

		g2D.setPaint(Color.magenta);
		g2D.setFont(new Font("Ink Free", Font.ROMAN_BASELINE, 40));
		g2D.drawString("this is a rectangle", 120, 50);

	}
}
