package brad.tw.activitylife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Log.d("brad", "onCreate");

    }

    @Override
    public void finish() {
        Log.d("brad", "finish");

        super.finish();

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
    public void test1(View v){
        Intent it = new Intent(this, Page2Activity.class);
        it.putExtra("username", "brad");
        it.putExtra("stage", 4);
        it.putExtra("sound", false);
        startActivity(it);
    }
    public void test2(View v){finish();}
    public void test3(View v){
        Intent it = new Intent(this, Page2Activity.class);
        it.putExtra("username", "brad");
        it.putExtra("stage", 4);
        it.putExtra("sound", false);

        //startActivity(it);
        startActivityForResult(it, 123);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        int key1 = data.getIntExtra("key1", -1);
        String key2 = data.getStringExtra("key2");
        Log.d("brad", "onActivityResult:" +resultCode );
        Log.d("brad", "key1:" +key1 );
        Log.d("brad", "key2:" +key2 );

    }
}
