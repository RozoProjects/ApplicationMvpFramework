package calc.mydukan.com.samplemvp.ui.base;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import calc.mydukan.com.samplemvp.Utils.CommonUtils;

/**
 * Created by rojesharunkumar on 22/10/17.
 */

public abstract class BaseFragment extends Fragment implements MVPView {
    private ProgressDialog progressDialog;
    private BaseActivity mActivity;

    public interface CallBack {
        void onFragmentAttached();

        void onFragmentDetached(String tag);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mActivity = (BaseActivity) context;
    }

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
