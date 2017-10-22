package calc.mydukan.com.samplemvp.ui.Home;

import calc.mydukan.com.samplemvp.ui.base.MVPView;

/**
 * Created by rojesharunkumar on 22/10/17.
 */

public interface HomeMvpPresenter<T extends HomeMvpView> extends MVPView{
    void fetchEmailAndImage();
}
