package com.jiangtea.girdviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private GridView mGridView;
    //girdview数据
    private List<GvItem> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGridView = (GridView) findViewById(R.id.gridview);
        mGridView.setAdapter(new GvAdapter(this, mData));
        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this,"标题"+(position + 1),Toast.LENGTH_LONG).show();
                switch (position) {
                    case 0:
                        break;
                    case 1:
                        break;
                    default:
                        break;
                }
            }
        });
    }
}
