import javax.swing.*;

public class MyFrame extends JFrame
{
    MyFrame()
    {
        JLabel label = new JLabel(); //label - GUI display area for a string of text, an image or both
        label.setText("Welcome dear user!");
        label.setBounds(185, 10, 300, 50);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Tuffest App Ever");
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(label);

        JButton button = new JButton();
        button.setBounds(200, 100, 100, 50);
        this.add(button);
    }
}
