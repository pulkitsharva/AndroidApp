package com.example.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends ActionBarActivity
{
	
	EditText editText1;
	Spinner spinner1;
	Button button1;
    String name,gender;
	   
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		editText1=(EditText) findViewById(R.id.editText1);
		spinner1=(Spinner) findViewById(R.id.spinner1);
		button1=(Button) findViewById(R.id.button1);
		
		
		button1.setOnClickListener(new OnClickListener(){
			   @Override
			   public void onClick(View arg0) 
			   {
				   switch(arg0.getId())
				    {
				    	case R.id.button1:
				    		name=editText1.getText().toString().trim();
				    		gender=spinner1.getSelectedItem().toString().trim();
				    		System.out.println("Name:"+name+", Gender:"+gender);
				    		Intent firstpage=new Intent(MainActivity.this,SecondPage.class);
				    	    startActivity(firstpage);
				    		
				    }

			   }
			});
		
		Spinner dropdown = (Spinner)findViewById(R.id.spinner1);
		String[] items = new String[]{"Male", "Female"};
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items);
		dropdown.setAdapter(adapter);
		if (savedInstanceState == null) 
		{
			getSupportFragmentManager().beginTransaction().add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

//		@Override
//		public View onCreateView(LayoutInflater inflater, ViewGroup container,
//				Bundle savedInstanceState) {
//			View rootView = inflater.inflate(R.layout.fragment_main, container,
//					false);
//			return rootView;
//		}
	}
	    
	
}
