package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class munisalai extends AppCompatActivity {

    TextView mytext;
    List<item5> mylist=new ArrayList<item5>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_munisalai);

        mytext=findViewById(R.id.textView11);

        item5 itm=new item5(7,"Kirithiga Hospital");
        mylist.add(itm);

        item5 itm1=new item5(4,"MahaLingam Hospital");
        mylist.add(itm1);

        item5 itm2=new item5(5,"Nadar Hosipital");
        mylist.add(itm2);

        item5 itm3=new item5(6,"Rajathi Hospital");
        mylist.add(itm3);

        item5 itm4=new item5(3,"Baskhar Hospital");
        mylist.add(itm4);
        Collections.sort(mylist);

        showList();
    }
    private void showList() {

        for (final item5 tmp : mylist) {
            mytext.append(tmp.toString() + "\n\n\n");

        }
    }
}
