package calc.mydukan.com.samplemvp.ui.base;

/**
 * Created by rojesharunkumar on 21/10/17.
 */

public interface MVPBasePresenter<T extends MVPView > {
    void onAttach(T mvpView);
}
