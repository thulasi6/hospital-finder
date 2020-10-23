package com.example.miniproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class annanagar extends AppCompatActivity {

    TextView myText,click1,click2;
    List<item> myList=new ArrayList<item>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annanagar);

        myText=findViewById(R.id.textView3);
        click1=(TextView)findViewById(R.id.clickaravind);
        click2=(TextView)findViewById(R.id.clickapollo);

        item itm=new item(2,"Aravind Eye Hospital");
        myList.add(itm);

        item itm1=new item(4,"Vickram Hospital");
        myList.add(itm1);

        item itm2=new item(3,"Apollo Hosipital");
        myList.add(itm2);

        item itm3=new item(7,"Kiruba Hospital");
        myList.add(itm3);

        item itm4=new item(5,"S. P. Hospital");
        myList.add(itm4);

        Collections.sort(myList);

        showList();

        click1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(annanagar.this,aravind.class));
            }
        });
    }

    private void showList() {

            for(final item tmp:myList)
            {
                myText.append(tmp.toString()+"\n\n\n");

            }

    }

}
