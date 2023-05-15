import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class MainPage {

	 JFrame HomepageFrame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage window = new MainPage();
					window.HomepageFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public MainPage() {
		initialize();
	}

	
	private void initialize() {
		HomepageFrame = new JFrame();
		HomepageFrame.setTitle("MainPage");
		HomepageFrame.setResizable(false);
		HomepageFrame.setBounds(100, 100, 900, 628);
		HomepageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		HomepageFrame.getContentPane().setLayout(null);
		
		JLabel AboutMyselfButton = new JLabel("");
		AboutMyselfButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				AboutMyself aboutme = new AboutMyself();
				aboutme.AboutMyselfFrame.setVisible(true);
				HomepageFrame.dispose();
				
			}
			
		});
		
		JLabel logoutButton = new JLabel("");
		logoutButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			    AboutMyself myself = new AboutMyself();
			    
			    int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to sign out?", 
			    		"Confirmation", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
 
                	Login login = new Login();
                	login.setVisible(true);
                	HomepageFrame.dispose();
                    
                }
			    
			}
		});
		
		logoutButton.setIcon(new ImageIcon(MainPage.class.getResource("/image/Logoutbutton.png")));
		logoutButton.setBounds(616, 97, 200, 30);
		HomepageFrame.getContentPane().add(logoutButton);
		AboutMyselfButton.setIcon(new ImageIcon(MainPage.class.getResource("/image/ABoutmebutton.png")));
		AboutMyselfButton.setBounds(333, 225, 200, 120);
		HomepageFrame.getContentPane().add(AboutMyselfButton);
		
		JLabel codesButton = new JLabel("");
		codesButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				codesProgram codesprog = new codesProgram();
				codesprog.CodesProgramFrame.setVisible(true);
				HomepageFrame.dispose();
			}
		});
		codesButton.setIcon(new ImageIcon(MainPage.class.getResource("/image/codesButton.png")));
		codesButton.setBounds(616, 225, 200, 120);
		HomepageFrame.getContentPane().add(codesButton);
		
		JLabel outsideITButton = new JLabel("");
		outsideITButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				OutsideIT outsideit = new OutsideIT();
				outsideit.OutsideITFrame.setVisible(true);
				HomepageFrame.dispose();
			}
		});
		outsideITButton.setIcon(new ImageIcon(MainPage.class.getResource("/image/ObessionButton.png")));
		outsideITButton.setBounds(333, 404, 200, 120);
		HomepageFrame.getContentPane().add(outsideITButton);
		
		JLabel ContactsButton = new JLabel("");
		ContactsButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Contacts contact = new Contacts();
				contact.ContactsFrame.setVisible(true);
				HomepageFrame.dispose();
				
			}
		});
		ContactsButton.setIcon(new ImageIcon(MainPage.class.getResource("/image/ContactsButton.png")));
		ContactsButton.setBounds(616, 404, 200, 120);
		HomepageFrame.getContentPane().add(ContactsButton);
		
		JLabel Mainbg = new JLabel("");
		Mainbg.setIcon(new ImageIcon(MainPage.class.getResource("/image/MainBg.png")));
		Mainbg.setBounds(0, 0, 884, 730);
		HomepageFrame.getContentPane().add(Mainbg);
        
	}

}
