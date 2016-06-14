
package com.example.bargav.spiderinduction20163.submited;

import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

import com.example.bargav.spiderinduction2016.MainActivity;
import com.example.bargav.spiderinduction2016.R;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Submited extends AppCompatActivity {

    private GoogleApiClient client;
    Button btn;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submited);
        String stext = "";
        String a2name = "";
        TextView submit_text = (TextView) findViewById(R.id.submit_text);
        TextView date_date = (TextView) findViewById(R.id.date_date);
        a2name = getIntent().getExtras().getString("name");
        stext = ("Thank you " + a2name + " for your response");
        submit_text.setText(stext);
        mImageView = (ImageView) findViewById(R.id.spider);
        mImageView.setImageResource(R.drawable.spider);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy  hh:mm:ss");
        String format = simpleDateFormat.format(new Date());
        date_date.setText("date:"+format);
        back();

    }

    public void back()
    {

        btn=(Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Submited.this,MainActivity.class);
                startActivity(i);

            }
        });
    }
}

