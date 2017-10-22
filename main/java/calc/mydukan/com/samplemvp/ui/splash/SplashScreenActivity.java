package calc.mydukan.com.samplemvp.ui.splash;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import calc.mydukan.com.samplemvp.BaseApplication.BaseApplication;
import calc.mydukan.com.samplemvp.data.DataManager;
import calc.mydukan.com.samplemvp.ui.base.BaseActivity;
import calc.mydukan.com.samplemvp.ui.login.LoginActivity;
import calc.mydukan.com.samplemvp.ui.main.MainActivity;

/**
 * Created by rojesharunkumar on 21/10/17.
 */

public class SplashScreenActivity extends BaseActivity implements SplashMVPView {

    SplashPresenter splashMPVPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataManager dataManager = ((BaseApplication) getApplication()).getDataManager();
        // View will interact with presenter

        splashMPVPresenter = new SplashPresenter(dataManager);
        splashMPVPresenter.onAttach(this);
        splashMPVPresenter.decideNextActivity();

    }

    @Override
    public void openMainActivity() {
        Intent mainIntent = MainActivity.getIntent(this);
        startActivity(mainIntent);
        finish();

    }

    @Override
    public void openLoginActivity() {
        Intent loginIntent = LoginActivity.getIntent(this);
        startActivity(loginIntent);
        finish();

    }

    public static Intent getStartIntent(MainActivity mainActivity) {
        return new Intent(mainActivity,SplashScreenActivity.class);
    }
}
