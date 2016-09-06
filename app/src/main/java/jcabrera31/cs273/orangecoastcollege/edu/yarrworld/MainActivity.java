package jcabrera31.cs273.orangecoastcollege.edu.yarrworld;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button speakButton;
    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //restoring a previous state from user
        super.onCreate(savedInstanceState);

        //inflating! opting the layout called activity_main (activity_main.xml)
        setContentView(R.layout.activity_main);

        //link speakButton to the variable in our view
        speakButton = (Button) findViewById(R.id.speakButton);

        speakButton.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   //use the static reference Toast to display message
                   // Toast = vanishes after set amount of time
                   //dialog = requires user input.
                   Toast.makeText(
                           context,
                           R.string.toast_text,
                           Toast.LENGTH_LONG).show();
                       }
        }
        );
    }

}
