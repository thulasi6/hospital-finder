package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class chenthamani extends AppCompatActivity {

    TextView mytext1;
    List<item2> myList=new ArrayList<item2>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chenthamani);

        mytext1=findViewById(R.id.textView7);

        item2 itm=new item2(6,"Velammal Multispeciality Hospital");
        myList.add(itm);

        item2 itm1=new item2(4,"Thanvandri Hospital");
        myList.add(itm1);

        item2 itm2=new item2(5,"Ramya Hosipital");
        myList.add(itm2);

        item2 itm3=new item2(2,"Santhya Hospital");
        myList.add(itm3);

        item2 itm4=new item2(8,"Jayam Hospital");
        myList.add(itm4);

        Collections.sort(myList);

        showList();

    }
    private void showList() {

        for(final item2 tmp:myList)
        {
            mytext1.append(tmp.toString()+"\n\n\n");

        }

    }


}

