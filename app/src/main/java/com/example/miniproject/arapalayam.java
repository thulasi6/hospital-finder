package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arapalayam extends AppCompatActivity {

    TextView mytext1;
    List<item1> myList=new ArrayList<item1>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arapalayam2);

        mytext1=findViewById(R.id.textView5);

        item1 itm=new item1(5,"Dr. Agarwals Eye Hospital");
        myList.add(itm);

        item1 itm1=new item1(8,"Thembavani Hospital");
        myList.add(itm1);

        item1 itm2=new item1(3,"Rajamani Hosipital");
        myList.add(itm2);

        item1 itm3=new item1(2,"Jebam Hospital");
        myList.add(itm3);

        item1 itm4=new item1(1,"Victory Hospital");
        myList.add(itm4);

        Collections.sort(myList);

        showList();


    }
    private void showList() {

        for(final item1 tmp:myList)
        {
            mytext1.append(tmp.toString()+"\n\n\n");

        }

    }

}
