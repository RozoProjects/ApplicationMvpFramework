package calc.mydukan.com.samplemvp.data;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by rojesharunkumar on 21/10/17.
 */

public class SharedPreferenceHelper {

    private static final String MY_PREFS = "my_prefs";

    private static final String EMAIL = "email";

    SharedPreferences sharedPreferences;

    public SharedPreferenceHelper(Context context) {
        sharedPreferences = context.getSharedPreferences(MY_PREFS, Context.MODE_PRIVATE);
    }

    public void clear() {
        sharedPreferences.edit().clear().apply();
    }

    public void putEmail(String email) {
        sharedPreferences.edit().putString(EMAIL, email).apply();
    }

    public String getEmail() {
        return sharedPreferences.getString(EMAIL, null);
    }

    public void setLoggedInMode(boolean isloggedin) {
        sharedPreferences.edit().putBoolean("IS_LOGGED_IN", isloggedin).apply();
    }

    public boolean getLoggedInMode() {
       return sharedPreferences.getBoolean("IS_LOGGED_IN", false);
    }

}
