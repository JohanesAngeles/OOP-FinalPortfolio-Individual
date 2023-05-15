import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OutsideIT {

	 JFrame OutsideITFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OutsideIT window = new OutsideIT();
					window.OutsideITFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OutsideIT() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		OutsideITFrame = new JFrame();
		OutsideITFrame.setResizable(false);
		OutsideITFrame.setTitle("OutsideIT");
		OutsideITFrame.setBounds(100, 100, 908, 631);
		OutsideITFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		OutsideITFrame.getContentPane().setLayout(null);
		
		JLabel returnButton = new JLabel("");
		returnButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			   MainPage main = new MainPage();
			   main.HomepageFrame.setVisible(true);
			   OutsideITFrame.dispose();
				
			}
		});
		returnButton.setIcon(new ImageIcon(OutsideIT.class.getResource("/image/returnButton.png")));
		returnButton.setBounds(10, 524, 278, 271);
		OutsideITFrame.getContentPane().add(returnButton);
		
		JLabel OutsideITCompilation = new JLabel("");
		OutsideITCompilation.setIcon(new ImageIcon(OutsideIT.class.getResource("/image/OutsideIT.png")));
		OutsideITCompilation.setBounds(0, 0, 900, 600);
		OutsideITFrame.getContentPane().add(OutsideITCompilation);
	}

}
