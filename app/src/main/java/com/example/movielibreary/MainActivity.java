package com.example.movielibreary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import movielibreary.MoviesDa;

public class MainActivity extends AppCompatActivity {
    Spinner spr;
    private TextView txtMovie;
  public  EditText edtText1;
    public  EditText edtText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spr=(Spinner) findViewById(R.id.spr1);
        List<String> list=new ArrayList<>();
        list.add("Drama");
        list.add("Crime");
        list.add("Horror");
        list.add("Comedy");
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spr.setAdapter(adapter);

        txtMovie=findViewById(R.id.textMovies);
         edtText1=findViewById(R.id.edtText1);
        edtText=findViewById(R.id.edtText);
    }

    public void btnSave_onClick(View view) {
        String type=spr.getSelectedItem().toString();
         String title=edtText1.getText().toString();
       int year=Integer.parseInt(edtText.getText().toString()) ;


        MoviesDa obj = new   MoviesDa();

        String  res=obj.getMovieByTitle(type,title,year);

        txtMovie.setText(res);
    }

}
