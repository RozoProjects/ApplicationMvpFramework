package calc.mydukan.com.samplemvp.ui.Home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import calc.mydukan.com.samplemvp.R;
import calc.mydukan.com.samplemvp.ui.base.BaseFragment;

/**
 * Created by rojesharunkumar on 22/10/17.
 */

public class HomeFragment extends BaseFragment implements HomeMvpView {
    public static final String TAG = "HomeFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.sample, container, false);
    }


    @Override
    public void displayEmailandImage() {

    }


    public static Fragment newInstance() {
        Bundle args = new Bundle();
        HomeFragment fragment = new HomeFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
