package main;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Screen {

	public JFrame frame;
	public JTextField textFieldWhite;
	public JTextField textFieldBlack;
	
	public Screen(JFrame frame, JTextField textFieldWhite, JTextField textFieldBlack) {
		super();
		this.frame = frame;
		this.textFieldWhite = textFieldWhite;
		this.textFieldBlack = textFieldBlack;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getTextFieldWhite() {
		return textFieldWhite;
	}

	public void setTextFieldWhite(JTextField textFieldWhite) {
		this.textFieldWhite = textFieldWhite;
	}

	public JTextField getTextFieldBlack() {
		return textFieldBlack;
	}

	public void setTextFieldBlack(JTextField textFieldBlack) {
		this.textFieldBlack = textFieldBlack;
	}
	
	

}
