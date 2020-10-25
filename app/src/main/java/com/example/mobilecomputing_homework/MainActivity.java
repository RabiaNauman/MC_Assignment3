package com.example.mobilecomputing_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends Activity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;
    private ArrayList<String> selection=new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        textView = findViewById(R.id.textViewResults);
    }

    public void ShowSelection(View view) {

        int checked = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(checked);
        textView.setText(radioButton.getText());

    }
    public void SelectItem(View view){
        boolean checked=((CheckBox) view).isChecked();
        switch(view.getId())
        {
            case R.id.checkBox1:
            {
                if(checked)
                {
                    selection.add("CheckBox 1 Selected...!");
                }
                else
                {
                    selection.remove("CheckBox 1 Selected...!");
                }
                break;
            }
            case R.id.checkBox2:
            {
                if(checked)
                {
                    selection.add("CheckBox 2 Selected...!");
                }
                else
                {
                    selection.remove("CheckBox 2 Selected...!");
                }
                break;
            }
            case R.id.checkBox3:
            {
                if(checked)
                {
                    selection.add("CheckBox 3 Selected...!");
                }
                else
                {
                    selection.remove("CheckBox 3 Selected...!");
                }
                break;
            }
            case R.id.checkBox4:
            {
                if(checked)
                {
                    selection.add("CheckBox 4 Selected...!");
                }
                else
                {
                    selection.remove("CheckBox 4 Selected...!");
                }
                break;
            }
        }
    }

    public void PassData(View view){
        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtra("stringarray",selection);
        startActivity(intent);
    }

    }