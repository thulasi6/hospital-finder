package com.example.miniproject;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sandhaipettai extends AppCompatActivity {
    TextView mytext;
    List<item8> mylist=new ArrayList<item8>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandhaipettai);

        mytext=findViewById(R.id.textView17);
        item8 itm=new item8(1,"F. S. Hospital Hospital");
        mylist.add(itm);

        item8 itm1=new item8(9,"Ragavendra Hospital");
        mylist.add(itm1);

        item8 itm2=new item8(6,"Kathiravan Hosipital");
        mylist.add(itm2);

        item8 itm3=new item8(5,"Om Sakthi Hospital");
        mylist.add(itm3);

        item8 itm4=new item8(2,"Narayana Hospital");
        mylist.add(itm4);
        Collections.sort(mylist);

        showList();
    }
    private void showList() {

        for (final item8 tmp : mylist) {
            mytext.append(tmp.toString() + "\n\n\n");

        }
    }
}
