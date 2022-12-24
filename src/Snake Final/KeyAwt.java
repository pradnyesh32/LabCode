package snakegame2;

import java.awt.event.*;
import javax.swing.JFrame;
@SuppressWarnings("serial")
public class KeyAwt extends JFrame implements KeyListener {
			Snake s;
	public KeyAwt(Snake s) {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(5,5);
		this.setLayout(null);
		this.addKeyListener(this);
		this.setVisible(true);
		this.s=s;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		try{s.inputs(e.getKeyChar());
		
		}catch(Exception ea) {
			
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

}
