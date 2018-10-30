package bjpkten.activitytest.activitys;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import bjpkten.activitytest.R;
import bjpkten.activitytest.entity.StaticDataClass;

public class StaticActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_static);

        TextView viewById = (TextView) findViewById(R.id.static_textview);
        String data = StaticDataClass.data;
        viewById.setText(data);
    }
}
