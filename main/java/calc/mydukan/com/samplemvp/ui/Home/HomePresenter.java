package calc.mydukan.com.samplemvp.ui.Home;

import calc.mydukan.com.samplemvp.data.DataManager;
import calc.mydukan.com.samplemvp.ui.base.BasePresenter;

/**
 * Created by rojesharunkumar on 22/10/17.
 */

public class HomePresenter<T extends HomeMvpView>
        extends BasePresenter<T> implements HomeMvpPresenter<T> {


    protected HomePresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void fetchEmailAndImage() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }
}
