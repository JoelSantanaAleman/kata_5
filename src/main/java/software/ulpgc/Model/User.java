package software.ulpgc.Model;

public class User {
    public enum Gender {Male, Female}

    private String name;
    private String surname;
    private Gender gender;
    private String email;
    private byte[] photo;

    private String city;
    private String state;
    private String country;
    private String postcode;
    private String streetName;
    private int streetNumber;
    private String latitude;
    private String longitude;
    private String Location;

    public String getLocation() {
        return Location;
    }

    public User setLocation(String location) {
        Location = location;
        return this;
    }

    public String getStreetName() {
        return streetName;
    }

    public User setStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public User setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
        return this;
    }

    public String getLatitude() {
        return latitude;
    }

    public User setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    public String getLongitude() {
        return longitude;
    }

    public User setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public User setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public User setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public User setPhoto(byte[] photo) {
        this.photo = photo;
        return this;
    }

    public User setCity(String city) {
        this.city = city;
        return this;
    }

    public User setState(String state) {
        this.state = state;
        return this;
    }

    public User setCountry(String country) {
        this.country = country;
        return this;
    }

    public User setPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }
}