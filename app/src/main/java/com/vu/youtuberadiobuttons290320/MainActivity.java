package com.vu.youtuberadiobuttons290320;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        textView = findViewById(R.id.text_view_selected);

        Button submitButton = findViewById(R.id.sumbitButton);
        submitButton.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {

                int radioId = radioGroup.getCheckedRadioButtonId();

                radioButton = findViewById(radioId);

                switch (radioId)
                {
                    case R.id.radio_one:
                        textView.setText("Correct: " + radioButton.getText());
                        break;

                    case R.id.radio_two:
                        textView.setText("Incorrect: " + radioButton.getText());
                        break;

                    case R.id.radio_three:
                        textView.setText("Incorrect: " + radioButton.getText());
                        break;

                    case R.id.radio_four:
                        textView.setText("Incorrect: " + radioButton.getText());
                        break;

                        default:
                            break;
                }
                //textView.setText("Your Choice" + radioButton.getText());
            }

        });
    }

    public void checkButton(View v)
    {
        int radioId = radioGroup.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);

        Toast.makeText(this, "Selected Radio Button: " + radioButton.getText(), Toast.LENGTH_SHORT).show();
    }

}
