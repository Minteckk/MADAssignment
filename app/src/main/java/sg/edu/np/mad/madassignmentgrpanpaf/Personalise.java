package sg.edu.np.mad.madassignmentgrpanpaf;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;


public class Personalise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalise);

        // get Intent
        Intent i = getIntent();
        // get Lecturer Name from Lecturer Login
        String lecUsername = i.getStringExtra("Username");

        // Shared Preferences
        SharedPreferences.Editor editor = 	getSharedPreferences("UsernameSP", MODE_PRIVATE).edit();
        editor.putString("Username", lecUsername);
        editor.apply();

        SharedPreferences prefs = 	getSharedPreferences("UsernameSP", MODE_PRIVATE);
        String value = prefs.getString("Username", "Lecturer");

        // set Onclick listener for back image view
        ImageView iv = findViewById(R.id.gen_back);
        // onClick listener for back button
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        //set Onclick listener for dark mode button
        Switch darkMode = findViewById(R.id.switch1);

        darkMode.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (darkMode.isChecked() == true)
                {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    darkMode.setText("Set Light Mode");
                }
                else if (darkMode.isChecked()==false)
                {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                }
            }
        });
    }
}