package calc.mydukan.com.samplemvp.ui.main;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import calc.mydukan.com.samplemvp.BaseApplication.BaseApplication;
import calc.mydukan.com.samplemvp.R;
import calc.mydukan.com.samplemvp.data.DataManager;
import calc.mydukan.com.samplemvp.ui.Home.HomeFragment;
import calc.mydukan.com.samplemvp.ui.base.BaseActivity;
import calc.mydukan.com.samplemvp.ui.splash.SplashScreenActivity;

public class MainActivity extends BaseActivity implements MainMvpView {


    MainPresenter mainMvpPresenter;

    TextView logOutTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logOutTextView = (TextView) findViewById(R.id.lbl_logout);

        DataManager dataManager = ((BaseApplication) getApplication()).getDataManager();
        mainMvpPresenter = new MainPresenter(dataManager);
        mainMvpPresenter.onAttach(this);

        logOutTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainMvpPresenter.performLogOut();
            }
        });

        mainMvpPresenter.addHomeFragment();


    }

    public static Intent getIntent(Context context) {
        return new Intent(context, MainActivity.class);
    }

    @Override
    public void logOutAndOpenSplashScreen() {
        Intent intent = SplashScreenActivity.getStartIntent(this);
        startActivity(intent);
        finish();

    }

    @Override
    public void showHomeFragment() {
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.lyt_countainer, HomeFragment.newInstance(), HomeFragment.TAG)
                .commit();

    }


}
