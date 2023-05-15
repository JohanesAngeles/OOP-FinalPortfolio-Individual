import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Htmlworks {

	 JFrame HtmlWorksFrame;
	 private final JLabel HtmlWorks1Compilation = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Htmlworks window = new Htmlworks();
					window.HtmlWorksFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Htmlworks() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		HtmlWorksFrame = new JFrame();
		HtmlWorksFrame.setTitle("HTML Works");
		HtmlWorksFrame.setResizable(false);
		HtmlWorksFrame.setBounds(100, 100, 910, 627);
		HtmlWorksFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		HtmlWorksFrame.getContentPane().setLayout(null);
		
		JLabel returnButton = new JLabel("");
		returnButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				codesProgram codes = new codesProgram();
				codes.CodesProgramFrame.setVisible(true);
				HtmlWorksFrame.dispose();
			}
		});
		returnButton.setIcon(new ImageIcon(Htmlworks.class.getResource("/image/ReturnButton2.png")));
		returnButton.setBounds(635, 0, 259, 103);
		HtmlWorksFrame.getContentPane().add(returnButton);
		
		JLabel proceedButton = new JLabel("");
		proceedButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Htmlworks2 html2 = new Htmlworks2();
				html2.HtmlWorks2Frame.setVisible(true);
				HtmlWorksFrame.dispose();
				
			}
		});
		proceedButton.setIcon(new ImageIcon(Htmlworks.class.getResource("/image/proceedButton.png")));
		proceedButton.setBounds(324, 481, 265, 287);
		HtmlWorksFrame.getContentPane().add(proceedButton);
		HtmlWorks1Compilation.setIcon(new ImageIcon(Htmlworks.class.getResource("/image/HtmlWorks1.png")));
		HtmlWorks1Compilation.setBounds(0, 0, 900, 588);
		HtmlWorksFrame.getContentPane().add(HtmlWorks1Compilation);
	}

}
