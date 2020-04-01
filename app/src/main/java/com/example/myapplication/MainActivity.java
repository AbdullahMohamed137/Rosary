package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText( this,"اختار التسبيح", Toast.LENGTH_LONG ).show();

        final Button a=findViewById( R.id.btn1 );
        final Button b=findViewById( R.id.btn2 );
        final Button c=findViewById( R.id.btn3 );
        final Button d=findViewById( R.id.btn4 );
        final Button e=findViewById( R.id.btn5 );
        final Button f=findViewById( R.id.btn6 );

        a.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent( MainActivity.this,Main2Activity.class );
                startActivity( intent );
            }
        } );

        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent( MainActivity.this,Main3Activity.class );
                startActivity( intent );
            }
        } );

        c.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent( MainActivity.this,Main4Activity.class);
                startActivity( intent );
            }
        } );

        d.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent( MainActivity.this,Main5Activity.class );
                startActivity( intent );
            }
        } );

        e.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent( MainActivity.this,Main6Activity.class );
                startActivity( intent );
            }
        } );

        f.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent( MainActivity.this,Main7Activity.class );
                startActivity( intent );
            }
        } );

    }
}
