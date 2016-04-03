package org.me.myandroidstuff;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class RadioButtontestActivity extends Activity implements OnClickListener
{
	private RadioGroup colourGroup;
	private RadioButton redButton;
	private RadioButton greenButton;
	private RadioButton blueButton;
	private View mainView;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        mainView = (View)findViewById(R.id.mainView);
        
        colourGroup = (RadioGroup)findViewById(R.id.colourRadioGroup);
        redButton = (RadioButton)findViewById(R.id.redRadio);
        greenButton = (RadioButton)findViewById(R.id.greenRadio);
        blueButton = (RadioButton)findViewById(R.id.blueRadio);
        
        // Set the initially selected radio button and 
        // set the background accordingly
        redButton.toggle();
        mainView.setBackgroundColor(Color.RED);
        
        redButton.setOnClickListener(this);
        greenButton.setOnClickListener(this);
        blueButton.setOnClickListener(this);
               
        colourGroup.setEnabled(true);
        
    }
    
	@Override
	public void onClick(View arg0) 
	{
		// TODO Auto-generated method stub
		if (redButton.isChecked())
		{
			mainView.setBackgroundColor(Color.RED);
		}
		else
			if (greenButton.isChecked())
			{
				//mainView.setBackgroundColor(Color.GREEN);
				mainView.setBackgroundColor(Color.parseColor("#96ff96"));
			}
			else
				if (blueButton.isChecked())
				{
					mainView.setBackgroundColor(Color.BLUE);
				}
		
	}
}