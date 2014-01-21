package bioihm.gui.view.window;

import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * Vista principal de BioIHMWindow
 * 
 * @author hectorri
 *
 */
public class BioloidControlsFrame extends JFrame {

	/** Idenfificador de versión serie UID */
	private static final long serialVersionUID = 1L;

	/** Panel principal */
	private JPanel contentPane;

	/**
	 * Instancia la vista
	 */
	public BioloidControlsFrame() {
		setBounds(new Rectangle(0, 0, 1200, 800));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 845, 682);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
