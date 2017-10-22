package calc.mydukan.com.samplemvp.data;

/**
 * Created by rojesharunkumar on 21/10/17.
 */

public class DataManager {
    SharedPreferenceHelper sharedPreferenceHelper;

    public DataManager(SharedPreferenceHelper sharedPreferenceHelper) {
        this.sharedPreferenceHelper = sharedPreferenceHelper;
    }

    public void clear() {
        sharedPreferenceHelper.clear();
    }

    public String getEmail() {
        return sharedPreferenceHelper.getEmail();
    }

    public void setEmail(String email) {
        sharedPreferenceHelper.putEmail(email);
    }

    public boolean getLoginStatus() {
        return sharedPreferenceHelper.getLoggedInMode();
    }

    public void setLoginMode(boolean loginMode) {
        sharedPreferenceHelper.setLoggedInMode(loginMode);
    }
}
