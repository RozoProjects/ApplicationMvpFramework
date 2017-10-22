package calc.mydukan.com.samplemvp.ui.base;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;

import calc.mydukan.com.samplemvp.Utils.CommonUtils;

/**
 * Created by rojesharunkumar on 21/10/17.
 */

public class BaseActivity extends AppCompatActivity implements MVPView {
    private ProgressDialog progressDialog;

    @Override
    public void showLoading() {
        if (progressDialog == null) {
            progressDialog = CommonUtils.showLoadingDialog(this);
        }
        progressDialog.show();
    }

    @Override
    public void hideLoading() {
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }
}
