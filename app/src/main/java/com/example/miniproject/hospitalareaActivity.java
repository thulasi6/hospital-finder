package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;

public class hospitalareaActivity extends AppCompatActivity {

    SearchView mySearchView;
    ListView myList;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitalarea);
        mySearchView=(SearchView) findViewById(R.id.searchView);
        myList=(ListView) findViewById(R.id.mylist);

        list=new ArrayList<String>();
        list.add("Anna Nagar");list.add("Arapalayam");list.add("Goripalayam");list.add("Thiru Nagar");list.add("Krishnapuram Colony");
        list.add("K. Pudur");list.add("Santhaipettai");list.add("Munisalai");list.add("Chinthamani");list.add("Uttankudi");

        adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list);
        myList.setAdapter(adapter);
        mySearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                validate(mySearchView.getQuery().toString());
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return true;
            }
        });
        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String s=String.valueOf(parent.getItemAtPosition(position));
                if (s.equals("Anna Nagar"))
                {
                    Intent i=new Intent(hospitalareaActivity.this,annanagar.class);
                    startActivity(i);
                }
                else if(s.equals("Arapalayam"))
                {
                    Intent i=new Intent(hospitalareaActivity.this,arapalayam.class);
                    startActivity(i);
                }
                else if(s.equals("Goripalayam"))
                {
                    Intent i=new Intent(hospitalareaActivity.this,koripalayam.class);
                    startActivity(i);
                }
                else if(s.equals("Thiru Nagar"))
                {
                    Intent i=new Intent(hospitalareaActivity.this,thirunagar.class);
                    startActivity(i);
                }
                else if(s.equals("Krishnapuram Colony"))
                {
                    Intent i=new Intent(hospitalareaActivity.this,krishnapuramcolony.class);
                    startActivity(i);
                }
                else if(s.equals("K. Pudur"))
                {
                    Intent i=new Intent(hospitalareaActivity.this,pudur.class);
                    startActivity(i);
                }
                else if(s.equals("Santhaipettai"))
                {
                    Intent i=new Intent(hospitalareaActivity.this,sandhaipettai.class);
                    startActivity(i);
                }
                else if(s.equals("Munisalai"))
                {
                    Intent i=new Intent(hospitalareaActivity.this,munisalai.class);
                    startActivity(i);
                }
                else if(s.equals("Chinthamani"))
                {
                    Intent i=new Intent(hospitalareaActivity.this,chenthamani.class);
                    startActivity(i);
                }
                else if(s.equals("Uttankudi"))
                {
                    Intent i=new Intent(hospitalareaActivity.this,ottankudi.class);
                    startActivity(i);
                }
            }
        });
    }
    public void validate(String name)
    {
        if (name.equals("Anna Nagar"))
        {
            Intent i=new Intent(hospitalareaActivity.this,annanagar.class);
            startActivity(i);
        }
        else if(name.equals("Arapalayam"))
        {
            Intent i=new Intent(hospitalareaActivity.this,arapalayam.class);
            startActivity(i);
        }
        else if(name.equals("Goripalayam"))
        {
            Intent i=new Intent(hospitalareaActivity.this,koripalayam.class);
            startActivity(i);
        }
        else if(name.equals("Thiru Nagar"))
        {
            Intent i=new Intent(hospitalareaActivity.this,thirunagar.class);
            startActivity(i);
        }
        else if(name.equals("Krishnapuram Colony"))
        {
            Intent i=new Intent(hospitalareaActivity.this,krishnapuramcolony.class);
            startActivity(i);
        }
        else if(name.equals("K. Pudur"))
        {
            Intent i=new Intent(hospitalareaActivity.this,pudur.class);
            startActivity(i);
        }
        else if(name.equals("Santhaipettai"))
        {
            Intent i=new Intent(hospitalareaActivity.this,sandhaipettai.class);
            startActivity(i);
        }
        else if(name.equals("Munisalai"))
        {
            Intent i=new Intent(hospitalareaActivity.this,munisalai.class);
            startActivity(i);
        }
        else if(name.equals("Chinthamani"))
        {
            Intent i=new Intent(hospitalareaActivity.this,chenthamani.class);
            startActivity(i);
        }
        else if(name.equals("Uttankudi"))
        {
            Intent i=new Intent(hospitalareaActivity.this,ottankudi.class);
            startActivity(i);
        }
    }
}