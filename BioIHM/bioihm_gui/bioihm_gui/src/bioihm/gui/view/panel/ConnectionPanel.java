package bioihm.gui.view.panel;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

/**
 * Panel de conexión
 * 
 * @author hectorri
 *
 */
public class ConnectionPanel extends JPanel {

	private JComboBox portsCombo;

	/**
	 * Create the panel.
	 */
	public ConnectionPanel() {
		setLayout(null);
		
		portsCombo = new JComboBox();
		portsCombo.setBounds(10, 11, 100, 20);
		add(portsCombo);
		
		JButton connectButton = new JButton("Conectar");
		connectButton.setBounds(10, 42, 189, 23);
		add(connectButton);
		
		JButton refreshButton = new JButton("Actualizar");
		refreshButton.setBounds(120, 10, 79, 23);
		add(refreshButton);

	}

	public void setPorts(List<String> ports){
		for (String port : ports) {
			this.portsCombo.addItem(port);
		}
	}
}
