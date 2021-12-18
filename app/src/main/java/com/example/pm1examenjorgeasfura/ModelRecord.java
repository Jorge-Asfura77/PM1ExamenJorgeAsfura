package com.example.pm1examenjorgeasfura;

/* Modelo de la clase para RecyclerView*/
public class ModelRecord {
    //Variables
    String id, name, image, bio, phone, email, dob, addedTime, updatedTime;

    //Constructor

    public ModelRecord(String id, String name, String image, String bio, String phone, String email, String dob, String addedTime, String updatedTime) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.bio = bio;
        this.phone = phone;
        this.email = email;
        this.dob = dob;
        this.addedTime = addedTime;
        this.updatedTime = updatedTime;
    }

    //Getter y Setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddedTime() {
        return addedTime;
    }

    public void setAddedTime(String addedTime) {
        this.addedTime = addedTime;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }
}
