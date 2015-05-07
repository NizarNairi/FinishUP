package innovation.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import innovation.tabsswipe.adapter.MainActivity;
import innovation.tabsswipe.adapter.done;

public class LoginActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        
       // TextView registerScreen = (TextView) findViewById(R.id.link_to_register);
        Button loginButton = (Button) findViewById(R.id.btnLogin);
        
        // Listening to register new account link
        /*registerScreen.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// Switching to Register screen
				Intent i = new Intent(getApplicationContext(), RegisterActivity.class);
				startActivity(i);


			}
		});*/

        // Listening to login
        loginButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // Switching to main screen
                Intent i = new Intent(getApplicationContext(), done.class);
                startActivity(i);
            }

        });
    }
}