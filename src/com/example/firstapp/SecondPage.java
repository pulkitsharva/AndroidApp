package com.example.firstapp;

import com.example.firstapp.MainActivity.PlaceholderFragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.EditText;
import android.widget.TextView;

public class SecondPage extends ActionBarActivity
{
	TextView textView1;

	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		try
		{
		System.out.println("Coming to sencond page");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_page_layout);
		textView1=(TextView)findViewById(R.id.newTextView1);
		textView1.setText("New Welcome Page");
		System.out.println("Value set");
		
		if (savedInstanceState == null) 
		{
			getSupportFragmentManager().beginTransaction().add(R.id.container, new PlaceholderFragment()).commit();
		}
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e.getMessage());
		}

	}
}
