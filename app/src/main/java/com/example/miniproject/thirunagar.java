package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class thirunagar extends AppCompatActivity {

    TextView mytext;
    List<item9> mylist=new ArrayList<item9>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirunagar);

        mytext=findViewById(R.id.textView19);
        item9 itm=new item9(3,"S. S. Hospital");
        mylist.add(itm);

        item9 itm1=new item9(7,"Bhagavathi Hospital");
        mylist.add(itm1);

        item9 itm2=new item9(1,"J. K. Hosipital of Neurology");
        mylist.add(itm2);

        item9 itm3=new item9(2,"Karthik Hospital");
        mylist.add(itm3);

        item9 itm4=new item9(5,"Keepfit Hospital");
        mylist.add(itm4);
        Collections.sort(mylist);

        showList();
    }
    private void showList() {

        for (final item9 tmp : mylist) {
            mytext.append(tmp.toString() + "\n\n\n");

        }
    }
}
