package software.ulpgc.Control;

import software.ulpgc.Model.User;

public interface UserAdapter<T> {
    User from(T object);
}
