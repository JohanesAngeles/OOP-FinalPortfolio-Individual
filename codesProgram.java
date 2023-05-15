import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class codesProgram {

	JFrame CodesProgramFrame;
	private final JLabel JavaworksButton = new JLabel("");
	private final JLabel HTMLWorksButton = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					codesProgram window = new codesProgram();
					window.CodesProgramFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public codesProgram() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		CodesProgramFrame = new JFrame();
		CodesProgramFrame.setBounds(100, 100, 910, 632);
		CodesProgramFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CodesProgramFrame.getContentPane().setLayout(null);
		
		HTMLWorksButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Htmlworks html = new Htmlworks();
				html.HtmlWorksFrame.setVisible(true);
				CodesProgramFrame.dispose();
			} 
		});
		HTMLWorksButton.setIcon(new ImageIcon(codesProgram.class.getResource("/image/HTMLButton.png")));
		HTMLWorksButton.setBounds(434, 275, 202, 120);
		
		CodesProgramFrame.getContentPane().add(HTMLWorksButton);
		JavaworksButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Javaworks java = new Javaworks();
				java.JavaworksFrame.setVisible(true);
				CodesProgramFrame.dispose();
				
			}
		});
		JavaworksButton.setIcon(new ImageIcon(codesProgram.class.getResource("/image/JavaButton.png")));
		JavaworksButton.setBounds(670, 275, 200, 120);
		
		CodesProgramFrame.getContentPane().add(JavaworksButton);
		
		JLabel CodesBackground = new JLabel("");
		CodesBackground.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				MainPage main = new MainPage();
				main.HomepageFrame.setVisible(true);
				CodesProgramFrame.dispose();
			}
		});
		CodesBackground.setIcon(new ImageIcon(codesProgram.class.getResource("/image/codesProgrambg.png")));
		CodesBackground.setBounds(0, 0, 909, 600);
		CodesProgramFrame.getContentPane().add(CodesBackground);
	}

}
