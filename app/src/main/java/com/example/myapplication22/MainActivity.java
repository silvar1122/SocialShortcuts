package com.example.myapplication22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button youtube,twitter,facebook,instagram;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        youtube=(Button)findViewById(R.id.youtube);
        twitter=(Button)findViewById(R.id.Twitter);
        facebook=(Button)findViewById(R.id.facebook);
        instagram=(Button)findViewById(R.id.instagram);

        youtube.setOnClickListener( this);
        twitter.setOnClickListener(this);
        facebook.setOnClickListener(this);
        instagram.setOnClickListener(this);




    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.youtube:
               // Toast.makeText(this,"Youtube was cicked",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/"));
                startActivity(intent);
                break;
            case R.id.Twitter:
                intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://twitter.com/login?lang=en"));
                startActivity(intent);
                break;
            case R.id.facebook:
                //Toast.makeText(this,"Facebook was cicked",Toast.LENGTH_LONG).show();
                intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://web.facebook.com/?_rdc=1&_rdr"));
                startActivity(intent);
                break;
            case R.id.instagram:
                //Toast.makeText(this,"Instagram was cicked",Toast.LENGTH_LONG).show();
                intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.instagram.com/accounts/login/?hl=en"));
                startActivity(intent);
                break;

        }
    }
}