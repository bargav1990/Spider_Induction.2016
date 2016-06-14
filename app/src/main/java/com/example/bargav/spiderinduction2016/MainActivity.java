package com.example.bargav.spiderinduction2016;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public Button btn;
    public EditText name,rollnum;
    public CheckBox tronix,appdev,webdev,algo;
    public Switch mento;
    public TextView Spider_Induction_2016;
    public int check_profile=0;
    public int tnum=0,anum=0,appnum=0,webnum=0;
    ArrayList<String>profile_list=new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText name=(EditText)findViewById(R.id.name);
        EditText rollnum=(EditText)findViewById(R.id.rollnum);
        Spinner dep =(Spinner)findViewById(R.id.dep);
        CheckBox tronix=(CheckBox)findViewById(R.id.tronix);
        CheckBox appdev=(CheckBox)findViewById(R.id.appdev);
        CheckBox webdev=(CheckBox)findViewById(R.id.webdev);
        CheckBox algo=(CheckBox)findViewById(R.id.algo);
        Switch mento=(Switch)findViewById(R.id.mento);
        ArrayAdapter<CharSequence>
                adapter=ArrayAdapter.createFromResource(this,R.array.DEPARTNEMT,android.R.layout.select_dialog_singlechoice);
        adapter.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        dep.setAdapter(adapter);
        setContentView(R.layout.activity_main);
        onclicks();

    }
    public void onclicks()
    {

        Spider_Induction_2016=(TextView)findViewById(R.id.Spider_Induction_2016);
        name=(EditText)findViewById(R.id.name);
        btn=(Button)findViewById(R.id.submit);
        rollnum=(EditText)findViewById(R.id.rollnum);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int int_name,int_rollnum;
                String stost="";
                String lol="";
                final String sname = name.getText().toString();
                final String srollnum =rollnum.getText().toString();
                int check=5;
                if(sname.equals(""))
                {
                    check+=1;

                }
                if(srollnum.equals(""))
                {
                    check+=3;
                }
                if(check_profile==0)
                {
                    check+=5;
                }
                switch (check)
                {
                    case 6:Toast.makeText(MainActivity.this, "ENTER NAME PLEASE",
                            Toast.LENGTH_SHORT).show();
                        break;
                    case 8:Toast.makeText(MainActivity.this, "ENTER ROLL NUMBER PLEASE",
                            Toast.LENGTH_SHORT).show();
                        break;
                    case 10:Toast.makeText(MainActivity.this, "PLEASE CHECK ANY OF THE PROFILE",
                            Toast.LENGTH_SHORT).show();
                        break;
                    case 9:Toast.makeText(MainActivity.this, "ENTER NAME AND ROLL NUMBER PLEASE",
                            Toast.LENGTH_SHORT).show();
                        break;

                    case 13:Toast.makeText(MainActivity.this, "ENTER ROLL NUMBER AND CHECK A PROFILE PLEASE",
                            Toast.LENGTH_SHORT).show();
                        break;

                    case 11:Toast.makeText(MainActivity.this, "ENTER NAME AND CHECK A PROFILE PLEASE",
                            Toast.LENGTH_SHORT).show();
                        break;

                    case 14:Toast.makeText(MainActivity.this, "PLEASE ENTER ALL THE DETAILS",
                            Toast.LENGTH_SHORT).show();
                        break;


                }
                if(check==5) {Intent intent = new Intent("com.example.bargav.spiderinduction20163.submited.Submited");
                    intent.putExtra("name",sname);
                    intent.putExtra("rollnum",srollnum);
                    startActivity(intent);


                }
            }
        });

    }
    public void selection(View v)
    { Spider_Induction_2016=(TextView)findViewById(R.id.Spider_Induction_2016);
        tronix=(CheckBox)findViewById(R.id.tronix);
        appdev=(CheckBox)findViewById(R.id.appdev);
        webdev=(CheckBox)findViewById(R.id.webdev);
        algo=(CheckBox)findViewById(R.id.algo);
        boolean checked=((CheckBox)v).isChecked();
        switch(v.getId())
        {
            case R.id.tronix:
                if (checked)
                {
                    if(tnum!=1)
                        tnum=1;
                    else
                        break;
                }
                else {
                    tnum = 0;
                    break;
                }
                break;


            case R.id.algo:
                if (checked)
                {
                    if(anum!=1)
                        anum=1;
                    else
                        break;
                }
                else {
                    anum = 0;
                    break;
                }
                break;


            case R.id.webdev:
                if (checked)
                {
                    if(webnum!=1)
                        webnum=1;
                    else
                        break;
                }
                else {
                    webnum = 0;
                    break;
                }
                break;



            case R.id.appdev:
                if (checked)
                {
                    if(appnum!=1)
                        appnum=1;
                    else
                        break;
                }
                else {
                    appnum = 0;
                    break;
                }
                break;


        }
        check_profile=appnum+tnum+anum+webnum;
    }

}
