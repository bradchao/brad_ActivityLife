package brad.tw.activitylife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Page2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        Intent it = getIntent();
        int stage = it.getIntExtra("stage",-1);
        String user = it.getStringExtra("username");
        boolean sound = it.getBooleanExtra("sound",true);

        Log.d("brad", "Username:" + user);
        Log.d("brad", "Stage:" + stage);
        Log.d("brad", "Sound:" + (sound?"On":"Off"));


    }
}
