import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class MyFrame extends JFrame implements ActionListener
{
    JButton button = new JButton();
    MyFrame() throws IOException, InterruptedException
    {
        JLabel welcomeMessage = new JLabel(); //label - GUI display area for a string of text, an image or both
        welcomeMessage.setText("Welcome dear user!");
        welcomeMessage.setBounds(185, 10, 300, 50);

        JLabel updateMessage = new JLabel();
        updateMessage.setText("Check for updates");
        updateMessage.setBounds(185, 50, 300, 50);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Tuffest App Ever");
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(welcomeMessage);
        this.add(updateMessage);

        button.setText("Check for updates");
        button.setBounds(167, 100, 150, 50);
        button.addActionListener(this);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == button)
        {
            System.out.println("Clicked button");
        }
    }

    public void checkStatus() throws IOException, InterruptedException {
//        HttpClient httpClient = HttpClient.newHttpClient();
//        HttpRequest httpRequest = HttpRequest.newBuilder(URI.create("https://www.instagram.com/ksi")).GET().build();
//        HttpResponse<String> response = httpClient.send(httpRequest, BodyHandlers.ofString());
//        System.out.println(response.body());
    }
}
