package com.example.userdesc;

import android.net.Uri;
import android.widget.EditText;

public class User {
    private EditText name;
    private EditText email;
    private EditText phNo;
    private EditText age;
    private EditText gender;
    private Uri imageUri;
    private Uri videoUri;

    public User() {
    }

    public User(EditText name, EditText email, EditText phNo, EditText age, EditText gender, Uri imageUri, Uri videoUri) {
        this.name = name;
        this.email = email;
        this.phNo = phNo;
        this.age = age;
        this.gender = gender;
        this.imageUri = imageUri;
        this.videoUri = videoUri;
    }

    public EditText getName() {
        return name;
    }

    public void setName(EditText name) {
        this.name = name;
    }

    public EditText getEmail() {
        return email;
    }

    public void setEmail(EditText email) {
        this.email = email;
    }

    public EditText getPhNo() {
        return phNo;
    }

    public void setPhNo(EditText phNo) {
        this.phNo = phNo;
    }

    public EditText getAge() {
        return age;
    }

    public void setAge(EditText age) {
        this.age = age;
    }

    public EditText getGender() {
        return gender;
    }

    public void setGender(EditText gender) {
        this.gender = gender;
    }

    public Uri getImageUri() {
        return imageUri;
    }

    public void setImageUri(Uri imageUri) {
        this.imageUri = imageUri;
    }

    public Uri getVideoUri() {
        return videoUri;
    }

    public void setVideoUri(Uri videoUri) {
        this.videoUri = videoUri;
    }
}
