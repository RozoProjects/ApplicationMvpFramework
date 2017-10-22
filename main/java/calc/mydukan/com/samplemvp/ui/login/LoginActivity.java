package calc.mydukan.com.samplemvp.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import calc.mydukan.com.samplemvp.BaseApplication.BaseApplication;
import calc.mydukan.com.samplemvp.R;
import calc.mydukan.com.samplemvp.Utils.CommonUtils;
import calc.mydukan.com.samplemvp.data.DataManager;
import calc.mydukan.com.samplemvp.ui.base.BaseActivity;
import calc.mydukan.com.samplemvp.ui.main.MainActivity;
import calc.mydukan.com.samplemvp.ui.splash.SplashScreenActivity;

public class LoginActivity extends BaseActivity implements LoginMVPView {

    LoginPresenter loginPresenter;
    EditText editTextEmail;
    EditText editTextPassword;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        DataManager dataManager = ((BaseApplication) getApplication()).getDataManager();
        loginPresenter = new LoginPresenter(dataManager);
        loginPresenter.onAttach(this);

        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClick();
            }
        });


    }

    @Override
    public void openMainActivity() {
        Intent intent = MainActivity.getIntent(this);
        startActivity(intent);
        finish();

    }

    @Override
    public void onButtonClick() {
        String emailId = editTextEmail.getText().toString();
        String password = editTextPassword.getText().toString();

        if (!CommonUtils.isEmailValid(emailId)) {
            Toast.makeText(this, "Enter correct Email", Toast.LENGTH_LONG).show();
            return;
        }

        if (password == null || password.isEmpty()) {
            Toast.makeText(this, "Enter Password", Toast.LENGTH_LONG).show();
            return;
        }
        loginPresenter.startLogin(emailId);
    }

    public static Intent getIntent(SplashScreenActivity splashScreenActivity) {
        return new Intent(splashScreenActivity,LoginActivity.class);
    }
}
