package com.example.list_and_listview;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends Activity {

	private ListView lv;
	private Button BT;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		lv = (ListView)findViewById(R.id.listView1);
		BT = (Button)findViewById(R.id.BT1);
		
		BT.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String name = "hellowlist";
				ArrayList list = new ArrayList();    //list的用法
				for(int i=0;i<8;i++)
				{
				list.add(name + i);       //放入list
				}
				final ArrayAdapter adapter1 = new ArrayAdapter
						(MainActivity.this,android.R.layout.simple_list_item_1, list);
				//添加入listview
				lv.setAdapter(adapter1);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
