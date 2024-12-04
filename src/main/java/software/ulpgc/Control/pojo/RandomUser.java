package software.ulpgc.Control.pojo;

public class RandomUser {
    private String gender;
    private Name name;
    private String email;
    private Location location;

    private Picture picture;

    public String getGender() {
        return gender;
    }

    public Name getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Picture getPicture() {
        return picture;
    }

    public Location getLocation() {
        return location;
    }

    public record Picture(String large, String medium, String thumbnail) {
    }
    public record Name(String title, String first, String last){ }
    public record Location(Street street, String city, String state, String country, String postcode, Coordinates coordinates){ }
    public record Street(int number, String name) { }

    public record Coordinates(String latitude, String longitude) { }
}
