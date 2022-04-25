package com.example.radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup rgroup;
    private RadioButton rbtn;
    private Button sBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rgroup =(RadioGroup)findViewById(R.id.rgroup);

        sBtn =(Button)findViewById(R.id.sbtn);

        sBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId= rgroup.getCheckedRadioButtonId();
                rbtn =(RadioButton)findViewById(selectedId);
                Toast.makeText(MainActivity.this, rbtn.getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}