/** created bt Toni stark/Toni sasrk */
package com.example.testpro;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText correctyear,Birthyear ;
    TextView textView;
    Button Counter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);

        Counter = findViewById(R.id.Counter);
        correctyear = findViewById(R.id.correct_year);
        Birthyear = findViewById(R.id.Birth_year);





        textView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                //here we count age
                int k = Integer.parseInt(correctyear.getText().toString());
                int e = Integer.parseInt(Birthyear.getText().toString());
                int age=  k-e  ;
                // here we show age
                textView.setText(age);
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });

        Counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                int k = Integer.parseInt(correctyear.getText().toString());
                int e= Integer.parseInt(Birthyear.getText().toString());


                // here we check if the years are same we show this  /** created bt Toni stark/Toni sasrk **/
                if (k == e)
                {
                    Toast.makeText(MainActivity.this, "Please don't write same year", Toast.LENGTH_SHORT).show();
                }
            }

        });


    }



}










