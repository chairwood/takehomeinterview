import javax.swing.*;
import java.awt.*;


public class CodingChallenge extends javax.swing.JFrame
{
    CodingChallenge(String title)
    {
        super(title);
        createGUI();
    }

    private void createGUI()
    {
        //Create and set up the window.
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400, 300));

        ordinalityLabel = new JLabel("Ordinality");
        ordinalityTextField = new JTextField();
        nameLabel = new JLabel("Name");
        nameTextField = new JTextField();
        sizeLabel = new JLabel("Size");
        sizeTextField = new JTextField();
        distanceLabel = new JLabel("Distance");
        distanceTextField = new JTextField();
        descriptionLabel = new JLabel("Description");
        descriptionTextArea = new JTextArea();
        submitButton = new JButton("SUBMIT");

        

        //Display the window.
        frame.pack();
    }

    public static void main (String [] args)
    {
        System.out.println("Hello World");

        javax.swing.SwingUtilities.invokeLater(() -> {new CodingChallenge("Coding Challenge").setVisible(true);});

    }

    private javax.swing.JLabel ordinalityLabel;
    private javax.swing.JTextField ordinalityTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel sizeLabel;
    private javax.swing.JTextField sizeTextField;
    private javax.swing.JLabel distanceLabel;
    private javax.swing.JTextField distanceTextField;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JButton submitButton;

}