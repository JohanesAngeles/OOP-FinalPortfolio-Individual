import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import java.awt.Color;
import java.awt.Font;

public class LoadingPage {

    static JFrame frame;
	private final JLabel loadingbackground = new JLabel("");
	private static JProgressBar progressBar;
	private static JLabel label1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	            int x;
					LoadingPage window = new LoadingPage();
					window.frame.setVisible(true);
		      try {
		    	  for(x=0;x<=100;x++) {
		    		  LoadingPage.progressBar.setValue(x);
		    		  Thread.sleep(30);
		    		  LoadingPage.label1.setText(Integer.toString(x)+"%");
		    		  if (x==100) {
		    			  Login Login = new Login();
		  				  Login.setVisible(true);
		    			  frame.dispose();
		    		  }
		    	  }
		    	  
		      }catch (InterruptedException e) {
		    	  e.printStackTrace();
		      }
					
	}

	/**
	 * Create the application.
	 */
	public LoadingPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 912, 633);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		label1 = new JLabel("New label");
		label1.setForeground(new Color(255, 255, 255));
		label1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		label1.setBounds(629, 476, 77, 23);
		frame.getContentPane().add(label1);
		
		progressBar = new JProgressBar();
		progressBar.setForeground(new Color(152, 121, 57));
		progressBar.setBounds(454, 510, 403, 23);
		
		frame.getContentPane().add(progressBar);
		loadingbackground.setIcon(new ImageIcon(LoadingPage.class.getResource("/image/Loadingbg.png")));
		loadingbackground.setBounds(0, 0, 906, 600);
		frame.getContentPane().add(loadingbackground);
		
	}
}
