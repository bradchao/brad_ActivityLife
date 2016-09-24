package brad.tw.activitylife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Log.d("brad", "onCreate");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("brad", "onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("brad", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("brad", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("brad", "onPause");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("brad", "onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("brad", "onStop");
    }
}
