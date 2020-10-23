package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ottankudi extends AppCompatActivity {

    TextView mytext;
    List<item6> mylist=new ArrayList<item6>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ottankudi);

        mytext=findViewById(R.id.textView14);
        item6 itm=new item6(4,"Preethi Hospital");
        mylist.add(itm);

        item6 itm1=new item6(3,"Meenakshi Multispeciality Hospital");
        mylist.add(itm1);

        item6 itm2=new item6(6,"Sri Kamathi Subam Hosipital");
        mylist.add(itm2);

        item6 itm3=new item6(1,"Eagle Siddha Hospital");
        mylist.add(itm3);

        item6 itm4=new item6(5,"Annai Hospital");
        mylist.add(itm4);
        Collections.sort(mylist);

        showList();
    }
    private void showList() {

        for (final item6 tmp : mylist) {
            mytext.append(tmp.toString() + "\n\n\n");

        }
    }
    }
