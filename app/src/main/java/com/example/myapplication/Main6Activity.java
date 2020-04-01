package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        final TextView k=findViewById( R.id.text_counter );
        final Button s=findViewById( R.id.btn_sum );
        final Button z=findViewById( R.id.btn_zero );

        s.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String x=k.getText().toString();
                int y=textToNumber( x )+1;
                k.setText( numberToText( y ) );
            }
        } );
        z.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String x=k.getText().toString();
                int y=textToNumber( x );
                y=0;
                k.setText( numberToText( y ) );
            }
        } );
    }
    private String numberToText(int number){
        return String.valueOf(number);
    }

    private int textToNumber(String text){
        return Integer.valueOf(text);
    }
}
