package calc.mydukan.com.samplemvp.ui.login;

import calc.mydukan.com.samplemvp.data.DataManager;
import calc.mydukan.com.samplemvp.ui.base.BasePresenter;

/**
 * Created by rojesharunkumar on 21/10/17.
 */

public class LoginPresenter<T extends LoginMVPView>
        extends BasePresenter<T> implements LoginMVPPresenter<T> {


    protected LoginPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void startLogin(String emailId) {
        getMvpView().showLoading();
        getDataManager().setEmail(emailId);
        getDataManager().setLoginMode(true);
        getMvpView().openMainActivity();

    }
}
