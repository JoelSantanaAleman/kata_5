package software.ulpgc.Control;

import org.jsoup.Jsoup;
import software.ulpgc.Control.pojo.RandomUser;
import software.ulpgc.Model.User;

import java.io.IOException;
import java.util.logging.Logger;

public class RandomUserAdapter implements UserAdapter<RandomUser> {
    @Override
    public User from(RandomUser object) {
        User user = new User()
                .setName(object.getName().title() + " " + object.getName() + " " + object.getName().last())
                .setEmail(object.getEmail())
                .setGender(User.Gender.valueOf(firstUpperCase(object.getGender())))
                .setCity(object.getLocation().city())
                .setState(object.getLocation().state())
                .setCountry(object.getLocation().country())
                .setPostcode(object.getLocation().postcode())
                .setStreetName(object.getLocation().street().name())
                .setStreetNumber(object.getLocation().street().number())
                .setLatitude(object.getLocation().coordinates().latitude())
                .setLongitude(object.getLocation().coordinates().longitude());

        loadPhoto(object, user);
        return user;
    }
    private String firstUpperCase(String gender){
        return gender.substring(0,1).toUpperCase() + gender.substring(1);
    }

    private static void loadPhoto(RandomUser object, User user){
        try{
            user.setPhoto(photoFrom(object.getPicture().medium()));
        } catch (IOException e){
            Logger.getAnonymousLogger().severe(e.getMessage());
        }
    }

    private static byte[] photoFrom(String url) throws  IOException{
        return Jsoup.connect(url)
                .ignoreContentType(true)
                .execute()
                .bodyAsBytes();
    }
}
