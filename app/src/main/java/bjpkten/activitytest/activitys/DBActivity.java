package bjpkten.activitytest.activitys;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.litepal.LitePal;

import bjpkten.activitytest.R;
import bjpkten.activitytest.entity.Data;

public class DBActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_db);

        TextView viewById = (TextView) findViewById(R.id.db_textview);

        Data data = LitePal.find(Data.class, 2);
        String dataString = data.getData();
        viewById.setText(dataString);

    }
}
