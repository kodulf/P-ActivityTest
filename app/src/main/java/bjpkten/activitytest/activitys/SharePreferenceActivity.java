package bjpkten.activitytest.activitys;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import bjpkten.activitytest.R;

public class SharePreferenceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_preference);

        TextView viewById = (TextView) findViewById(R.id.sharepreference_textview);

        SharedPreferences config_user = getSharedPreferences("config_user", MODE_PRIVATE);
        String string = config_user.getString("username", "error");

        viewById.setText(string);
    }
}
