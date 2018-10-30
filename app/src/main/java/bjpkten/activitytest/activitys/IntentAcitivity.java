package bjpkten.activitytest.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import bjpkten.activitytest.R;

public class IntentAcitivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_acitivity);

        TextView viewById = (TextView) findViewById(R.id.result_intent);
        Intent intent = getIntent();
        String code = intent.getStringExtra("code");
        viewById.setText(code);
    }
}
