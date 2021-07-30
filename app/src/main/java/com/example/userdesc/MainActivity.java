package com.example.userdesc;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;

import static android.content.ContentValues.TAG;


public class MainActivity extends AppCompatActivity {
    private EditText name;
    private EditText email;
    private EditText phNo;
    private EditText age;
    private EditText gender;
    private Uri imageUri;
    private Uri videoUri;
    private FirebaseStorage storage;
    private FirebaseDatabase database;
    private static final int REQUEST_CAPTURE_IMAGE = 100;
    private String TAG="fafa";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        phNo = findViewById(R.id.phno);
        age = findViewById(R.id.age);
        gender = findViewById(R.id.gender);
        Button onSubmit = findViewById(R.id.onSubmit);
        Button addPhoto = findViewById(R.id.addphoto);
        Button addVideo = findViewById(R.id.addvideo);

        database = FirebaseDatabase.getInstance();
        storage = FirebaseStorage.getInstance();

        addPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cameraIntent=new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent,REQUEST_CAPTURE_IMAGE);

            }
        });














        onSubmit.setOnClickListener(v -> {
            String name = MainActivity.this.name.getText().toString();
            String phNo = MainActivity.this.phNo.getText().toString();
            String email = MainActivity.this.email.getText().toString();
            String age = MainActivity.this.age.getText().toString();
            String gender = MainActivity.this.gender.getText().toString();

            if (name.isEmpty()) {
                MainActivity.this.name.setError("Please Enter the name");
                return;
            }

            if (phNo.isEmpty()) {
                MainActivity.this.phNo.setError("Please Enter the name");
                return;
            }
            if (email.isEmpty()) {
                MainActivity.this.email.setError("Please Enter the name");
                return;
            }
            if (age.isEmpty()) {
                MainActivity.this.age.setError("Please Enter the name");
                return;
            }
            if (gender.isEmpty()) {
                MainActivity.this.gender.setError("Please Enter the name");
                return;
            }
//            User obj1 = new User(name, phNo, email, age, gender, imageUri.toString(), videoUri.toString());
//            database.child("users").push().setValue(obj1).addOnSuccessListener(aVoid -> {
//                MainActivity.this.name.getText().clear();
//                MainActivity.this.phNo.getText().clear();
//                MainActivity.this.age.getText().clear();
//                MainActivity.this.gender.getText().clear();
//                MainActivity.this.email.getText().clear();
//            });
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode== REQUEST_CAPTURE_IMAGE){
            if(data!=null && data.getExtras() != null){
                Bitmap imageBitmap = (Bitmap) data.getExtras().get("data");
            }


        }


    }
}