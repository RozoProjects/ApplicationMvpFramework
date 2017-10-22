package calc.mydukan.com.samplemvp.ui.base;

import calc.mydukan.com.samplemvp.data.DataManager;

/**
 * Created by rojesharunkumar on 21/10/17.
 */

public class BasePresenter<T extends MVPView> implements MVPBasePresenter<T> {

    private T mvpView;

    private DataManager dataManager;

    protected BasePresenter(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    @Override
    public void onAttach(T mvpView) {
        this.mvpView = mvpView;
    }

    public T getMvpView(){
        return mvpView;
    }
    public DataManager getDataManager() {
        return dataManager;
    }
}
