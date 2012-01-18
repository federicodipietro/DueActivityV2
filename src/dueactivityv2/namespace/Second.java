package dueactivityv2.namespace;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class Second extends Activity{
	@Override
	public void onCreate(Bundle savedInstanceState)
	{	super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		//**prendo il testo ricevuto dall'intent e setto la textView
		TextView label = (TextView)findViewById(R.id.textView2);
		String iltestoricevuto = getIntent().getExtras().getString("iltestonelbox");
		label.setText(iltestoricevuto);
	}
	@Override
	public void onStart()
	{
		super.onStart();
		Log.d("ON START","onStart");
	}
	@Override
	public void onRestart()
	{
		super.onRestart();
		Log.d("ON RESTART","onRestart");
	}
	@Override
	public void onResume()
	{
		super.onResume();
		Log.d("ON RESUME","onResume");
	}
	@Override
	public void onPause()
	{
		super.onPause();
		Log.d("ON PAUSE","onPause");
	}
	@Override
	public void onStop()
	{
		super.onStop();
		Log.d("ON STOP","onStop");
	}
	@Override
	public void onDestroy()
	{
		super.onDestroy();
		Log.d("ON DESTROY","onDestroy");
	}
}
