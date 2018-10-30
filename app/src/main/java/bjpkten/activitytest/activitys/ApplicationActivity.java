package bjpkten.activitytest.activitys;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import bjpkten.activitytest.MyApplication;
import bjpkten.activitytest.R;

public class ApplicationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application);

        TextView viewById = (TextView) findViewById(R.id.application_textView);
        String data = MyApplication.data;
        viewById.setText(data);
    }
}
