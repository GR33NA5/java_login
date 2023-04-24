package com.example.aplikacija;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("user") && password.getText().toString().equals("1234")) {
                    Toast.makeText(MainActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                    String username2 = username.getText().toString();
                    String password2 = password.getText().toString();
                    Toast.makeText(MainActivity.this, "Username: " + username2 + "\n" + "Password: "
                    + password2, Toast.LENGTH_SHORT).show();
                    Intent gotoMainActivity2 = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(gotoMainActivity2);
                } else {
                    Toast.makeText(MainActivity.this, "Login Failed!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}