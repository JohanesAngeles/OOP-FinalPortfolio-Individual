import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

public class Contacts {

	JFrame ContactsFrame;
	private final JLabel contactsBg = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contacts window = new Contacts();
					window.ContactsFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Contacts() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ContactsFrame = new JFrame();
		ContactsFrame.setBounds(100, 100, 909, 624);
		ContactsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ContactsFrame.getContentPane().setLayout(null);
		
		JLabel returnButton = new JLabel("");
		returnButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				MainPage main = new MainPage();
				main.HomepageFrame.setVisible(true);
				ContactsFrame.dispose();
				
			}
		});
		returnButton.setIcon(new ImageIcon(Contacts.class.getResource("/image/returnButton.png")));
		returnButton.setBounds(0, 484, 271, 261);
		ContactsFrame.getContentPane().add(returnButton);
		
		JLabel viberIcon = new JLabel("");
		viberIcon.setIcon(new ImageIcon(Contacts.class.getResource("/image/icon _Viber.png")));
		viberIcon.setBounds(480, 354, 50, 60);
		ContactsFrame.getContentPane().add(viberIcon);
		
		JLabel TwitterIcon = new JLabel("");
		TwitterIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
					Desktop.getDesktop().browse(new URL("https://twitter.com/jpalex__").toURI());
				}
				catch (Exception E1) {
					
				}
				
			}
		});
		TwitterIcon.setIcon(new ImageIcon(Contacts.class.getResource("/image/icon _twitter.png")));
		TwitterIcon.setBounds(357, 354, 50, 60);
		ContactsFrame.getContentPane().add(TwitterIcon);
		
		JLabel IgIcon = new JLabel("");
		IgIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
					Desktop.getDesktop().browse(new URL("https://www.instagram.com/jpangeles_/").toURI());
				}
				catch (Exception E1) {
					
				}
				
			}
		});
		IgIcon.setIcon(new ImageIcon(Contacts.class.getResource("/image/icon _instagram.png")));
		IgIcon.setBounds(227, 354, 58, 60);
		ContactsFrame.getContentPane().add(IgIcon);
		
		JLabel FacebookIcon = new JLabel("");
		FacebookIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
					Desktop.getDesktop().browse(new URL("https://www.facebook.com/johanes.angeles").toURI());
				}
				catch (Exception E1) {
					
				}
			}
			
		});
		FacebookIcon.setIcon(new ImageIcon(Contacts.class.getResource("/image/icon _facebook.png")));
		FacebookIcon.setBounds(108, 354, 50, 60);
		ContactsFrame.getContentPane().add(FacebookIcon);
		contactsBg.setIcon(new ImageIcon(Contacts.class.getResource("/image/Contatcts.png")));
		contactsBg.setBounds(0, 0, 900, 585);
		ContactsFrame.getContentPane().add(contactsBg);
	}

}
