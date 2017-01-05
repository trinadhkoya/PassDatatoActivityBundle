package com.example.mybundleapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button passButton;
    Bundle bundle;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText);
        passButton= (Button) findViewById(R.id.button);

        passButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bundle=new Bundle();
                bundle.putString("username",editText.getText().toString());
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,SecondActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);



            }
        });

    }
}
