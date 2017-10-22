package calc.mydukan.com.samplemvp.ui.base;

import android.app.ProgressDialog;
import android.support.v4.app.Fragment;

import calc.mydukan.com.samplemvp.Utils.CommonUtils;

/**
 * Created by rojesharunkumar on 22/10/17.
 */

public class BaseFragment extends Fragment implements MVPView{
    private ProgressDialog progressDialog;

    @Override
    public void showLoading() {
        if (progressDialog == null) {
            progressDialog = CommonUtils.showLoadingDialog(getActivity());
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
