import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Javaworks {

	JFrame JavaworksFrame;
	private final JLabel JavaWorksCompilation1 = new JLabel("New label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Javaworks window = new Javaworks();
					window.JavaworksFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Javaworks() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JavaworksFrame = new JFrame();
		JavaworksFrame.setResizable(false);
		JavaworksFrame.setTitle("Java Works");
		JavaworksFrame.setBounds(100, 100, 910, 628);
		JavaworksFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JavaworksFrame.getContentPane().setLayout(null);
		
		JLabel proceedButton = new JLabel("");
		proceedButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				Javaworks2 java2 = new Javaworks2();
				java2.JavaWorks2Frame.setVisible(true);
				JavaworksFrame.dispose();
				
			}
		});
		
		JLabel returnButton = new JLabel("");
		returnButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				codesProgram codes = new codesProgram();
				codes.CodesProgramFrame.setVisible(true);
				JavaworksFrame.dispose();
			}
		});
		returnButton.setIcon(new ImageIcon(Javaworks.class.getResource("/image/ReturnButton2.png")));
		returnButton.setBounds(635, 0, 259, 98);
		JavaworksFrame.getContentPane().add(returnButton);
		proceedButton.setIcon(new ImageIcon(Javaworks.class.getResource("/image/proceedButton.png")));
		proceedButton.setBounds(338, 496, 259, 261);
		JavaworksFrame.getContentPane().add(proceedButton);
		JavaWorksCompilation1.setIcon(new ImageIcon(Javaworks.class.getResource("/image/Javaworks1.png")));
		JavaWorksCompilation1.setBounds(0, 0, 894, 592);
		JavaworksFrame.getContentPane().add(JavaWorksCompilation1);
	}
}
