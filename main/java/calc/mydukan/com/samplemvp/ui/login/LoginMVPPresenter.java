package calc.mydukan.com.samplemvp.ui.login;

import calc.mydukan.com.samplemvp.ui.base.BasePresenter;
import calc.mydukan.com.samplemvp.ui.base.MVPBasePresenter;

/**
 * Created by rojesharunkumar on 21/10/17.
 */

public interface LoginMVPPresenter<T extends LoginMVPView> extends MVPBasePresenter<T> {

    void startLogin(String emailId);

}
