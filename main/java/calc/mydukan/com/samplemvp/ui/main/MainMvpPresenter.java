package calc.mydukan.com.samplemvp.ui.main;

import calc.mydukan.com.samplemvp.ui.base.MVPBasePresenter;

/**
 * Created by rojesharunkumar on 21/10/17.
 */

public interface MainMvpPresenter<T extends MainMvpView> extends MVPBasePresenter<T> {
    String getEmailId();

    void performLogOut();
}
