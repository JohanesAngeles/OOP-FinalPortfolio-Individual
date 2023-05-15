import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Htmlworks2 {

	 JFrame HtmlWorks2Frame;
	 private final JLabel HtmlworksCompilation2 = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Htmlworks2 window = new Htmlworks2();
					window.HtmlWorks2Frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Htmlworks2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		HtmlWorks2Frame = new JFrame();
		HtmlWorks2Frame.setResizable(false);
		HtmlWorks2Frame.setBounds(100, 100, 900, 632);
		HtmlWorks2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		HtmlWorks2Frame.getContentPane().setLayout(null);
		
		JLabel returnButton = new JLabel("");
		returnButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Htmlworks html = new Htmlworks();
				html.HtmlWorksFrame.setVisible(true);
				HtmlWorks2Frame.dispose();
			}
		});
		returnButton.setIcon(new ImageIcon(Htmlworks2.class.getResource("/image/ReturnButton2.png")));
		returnButton.setBounds(631, 0, 253, 106);
		HtmlWorks2Frame.getContentPane().add(returnButton);
		HtmlworksCompilation2.setIcon(new ImageIcon(Htmlworks2.class.getResource("/image/HtmlWorks2.png")));
		HtmlworksCompilation2.setBounds(0, 0, 884, 600);
		HtmlWorks2Frame.getContentPane().add(HtmlworksCompilation2);
	}

}
