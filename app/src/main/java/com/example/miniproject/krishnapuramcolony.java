package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class krishnapuramcolony extends AppCompatActivity {

    TextView mytext;
    List<item4> mylist=new ArrayList<item4>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_krishnapuramcolony);

        mytext=findViewById(R.id.textView21);
        item4 itm=new item4(5,"Vadamalayan Hospital");
        mylist.add(itm);

        item4 itm1=new item4(6,"Andrews Hospital");
        mylist.add(itm1);

        item4 itm2=new item4(2,"A. R. Hosipital");
        mylist.add(itm2);

        item4 itm3=new item4(7,"Saravana Multispeciality Hospital");
        mylist.add(itm3);

        item4 itm4=new item4(4,"V. V. Hospital");
        mylist.add(itm4);
        Collections.sort(mylist);

        showList();
    }
    private void showList() {

        for (final item4 tmp : mylist) {
            mytext.append(tmp.toString() + "\n\n\n");

        }
    }
}
