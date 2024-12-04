package software.ulpgc;

import software.ulpgc.Control.RandomUserLoaderCommand;
import software.ulpgc.Model.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new RandomUserLoaderCommand().execute();
        for(User user : users){
            System.out.println("Name " + user.getName());
            System.out.println("Gender " + user.getGender());
            System.out.println("Email " + user.getEmail());
            System.out.println("City " + user.getCity());
            System.out.println("State " + user.getState());
            System.out.println("Country " + user.getCountry());
            System.out.println("Postcode " + user.getPostcode());
            System.out.println("Street " + user.getStreetName());
            System.out.println("Number " + user.getStreetNumber());
            System.out.println("Latitude " + user.getLatitude());
            System.out.println("Longitude " + user.getLongitude());
            System.out.println("Upload photo " + (user.getPhoto() !=  null ? "Yes" : "No"));
            System.out.println("-------------------------");
        }
    }
}
