package bioihm.gui.view.panel;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

/**
 * Representa el panel del actuador Dynamixel
 * 
 * @author hectorri
 *
 */
public class DynamixelPanel extends JPanel {

	/** Identificador de versión serie UID */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public DynamixelPanel() {
		setSize(new Dimension(103, 66));
	}

	/**
	 * @see paintComponent(Graphics)
	 */
	@Override
	protected void paintComponent(Graphics g) {
		Image img = Toolkit.getDefaultToolkit().getImage(  
				DynamixelPanel.class.getResource("/bioihm/gui/resources/img/dynamixelVoidSmall.png"));  
		 g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);  
	}

}
