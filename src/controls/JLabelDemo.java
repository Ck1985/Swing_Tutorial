package controls;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class JLabelDemo {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public JLabelDemo() {
        prepareGUI();
    }
    private void prepareGUI() {
        this.mainFrame = new JFrame("Java Jlabel Demo");
        this.mainFrame.setSize(800,400);
        this.mainFrame.setLayout(new GridLayout(30,1));
    }
    private void showLabelDemo() {
        this.mainFrame.setVisible(true);
    }
    public static void main(String[] args) {
        JLabelDemo jLabelDemo = new JLabelDemo();
        jLabelDemo.showLabelDemo();
    }
}
