package com.mpt.android.arrayadapterdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements
        AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listMainAndroid);

        String[] values = new String[]{
                "Android List View",
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android",
                "Android Example",
                "List View Source Code",
                "Simple List View In Android",
                "Create List View Android",
                "Android Example",
                "List View Source Code",
                "Simple List View In Android",
                "Create List View Android",
                "Android Example",
                "List View Source Code",
                "Simple List View In Android",
                "Create List View Android",
                "Android Example",
                "List View Source Code",
                "Simple List View In Android",
                "Create List View Android",
                "Android Example",
                "List View Source Code",
                "List View Array Adapter",
                "Android Example List View"
        };


        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,
                        android.R.layout.simple_list_item_1,
                        android.R.id.text1,
                        values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(MainActivity.this);

 ;


    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

        Toast.makeText(MainActivity.this, "Item clicked"+position, Toast.LENGTH_SHORT).show();





    }
}
