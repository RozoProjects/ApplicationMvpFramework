package calc.mydukan.com.samplemvp.ui.splash;

import calc.mydukan.com.samplemvp.ui.base.MVPBasePresenter;

/**
 * Created by rojesharunkumar on 21/10/17.
 */

public interface SplashMPVPresenter<T extends SplashMVPView> extends MVPBasePresenter<T>{

    void decideNextActivity();
}
