package com.example.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class SecondActivity extends BaseActivity {
	
	@Override
/*	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.second_layout);
		Intent intent = getIntent();
		String data = intent.getStringExtra("extra_data");
		Log.d("SecondActivity", data);
	}*/
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		//Log.d("SecondActivity", this.toString());
		Log.d("SecondActivity", "Task id is " + getTaskId());
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.second_layout);
		Button button2 = (Button) findViewById(R.id.button_2);
		button2.setOnClickListener(new OnClickListener(){
			@Override
			/*public void onClick(View v){
				Intent intent = new Intent();
				intent.putExtra("data_return", "Hello FirstActivity");
				setResult(RESULT_OK, intent);
				finish();
			}*/
			
			public void onClick(View v){
				Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
				startActivity(intent);
			}
		});
	}
	
	protected void onDestroy(){
		super.onDestroy();
		Log.d("SecondActivity", "onDestroy");
	}
	
	public void onBackPressed(){
		Intent intent = new Intent();
		intent.putExtra("data_return", "Hello ������");
		setResult(RESULT_OK, intent);
		finish();
	}
}
