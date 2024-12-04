package software.ulpgc.Control;

import software.ulpgc.Model.User;

import java.io.IOException;

public interface UserProvider {
    User newUser() throws IOException;
}