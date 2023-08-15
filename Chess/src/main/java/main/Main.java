package main;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {


		JFrame frame = new JFrame(); //create frame
		frame.getContentPane().setBackground(Color.black); //background to bblack for frame
		frame.setLayout(new GridBagLayout());
		frame.setMinimumSize(new Dimension(1200, 1000)); //window min size x, y
		frame.setLocationRelativeTo(null);//location is free
		
		JTextField textFieldWhite = new JTextField("Siyah: ");
		JTextField textFieldBlack = new JTextField("Beyaz: ");
		textFieldBlack.setPreferredSize(new Dimension(250, 60));
		textFieldWhite.setPreferredSize(new Dimension(250, 60));
		textFieldWhite.setEditable(false);//create text fields for write points
		
		Board board = new Board(); //board object
		frame.add(board);//board component add to container frame
		
//		frame.add(textFieldWhite);
//		frame.add(textFieldBlack);
//		frame.setVisible(true);
		
		
		Screen screen = new Screen(frame, textFieldWhite, textFieldBlack);//screen object
		screen.getFrame().setVisible(true); //make it visiable
		screen.getFrame().add(textFieldWhite);
		screen.getFrame().add(textFieldBlack);

		
	}

}