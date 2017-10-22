package calc.mydukan.com.samplemvp.ui.main;

import calc.mydukan.com.samplemvp.data.DataManager;
import calc.mydukan.com.samplemvp.ui.base.BasePresenter;

/**
 * Created by rojesharunkumar on 21/10/17.
 */

public class MainPresenter<T extends MainMvpView> extends BasePresenter<T> implements MainMvpPresenter<T> {
    protected MainPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public String getEmailId() {
        return getDataManager().getEmail();
    }

    @Override
    public void performLogOut() {
        getMvpView().showLoading();
        getDataManager().clear();
        getMvpView().logOutAndOpenSplashScreen();
    }

    @Override
    public void addHomeFragment() {
        getMvpView().showHomeFragment();
    }
}
