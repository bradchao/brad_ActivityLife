package brad.tw.activitylife;

import android.app.Application;
import android.util.Log;

/**
 * Created by user on 2016/9/24.
 */
public class BradApp extends Application {
    String var1;
    int var2;


    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("brad", "BradApp:onCreate()");

        var1 = "Brad";
        var2 = 123;;
    }
}
