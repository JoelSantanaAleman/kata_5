package software.ulpgc.Control;

import com.google.gson.Gson;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import software.ulpgc.Control.pojo.RandomUserResponse;
import software.ulpgc.Model.User;


import java.io.IOException;

public class RandomUserProvider implements UserProvider {
    private static final  String URL = "https://randomuser.me/api/";

    @Override
    public User newUser() throws IOException {
        Connection connect = Jsoup.connect("https://randomuser.me/api/").ignoreContentType(true);
        RandomUserResponse response = new Gson().fromJson(connect.get().text(), RandomUserResponse.class);
        return new RandomUserAdapter().from(response.getResults().getFirst());
    }
}

