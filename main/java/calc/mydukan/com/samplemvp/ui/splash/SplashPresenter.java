package calc.mydukan.com.samplemvp.ui.splash;

import calc.mydukan.com.samplemvp.data.DataManager;
import calc.mydukan.com.samplemvp.ui.base.BasePresenter;

/**
 * Created by rojesharunkumar on 21/10/17.
 */

public class SplashPresenter<T extends SplashMVPView>
        extends BasePresenter<T> implements SplashMPVPresenter<T> {


    SplashPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void decideNextActivity() {
        if (getDataManager().getLoginStatus()) {
            getMvpView().openMainActivity();
        } else {
            getMvpView().openLoginActivity();
        }

    }
}
