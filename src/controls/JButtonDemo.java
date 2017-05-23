package controls;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class JButtonDemo {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public JButtonDemo() {
        prepareGUI();
    }

    private void prepareGUI() {
        this.mainFrame = new JFrame("Java Swing Example");
        this.mainFrame.setSize(400,400);
        this.mainFrame.setLayout(new GridLayout(3,1));
        this.mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing() {
                System.exit(0);
            }
        });

        this.headerLabel = new JLabel(" ",JLabel.CENTER);
        this.statusLabel = new JLabel(" ",JLabel.CENTER);
        this.statusLabel.setSize(350,100);

        this.controlPanel = new JPanel();
        this.controlPanel.setLayout(new FlowLayout());

        this.mainFrame.add(headerLabel);
        this.mainFrame.add(controlPanel);
        this.mainFrame.add(statusLabel);
        this.mainFrame.setVisible(true);
    }

    private void showButtonDemo() {
        this.headerLabel.setText("Control in Action: Button");
        ImageIcon imageIcon = createImageIcon("C:\\Users\\anony\\Documents\\IntelliJ_Projects\\Reilly Java IO\\Swing_Tutorial\\src\\controls\\Button.png","Button Image");
        JButton okButton = new JButton("OK");
        JButton javaButton = new JButton("Submit",imageIcon);
        JButton cancelButton = new JButton("Cancel",imageIcon);

        cancelButton.setHorizontalTextPosition(SwingConstants.RIGHT );

        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("OK Button has just clicked");
            }
        });
        javaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("Submit Button has just clicked");
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("Cancel Button has just clicked");
            }
        });
        this.controlPanel.add(okButton);
        this.controlPanel.add(javaButton);
        this.controlPanel.add(cancelButton);

        this.mainFrame.setVisible(true);
    }

    private static ImageIcon createImageIcon(String path, String description) {
        java.net.URL imgURL = JButtonDemo.class.getResource(path);
        if (imgURL != null) {
            ImageIcon imgIcon = new ImageIcon(imgURL,description);
            return imgIcon;
        } else {
            System.out.println("Couldn't find the image url" + path);
            return null;
        }
    }

    public static void main(String[] args) {
        JButtonDemo jButton = new JButtonDemo();
        jButton.showButtonDemo();
    }
}
