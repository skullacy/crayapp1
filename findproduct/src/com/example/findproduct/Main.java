package com.example.findproduct;

import com.example.findproduct.Main;
import com.example.findproduct.R;
import com.example.findproduct.smap;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		//습득한 물건 등록버튼 클릭이벤트 등록
		Button regfindBtn = (Button) findViewById(R.id.regfind);
		regfindBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Main.this, smap.class);
				intent.putExtra("type", "find");
				startActivity(intent);
			}
		});
		
		//분실한 물건 등록버튼 클릭이벤트 등록
		Button reglostBtn = (Button) findViewById(R.id.reglost);
		reglostBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Main.this, smap.class);
				intent.putExtra("type", "lost");
				startActivity(intent);
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
