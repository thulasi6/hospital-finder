package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class koripalayam extends AppCompatActivity {

    TextView mytext;
    List<item3> mylist=new ArrayList<item3>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koripalayam);

        mytext=findViewById(R.id.textView10);

        item3 itm=new item3(1,"Government Rajaji Hospital");
        mylist.add(itm);

        item3 itm1=new item3(9,"Booma Nursing Hospital");
        mylist.add(itm1);

        item3 itm2=new item3(6,"Kumaran Hosipital");
        mylist.add(itm2);

        item3 itm3=new item3(5,"City Hospital");
        mylist.add(itm3);

        item3 itm4=new item3(2,"Jawahar Hospital");
        mylist.add(itm4);
        Collections.sort(mylist);

        showList();
    }
    private void showList() {

        for (final item3 tmp : mylist) {
            mytext.append(tmp.toString() + "\n\n\n");

        }
    }
    }
