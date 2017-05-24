package controls;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class JButtonDemo {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;
    private JButton myButtonButton;

    public JButtonDemo() {
        prepareGUI();
    }

    private void prepareGUI() {
        /*this.mainFrame = new JFrame("Java Swing Example");
        this.mainFrame.setSize(400,400);
        this.mainFrame.setLayout(new GridLayout(3,1));
        this.mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing() {
                System.exit(0);
            }
        });*/

        //this.headerLabel = new JLabel(" ",JLabel.CENTER);
        //this.statusLabel = new JLabel(" ",JLabel.CENTER);
        //this.statusLabel.setSize(350,100);

        //this.controlPanel = new JPanel();
        //this.controlPanel.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

        //this.mainFrame.add(headerLabel);
        //this.mainFrame.add(controlPanel);
        //this.mainFrame.add(statusLabel);
        //this.mainFrame.setVisible(true);
    }

    private void showButtonDemo() {
        this.headerLabel.setText("Control in Action: Button");
        ImageIcon imageIcon = createImageIcon("Button.png","Button Image");
        //JButton okButton = new JButton("OK");
        //JButton javaButton = new JButton("Submit",imageIcon);
        //JButton cancelButton = new JButton("Cancel",imageIcon);

        //JButton myButton = new JButton();
        //myButton.setSize(50,50);
        //myButton.setText("Button");
        //myButton.setIcon(imageIcon);
        //myButton.setVerticalAlignment(SwingConstants.BOTTOM);
        //myButton.setHorizontalAlignment(SwingConstants.RIGHT);

        //this.controlPanel.add(myButton);

        //javaButton.setHorizontalTextPosition(SwingConstants.CENTER);
        //cancelButton.setHorizontalTextPosition(SwingConstants.CENTER);
        //cancelButton.setHorizontalAlignment(SwingConstants.LEFT);
        //this.controlPanel.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
        //this.controlPanel.setBorder(new LineBorder(Color.BLACK,1,true));
        //this.controlPanel.add(cancelButton);
        //cancelButton.setVerticalAlignment(SwingConstants.TOP);

        /*okButton.addActionListener(new ActionListener() {
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
        });*/
        //this.controlPanel.add(okButton);
        //this.controlPanel.add(javaButton);
        //this.controlPanel.add(cancelButton);

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
        //jButton.showButtonDemo();
    }
}
