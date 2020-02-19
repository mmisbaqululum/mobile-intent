package id.ac.polinema.intent;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import model.user;

public class ProfileParcelableActivity extends AppCompatActivity {

    public static final String USER_KEY = "user";

    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);

        // TODO: bind here
        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            // TODO: display value here
            user data = getIntent().getParcelableExtra(USER_KEY);
            usernameText.setText(data.getUsername());
            nameText.setText(data.getName());
            ageText.setText(String.valueOf(data.getAge()));
        }
    }
}
