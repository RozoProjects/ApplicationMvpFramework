package calc.mydukan.com.samplemvp.BaseApplication;

import android.app.Application;

import calc.mydukan.com.samplemvp.data.DataManager;
import calc.mydukan.com.samplemvp.data.SharedPreferenceHelper;

/**
 * Created by rojesharunkumar on 21/10/17.
 */

public class BaseApplication extends Application {
    private DataManager dataManager;

    @Override
    public void onCreate() {
        super.onCreate();
        SharedPreferenceHelper sharedPreferenceHelper = new SharedPreferenceHelper(getApplicationContext());
        dataManager = new DataManager(sharedPreferenceHelper);
    }

    public DataManager getDataManager() {
        return dataManager;
    }
}
