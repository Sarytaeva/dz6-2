package com.example.dz6_2;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText email, password;
    private TextView entry, text2, forgetPassword, clickOnMe;


//email.getText().toString()=="admin@gmail.com"&& password.getText().toString()=="admin"

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entry = findViewById(R.id.vhod);
        email = findViewById(R.id.hi);
        password = findViewById(R.id.dd);
        button = findViewById(R.id.button);
        text2 = findViewById(R.id.text2);
        forgetPassword = findViewById(R.id.jj);
        clickOnMe = findViewById(R.id.click_on_me);

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (email.getText().toString().length() > 0) {
                    button.setBackgroundColor(getColor(R.color.orange));
                } else {
                    button.setBackgroundColor(getColor(R.color.grey));
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.getText().toString().equals("admin@gmail.com") && password.getText().toString().equals("admin")) {
                    entry.animate().alpha(0f);
                    text2.animate().alpha(0f);
                    password.animate().alpha(0f);
                    forgetPassword.animate().alpha(0f);
                    button.animate().alpha(0f);
                    clickOnMe.animate().alpha(0f);
                    email.animate().alpha(0f);
                }
            }
        });
    }


}