package bioihm.gui.view.window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bioihm.gui.view.panel.ConnectionPanel;

public class BioIHMMainFrame extends JFrame {

	private JPanel contentPane;
	private ConnectionPanel connectionPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BioIHMMainFrame frame = new BioIHMMainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BioIHMMainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 241, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		connectionPanel = new ConnectionPanel();
		connectionPanel.setBounds(10, 11, 205, 80);
		contentPane.add(connectionPanel);
	}

	public ConnectionPanel getConnectionPanel() {
		return connectionPanel;
	}
}
