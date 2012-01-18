package dueactivityv2.namespace;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Main extends Activity 
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        /**prendo riferimento edittext.*/
        final EditText text = (EditText)findViewById(R.id.editText1);
        /**prendo riferimento buttonStart.*/
        Button buttonStart = (Button)findViewById(R.id.btnStart);
        /** creo funzione per lanciare la seconda activity.*/
        buttonStart.setOnClickListener(new OnClickListener()
        {
        	@Override
        	public void onClick(View V)
        	{
        		//*setto l'intent per aprire la seconda activity e per passare
        		//*il testo contenuto nell'edittext alla seconda activity.*/
        		Intent intent = new Intent(Main.this,Second.class);
        		String iltesto = text.getText().toString();
        		intent.putExtra("iltestonelbox",iltesto);
        		//**lancia la seconda activity.*/
        		startActivity(intent);
        	}
        });
    }
}