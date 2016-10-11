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
// create the grid item mapping
        String[] from = new String[] {"rowid", "col_1", "col_2", "col_3"};
        int[] to = new int[] { R.id.item1, R.id.item2, R.id.item3, R.id.item4 };
 
        // prepare the list of all records
        List<HashMap<String, String>> fillMaps = new ArrayList<HashMap<String, String>>();
        for(int i = 0; i < 10; i++){
            HashMap<String, String> map = new HashMap<String, String>();
            map.put("rowid", "" + i);
            map.put("col_1", "col_1_item_" + i);
            map.put("col_2", "col_2_item_" + i);
            map.put("col_3", "col_3_item_" + i);
            fillMaps.add(map);
        }


       // fill in the grid_item layout
        SimpleAdapter adapter = new SimpleAdapter(this, fillMaps, R.layout.simple_adpter_item, from, to);
        lv.setAdapter(adapter);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(MainActivity.this);

 


    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

        Toast.makeText(MainActivity.this, "Item clicked"+position, Toast.LENGTH_SHORT).show();





    }
}
