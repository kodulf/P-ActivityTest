package bjpkten.activitytest.activitys;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import org.litepal.tablemanager.Connector;

import bjpkten.activitytest.MyApplication;
import bjpkten.activitytest.R;
import bjpkten.activitytest.entity.Data;
import bjpkten.activitytest.entity.StaticDataClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SQLiteDatabase sqLiteDatabase = Connector.getDatabase();
    }

    public void jumpByBundle(View view) {
        //android 不同acitivity的传递值的方法一：
        Bundle bundle = new Bundle();
        bundle.putString("0101","我是通过bundle传递而来的");

        Intent intent = new Intent(this,BundlerActivity.class);
        intent.putExtra("bundle",bundle);
        startActivity(intent);
    }

    public void jumpByIntent(View view) {
        Intent intent = new Intent(this,IntentAcitivity.class);
        intent.putExtra("code","我是从Intent传过来的");
        startActivity(intent);
    }

    /**
     * 要先创建MyApplication,然后在清单文件中：application 里面添加android:name=".MyApplication"
     * @param view
     */
    public void jumpByApplication(View view) {
        MyApplication application = (MyApplication) getApplication();
        application.data = "我是通过Application 传递来的";
        Intent intent = new Intent(this,ApplicationActivity.class);
        startActivity(intent);

    }

    /**
     * 使用静态的类来传值
     * @param view
     */
    public void jumpByStatic(View view) {
        StaticDataClass.data = "我是从static类修改来的数据";
        Intent intent = new Intent(this,StaticActivity.class);
        startActivity(intent);
    }

    /**
     * 通过sharepreference 来设置
     * https://blog.csdn.net/Rodulf/article/details/50931475
     * @param view
     */
    public void jumpBySharePreference(View view) {
        SharedPreferences config_user = getSharedPreferences("config_user", MODE_PRIVATE);
        SharedPreferences.Editor edit = config_user.edit();
        edit.putString("username","我是从sharepreference传输的");
        edit.commit();


        Intent intent = new Intent(this,SharePreferenceActivity.class);
        startActivity(intent);

    }

    /**
     * 通过数据库来操作
     * @param view
     */
    public void jumpByDB(View view) {


        Data data = new Data();
        data.setData("我是存储在数据库里面的");
        data.setId(2);
        data.save();

        Intent intent = new Intent(this,DBActivity.class);
        startActivity(intent);
    }
}
