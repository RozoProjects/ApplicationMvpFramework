package calc.mydukan.com.samplemvp.ui.base;

/**
 * Created by rojesharunkumar on 21/10/17.
 */

/**
 * Base interface that any class that wants to act as a View in the MVP (Model View Presenter)
 * pattern must implement. Generally this interface will be extended by a more specific interface
 * that then usually will be implemented by an Activity or Fragment.
 */

public interface MVPView {

    void showLoading();

    void hideLoading();

}
