package com.example.test.switchtester;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.ToggleButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Switch switch1 = (Switch)findViewById(R.id.switch1);
        CheckBox checkBox1 = (CheckBox)findViewById(R.id.checkBox1);
        CheckBox checkBox2 = (CheckBox)findViewById(R.id.checkBox2);
        ToggleButton toggleButton = (ToggleButton)findViewById(R.id.toggleButton);
        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radioGroup);

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String str;
                if(isChecked) str = "ON";
                else str = "OFF";
                Toast.makeText(MainActivity.this, "Switchを"+str+"にしました。",Toast.LENGTH_SHORT).show();
            }
        });

        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String str;
                if(isChecked) str = "を選択";
                else str = "の選択を解除";
                Toast.makeText(MainActivity.this, "CheckBox1"+str+"しました。",Toast.LENGTH_SHORT).show();
            }
        });

        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String str;
                if(isChecked) str = "を選択";
                else str = "の選択を解除";
                Toast.makeText(MainActivity.this, "CheckBox2"+str+"しました。",Toast.LENGTH_SHORT).show();
            }
        });

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String str;
                if(isChecked) str = "ON";
                else str = "OFF";
                Toast.makeText(MainActivity.this, "toggleButtonを"+str+"にしました。",Toast.LENGTH_SHORT).show();
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = (RadioButton)findViewById(checkedId);
                Toast.makeText(MainActivity.this, radioButton.getText()+"を選択しました。",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
