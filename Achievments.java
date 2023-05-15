import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Achievments {

	 JFrame AchievmentsFrame;
	private final JLabel AchievmentsBg = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Achievments window = new Achievments();
					window.AchievmentsFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Achievments() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		AchievmentsFrame = new JFrame();
		AchievmentsFrame.setResizable(false);
		AchievmentsFrame.setBounds(100, 100, 900, 600);
		AchievmentsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AchievmentsFrame.getContentPane().setLayout(null);
		
		JLabel returnButton = new JLabel("");
		returnButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				AboutMyself abtmyself = new AboutMyself();
				abtmyself.AboutMyselfFrame.setVisible(true);
				AchievmentsFrame.dispose();
			}
		});
		returnButton.setIcon(new ImageIcon(Achievments.class.getResource("/image/returnButton.png")));
		returnButton.setBounds(10, 468, 258, 261);
		AchievmentsFrame.getContentPane().add(returnButton);
		AchievmentsBg.setIcon(new ImageIcon(Achievments.class.getResource("/image/AchievmentsBg.png")));
		AchievmentsBg.setBounds(0, 0, 884, 561);
		AchievmentsFrame.getContentPane().add(AchievmentsBg);
	}

}
