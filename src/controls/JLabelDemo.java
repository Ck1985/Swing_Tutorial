package controls;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class JLabelDemo {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JLabel testLabel;
    private JLabel testLabel2;
    private JLabel testLabel3;
    private JLabel testLabel4;
    private JPanel controlPanel;

    public JLabelDemo() {
        prepareGUI();
        //prepareGUIVer2();
    }
    private void prepareGUI() {
        this.mainFrame = new JFrame("Java JLabel Demo");
        this.mainFrame.setSize(600,600);
        this.mainFrame.setLayout(new GridLayout(3,1));
        this.mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        this.headerLabel = new JLabel(" ",JLabel.CENTER);
        this.statusLabel = new JLabel(" ",JLabel.CENTER);
        this.testLabel = new JLabel(" ",JLabel.CENTER);
        //statusLabel.setSize(350,100);
        this.statusLabel = new JLabel(" ", JLabel.CENTER);
        this.controlPanel = new JPanel();
        this.controlPanel.setLayout(new FlowLayout());

        this.mainFrame.add(headerLabel);
        this.mainFrame.add(controlPanel);
        this.mainFrame.add(statusLabel);
    }
    private void showLabelDemo() {
        this.headerLabel.setText("Control in action: JLabel");
        this.statusLabel.setText("This is status label");
        JLabel label = new JLabel(" ",JLabel.CENTER);
        label.setText("Welcome to JLabel tutorial");
        label.setOpaque(true);
        label.setBackground(Color.GRAY);
        label.setForeground(Color.WHITE);
        this.controlPanel.add(label);
        this.mainFrame.setVisible(true);
    }

    private void prepareGUIVer2() {
        this.mainFrame = new JFrame("My GUI Demo");
        this.mainFrame.setSize(800,800);
        this.mainFrame.setLayout(new GridLayout(3,1));
        this.mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        this.headerLabel = new JLabel(" ",JLabel.CENTER);
        this.statusLabel = new JLabel(" ",JLabel.CENTER);
        this.testLabel = new JLabel(" ",JLabel.CENTER);
        this.testLabel2 = new JLabel(" ",JLabel.CENTER);
        this.testLabel3 = new JLabel(" ", JLabel.CENTER);
        this.testLabel4 = new JLabel(" ", JLabel.CENTER);
        this.mainFrame.add(headerLabel);
        this.mainFrame.add(statusLabel);
        this.mainFrame.add(testLabel);
        this.mainFrame.add(testLabel2);
        //this.mainFrame.add(testLabel2);
        //this.mainFrame.add(testLabel3);
        //this.mainFrame.add(testLabel4);
        this.mainFrame.setVisible(true);
    }

    private void showLabelVer2() {
        this.headerLabel.setText("This is header Label");
        this.headerLabel.setSize(300,300);
        this.headerLabel.setBorder(new LineBorder(Color.BLACK,1,false));
        this.statusLabel.setText("This is status label");
        this.statusLabel.setBorder(new LineBorder(Color.BLACK,1,false));
        this.testLabel.setText("This is test label");
        this.testLabel.setBorder(new LineBorder(Color.BLACK,1,false));
        this.testLabel2.setText("This is test label2");
        this.testLabel3.setText("This is test label3");
        this.testLabel4.setText("This is test label4");
    }
    public static void main(String[] args) {
        JLabelDemo jLabelDemo = new JLabelDemo();
        jLabelDemo.showLabelDemo();
    }
}
