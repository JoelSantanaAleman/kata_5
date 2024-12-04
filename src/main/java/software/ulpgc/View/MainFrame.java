package software.ulpgc.View;

import software.ulpgc.Control.RandomUserLoaderCommand;
import software.ulpgc.Model.User;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainFrame extends JFrame {

    private JLabel nameLabel;
    private JLabel genderLabel;
    private JLabel emailLabel;
    private JLabel photoLabel;
    private JButton loadButton;
    private JLabel streetLabel;
    private JLabel cityLabel;
    private JLabel stateLabel;
    private JLabel countryLabel;
    private JLabel postcodeLabel;
    private JLabel coordinatesLabel;

    public MainFrame(){
        setTitle("Random user Generator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        nameLabel = new JLabel("Name and surname: ");
        genderLabel = new JLabel("Gender: ");
        emailLabel = new JLabel("Email: ");
        streetLabel = new JLabel("Street: ");
        cityLabel = new JLabel("City: ");
        stateLabel = new JLabel("State: ");
        countryLabel = new JLabel("Country: ");
        postcodeLabel = new JLabel("Postcode: ");
        coordinatesLabel = new JLabel("Coordinates: ");
        photoLabel = new JLabel("Photo: ");
        loadButton = new JButton("Upload new user");

        JPanel infPanel = new JPanel();
        infPanel.setLayout(new BoxLayout(infPanel, BoxLayout.Y_AXIS));
        infPanel.add(nameLabel);
        infPanel.add(genderLabel);
        infPanel.add(emailLabel);
        infPanel.add(streetLabel);
        infPanel.add(cityLabel);
        infPanel.add(stateLabel);
        infPanel.add(countryLabel);
        infPanel.add(postcodeLabel);
        infPanel.add(coordinatesLabel);
        infPanel.add(photoLabel);

        add(infPanel, BorderLayout.CENTER);
        add(loadButton, BorderLayout.SOUTH);

        loadButton.addActionListener(e -> loadRandomUser());
    }

    private void loadRandomUser(){
        List<User> users = new RandomUserLoaderCommand().execute();

        if(!users.isEmpty()) {
            User user = users.getFirst();
            nameLabel.setText("Name and Surname: " + user.getName());
            genderLabel.setText("Gender: " + user.getGender());
            emailLabel.setText("Email: " + user.getEmail());
            streetLabel.setText("Street: " + user.getStreetName() + " " + user.getStreetNumber());
            cityLabel.setText("City: " + user.getCity());
            stateLabel.setText("State: " + user.getState());
            countryLabel.setText("Country: " + user.getCountry());
            postcodeLabel.setText("Postcode: " + user.getPostcode());
            coordinatesLabel.setText("Coordinates: " + user.getLatitude() + " " + user.getLongitude());

            ImageIcon photoIcon = new ImageIcon(user.getPhoto());
            photoLabel.setIcon(photoIcon);
            photoLabel.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            MainFrame frame = new MainFrame();
            frame.setVisible(true);
        });
    }

}
