package com.example.mybundleapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    Bundle bundle;
    EditText editText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        bundle=getIntent().getExtras();
        String username=bundle.getString("username");
        editText=(EditText)findViewById(R.id.editText2);
        editText.setText(username);


    }
}
