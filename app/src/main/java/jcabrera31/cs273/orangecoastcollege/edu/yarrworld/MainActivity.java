package jcabrera31.cs273.orangecoastcollege.edu.yarrworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button speakButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //inflating! opting the layout called activity_main (activity_main.xml)
        setContentView(R.layout.activity_main);

        //link speakButton to the variable in our view
        speakButton = (Button) findViewById(R.id.speakButton);

        speakButton.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Toast.makeText(getApplicationContext(),
                           R.string.toast_text,
                           Toast.LENGTH_LONG).show();
                       }
        }
        );
    }

}
