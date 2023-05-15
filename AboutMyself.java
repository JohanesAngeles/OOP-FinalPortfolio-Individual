import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JProgressBar;
import java.awt.Color;
import java.awt.SystemColor;

public class AboutMyself {

	 JFrame AboutMyselfFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		       int x;
					AboutMyself window = new AboutMyself();
					window.AboutMyselfFrame.setVisible(true);
					
	}
	/**
	 * Create the application.
	 */
	public AboutMyself() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		AboutMyselfFrame = new JFrame();
		AboutMyselfFrame.setTitle("About Myself");
		AboutMyselfFrame.setResizable(false);
		AboutMyselfFrame.setBounds(100, 100, 900, 628);
		AboutMyselfFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AboutMyselfFrame.getContentPane().setLayout(null);
		
		JLabel returnButton = new JLabel("");
		returnButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				MainPage homepage = new MainPage();
				homepage.HomepageFrame.setVisible(true);
				AboutMyselfFrame.dispose();
			}
		});
		returnButton.setIcon(new ImageIcon(AboutMyself.class.getResource("/image/ReturnButton2.png")));
		returnButton.setBounds(625, 0, 259, 104);
		AboutMyselfFrame.getContentPane().add(returnButton);
		
		JLabel AcheivmentsButton = new JLabel("");
		AcheivmentsButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Achievments achievments = new Achievments();
				achievments.AchievmentsFrame.setVisible(true);
				AboutMyselfFrame.dispose();
			}
		});
		AcheivmentsButton.setIcon(new ImageIcon(AboutMyself.class.getResource("/image/AchievementsButton.png")));
		AcheivmentsButton.setBounds(625, 505, 259, 281);
		AboutMyselfFrame.getContentPane().add(AcheivmentsButton);
		
		JLabel AboutMyselfBackground = new JLabel("New label");
		AboutMyselfBackground.setIcon(new ImageIcon(AboutMyself.class.getResource("/image/Profile.png")));
		AboutMyselfBackground.setBounds(0, 0, 884, 589);
		AboutMyselfFrame.getContentPane().add(AboutMyselfBackground);
	}

	
}
