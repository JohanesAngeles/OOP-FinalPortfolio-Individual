import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Javaworks2 {

	 JFrame JavaWorks2Frame;
	 private final JLabel JavaWorksCompilation2 = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Javaworks2 window = new Javaworks2();
					window.JavaWorks2Frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Javaworks2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JavaWorks2Frame = new JFrame();
		JavaWorks2Frame.setResizable(false);
		JavaWorks2Frame.setBounds(100, 100, 911, 617);
		JavaWorks2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JavaWorks2Frame.getContentPane().setLayout(null);
		
		JLabel proceedButton = new JLabel("");
		proceedButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Javaworks3 java3 = new Javaworks3();
				java3.JavaWorksFrame3.setVisible(true);
				JavaWorks2Frame.dispose();
	
			}
		});
		
		JLabel returnButton = new JLabel("");
		returnButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Javaworks java = new Javaworks();
				java.JavaworksFrame.setVisible(true);
				JavaWorks2Frame.dispose();
				
			}
		});
		returnButton.setIcon(new ImageIcon(Javaworks2.class.getResource("/image/ReturnButton2.png")));
		returnButton.setBounds(647, 0, 253, 106);
		JavaWorks2Frame.getContentPane().add(returnButton);
		proceedButton.setIcon(new ImageIcon(Javaworks2.class.getResource("/image/proceedButton.png")));
		proceedButton.setBounds(350, 495, 259, 269);
		JavaWorks2Frame.getContentPane().add(proceedButton);
		JavaWorksCompilation2.setIcon(new ImageIcon(Javaworks2.class.getResource("/image/Javawroks2.png")));
		JavaWorksCompilation2.setBounds(0, 0, 900, 585);
		JavaWorks2Frame.getContentPane().add(JavaWorksCompilation2);
	}

}
