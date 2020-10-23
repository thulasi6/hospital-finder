package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class pudur extends AppCompatActivity {

    TextView mytext;
    List<item7> mylist=new ArrayList<item7>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pudur);

        mytext=findViewById(R.id.textView15);

        item7 itm=new item7(3,"Sumathi Hospital");
        mylist.add(itm);

        item7 itm1=new item7(4,"Christian Mission Hospital");
        mylist.add(itm1);

        item7 itm2=new item7(1,"Bharathi Hosipital");
        mylist.add(itm2);

        item7 itm3=new item7(2,"Padma Ayurveda Hospital");
        mylist.add(itm3);

        item7 itm4=new item7(5,"Rajan Hospital");
        mylist.add(itm4);
        Collections.sort(mylist);

        showList();
    }
    private void showList() {

        for (final item7 tmp : mylist) {
            mytext.append(tmp.toString() + "\n\n\n");

        }
    }}
